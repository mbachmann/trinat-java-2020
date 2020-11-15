package ch.trinat.edu.etutorial.p02.ex01;

public class HolidayResort {

	public static void main(String[] args) {
		Hotel[] HolidayResort = new Hotel[3];
		for (int i = 0; i < 3; i++) {
			HolidayResort[i] = new Hotel();
		}

		// initialisierung der Attribute
		HolidayResort[0].name = "Hotel Vertiginous";
		HolidayResort[0].floors = 10;
		HolidayResort[0].roomsPerFloor = 4;
		HolidayResort[0].occupancy = 20; // 50% besetzt

		HolidayResort[1].name = "Hotel Cube";
		HolidayResort[1].floors = 6;
		HolidayResort[1].roomsPerFloor = 6;
		HolidayResort[1].occupancy = 36; // alles besetzt

		HolidayResort[2].name = "Hotel Flatland";
		HolidayResort[2].floors = 4;
		HolidayResort[2].roomsPerFloor = 10;
		HolidayResort[2].occupancy = 0;// alles frei

		// Kontrolle Standard Ablauf
		HolidayResort[0].printInfo();
		HolidayResort[0].checkIn();
		HolidayResort[0].printInfo();
		HolidayResort[0].checkOut();
		HolidayResort[0].printInfo();

		// Kontrolle check-in = false
		HolidayResort[1].printInfo();
		HolidayResort[1].checkIn();
		HolidayResort[1].printInfo();

		// Kontrolle check-out = false
		HolidayResort[2].printInfo();
		HolidayResort[2].checkOut();
		HolidayResort[2].printInfo();

	}

}
