package ch.trinat.edu.etutorial.p02.ex02;

public class HolidayResort2 {

	public static void main(String[] args) {
		Hotel2[] HolidayResort = new Hotel2[3];
		for (int i = 0; i < 3; i++) {
			HolidayResort[i] = new Hotel2();
		}

		// initialisierung der Attribute mit Setter
		HolidayResort[0].setName("Hotel Vertiginous");
		HolidayResort[0].setFloors(10);
		HolidayResort[0].setRoomsPerFloor(4);
		HolidayResort[0].setOccupancy(20); // 50% besetzt

		// Initialisierung mit Parametrisierten Konstruktor
		HolidayResort[1] = new Hotel2("Hotel Cube", 6, 6);
		HolidayResort[2] = new Hotel2("Hotel Flatland", 4, 10);

	}

}
