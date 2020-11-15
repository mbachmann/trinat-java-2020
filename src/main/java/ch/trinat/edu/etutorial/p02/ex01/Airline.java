package ch.trinat.edu.etutorial.p02.ex01;

public class Airline {

	public static void main(String[] args) {

		/*
		 * // Deklarierung = Referenzen! => Airplane a320; Airplane b747; Airplane
		 * avro85; Referenz: Datentyp/Name Classe => Das neue Objekt wird dann in
		 * Variable gespeichert mit new
		 */

		// Erstellung & Hinfügen eines neuen Objekts
		Airplane a320 = new Airplane();
		Airplane b747 = new Airplane();
		Airplane avro85 = new Airplane();
		Airplane a380 = new Airplane();
		Airplane a380B = new Airplane(); // wenn man nur eine Kopie ohne new mach kopiiert man nur die Ref.!

		// Attributen
		a320.name = "Airbus 320"; // "Airbus 320" ist zugewiesen an der Attribut name (der Referenz Airline a320)
		a320.idNumber = 1;
		a320.seats = 165;
		a320.speed = 890.00;
		a320.range = 12600.00;

		b747.name = "Boeing 747";
		b747.idNumber = 2;
		b747.seats = 436;
		b747.speed = 907.00;
		b747.range = 13700.00;

		avro85.name = "Avro RJ85";
		avro85.idNumber = 3;
		avro85.seats = 93;
		avro85.speed = 760.00;
		avro85.range = 2200.00;

		a380.name = "Airbus 380";
		a380.idNumber = 4;
		a380.seats = 516;
		a380.speed = 907.00;
		a380.range = 12000.00;

		a380B.name = "Airbus 380-B";
		a380B.idNumber = 5;
		a380B.seats = 409;
		a380B.speed = a380.speed;
		a380B.range = a380.range;

		a320.printInfo();
		double timeA320 = 0; // Variablen zum speichern der Zeit
		timeA320 = a320.getTime(6330);
		System.out.println("Duration: " + Math.round(timeA320 * 100) / 100.0 + " hours to cover 6330 km");
		int yearlyCapacityA320 = a320.getCapacity(365);
		System.out.println("Capacity: " + yearlyCapacityA320 + " passengers/year");

		b747.printInfo();
		double timeB747 = 0;
		timeB747 = b747.getTime(6330);
		System.out.println("Duration: " + Math.round(timeB747 * 100) / 100.0 + " hours to cover 6330 km");
		int yearlyCapacityB747 = b747.getCapacity(365);
		System.out.println("Capacity: " + yearlyCapacityB747 + " passengers/year");

		avro85.printInfo();
		double timeAvro85 = 0;
		timeAvro85 = avro85.getTime(6330);
		System.out.println("Duration: " + Math.round(timeAvro85 * 100) / 100.0 + " hours to cover 6330 km");
		int yearlyCapacityAvro85 = avro85.getCapacity(365);
		System.out.println("Capacity: " + yearlyCapacityAvro85 + " passengers/year");

		a380.printInfo();
		double timeA380 = 0;
		timeA380 = a380.getTime(6330);
		System.out.println("Duration: " + Math.round(timeA380 * 100) / 100.0 + " hours to cover 6330 km");
		int yearlyCapacityA380 = a380.getCapacity(365);
		System.out.println("Capacity: " + yearlyCapacityA380 + " passengers/year");

		a380B.printInfo();
		double timeA380B = 0;
		timeA380B = a380B.getTime(6330);
		System.out.println("Duration: " + Math.round(timeA380B * 100) / 100.0 + " hours to cover 6330 km");
		int yearlyCapacityA380B = a380B.getCapacity(365);
		System.out.println("Capacity: " + yearlyCapacityA380B + " passengers/year");

	}

}
