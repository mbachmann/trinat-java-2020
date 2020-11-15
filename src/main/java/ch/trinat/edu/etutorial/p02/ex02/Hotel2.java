package ch.trinat.edu.etutorial.p02.ex02;

public class Hotel2 {

	// Attribute
	private String name;
	private int floors, roomsPerFloor, occupancy;// Stöcke, Zimmern/Stock, # besetzte Zimmern

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

	// Default Kontruktor - ruft parametrisierten Konstr.
	public Hotel2() {
		this("", 0, 0);
	}

	// Parametrisierten Konstruktor
	public Hotel2(String n, int f, int r) {
		this.name = n;
		this.floors = f;
		this.roomsPerFloor = r;
		this.occupancy = 0;
	}

	// Getters & Setters
	/*
	 * Getters sind hier nicht nötig: die Methoden bisher benutzt geben alle Infos.
	 * Die setters eigentlich auch nicht, wenn man mit den Parametrisierten
	 * Kontruktor arbeitet - Normalablauf behaltet die korrekte werte für Zimmern++
	 * & --. Setter für name kann nützlich sein, aber man kann davon ausgehen, dass
	 * es nicht plötzlich neuen Zimmern oder Stöcke dazu kommen. Und falls das
	 * passiert kann man einfach ein neues Hotel erzeugen (achtung mit den
	 * Array-Länge!) & setOccupancy verwenden. Objekte reflektieren die Realität!
	 * 
	 */
	public String getName() { // nicht nötig
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloors() { // nicht nötig
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getRoomsPerFloor() { // nicht nötig
		return roomsPerFloor;
	}

	public void setRoomsPerFloor(int roomsPerFloor) {
		this.roomsPerFloor = roomsPerFloor;
	}

	public int getOccupancy() { // nicht nötig
		return occupancy;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
}
