package ch.trinat.edu.etutorial.p02.ex01;

public class Airline_array {

	public static void main(String[] args) {

		Airplane[] Airline = new Airplane[5];
		for (int i = 0; i < 5; i++) {
			Airline[i] = new Airplane();
		}

		// Attributen
		Airline[0].name = "Airbus 320";
		Airline[0].idNumber = 1;
		Airline[0].seats = 165;
		Airline[0].speed = 890.00;
		Airline[0].range = 12600.00;

		Airline[1].name = "Boeing 747";
		Airline[1].idNumber = 2;
		Airline[1].seats = 436;
		Airline[1].speed = 907.00;
		Airline[1].range = 13700.00;

		Airline[2].name = "Avro RJ85";
		Airline[2].idNumber = 3;
		Airline[2].seats = 93;
		Airline[2].speed = 760.00;
		Airline[2].range = 2200.00;

		Airline[3].name = "Airbus 380";
		Airline[3].idNumber = 4;
		Airline[3].seats = 516;
		Airline[3].speed = 907.00;
		Airline[3].range = 12000.00;

		Airline[4].name = "Airbus 380-B";
		Airline[4].idNumber = 5;
		Airline[4].seats = 409;
		Airline[4].speed = Airline[3].speed;
		Airline[4].range = Airline[3].range;

		for (int i = 0; i < 5; i++) {
			Airline[i].printInfo();
			double timeAirline = Airline[i].getTime(6330);// Speichern der Zeit
			System.out.print("Duration: " + Math.round(timeAirline * 100) / 100.0 + " hours to cover 6330 km");
			int yearlyCapacityAirline = Airline[i].getCapacity(365);
			System.out.print(" -- ");
			System.out.println("Capacity: " + yearlyCapacityAirline + " passengers/year");
		}

	}

}
