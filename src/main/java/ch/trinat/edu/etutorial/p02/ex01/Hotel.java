package ch.trinat.edu.etutorial.p02.ex01;

public class Hotel {

	// Attribute
	String name;
	int floors, roomsPerFloor, occupancy;// Stöcke, Zimmern/Stock, # besetzte Zimmern

	// # freien Zimmern
	int getRooms() {
		int freeRooms = 0;
		freeRooms = floors * roomsPerFloor - occupancy;
		return freeRooms;
	}

	// +1 Zimmer besetzt
	boolean checkIn() {
		boolean checkInOk;
		if (getRooms() > 0) {
			checkInOk = true;
			occupancy++;
			System.out.println("Rooms still available: Check-in successful.");
		} else {
			checkInOk = false;
			System.out.println("All rooms are full: Check-in denied.");
		}
		return checkInOk;
	}

	// +1 Zimmer frei
	boolean checkOut() {
		boolean checkOutOk;
		if (getRooms() == floors * roomsPerFloor) {
			System.out.println("All rooms free: Nobody to check out.");
			checkOutOk = false;
		} else {
			checkOutOk = true;
			occupancy--;
			System.out.println("Check-out successful.");
		}
		return checkOutOk;
	}

	// # Zimmern (frei & besetzt)
	void printInfo() {
		System.out.println(name + ": " + getRooms() + " of " + floors * roomsPerFloor + " rooms free");
	}
}
