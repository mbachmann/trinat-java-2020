//Mischa Kissling
//08/2020

package ch.trinat.edu.etutorial.p02.ex01;

public class Fluggesellschaft {

	public static void main(String[] args) {
		//Lange Variante
		//Flugzeug a320;
		//a320 = new Flugzeug();
		
		Flugzeug[] airline= new Flugzeug[5];
		for (int i = 0; i < 5; i++){
		    airline[i] = new Flugzeug();
		}
		
		//Airbus 320
		Flugzeug a320 = new Flugzeug();
		//a320.bezeichnung = "Airbus A320";
		airline[0].bezeichnung = "A-320";
		airline[0].idNummer = 1;
		airline[0].sitze = 165;
		airline[0].geschwindigkeit = 890;
		airline[0].reichweite = 12600;
		
		//Boeing 747
		Flugzeug b747 = new Flugzeug();
		//b747.bezeichnung = "Boeing 747";
		airline[1].bezeichnung = "B-747";
		airline[1].idNummer = 2;
		airline[1].sitze = 436;
		airline[1].geschwindigkeit = 907;
		airline[1].reichweite = 13700;
		
		//AVRO RJ85
		Flugzeug avro85 = new Flugzeug();
		//avro85.bezeichnung = "Avro RJ85";
		airline[2].bezeichnung = "AVRO-RJ85";
		airline[2].idNummer = 3;
		airline[2].sitze = 93;
		airline[2].geschwindigkeit = 760;
		airline[2].reichweite = 2200;
		
		//Airbus 380
		Flugzeug a380 = new Flugzeug();
		//a380.bezeichnung = "Airbus A380";
		airline[3].bezeichnung = "A-380";
		airline[3].idNummer = 4;
		airline[3].sitze = 516;
		airline[3].geschwindigkeit = 907;
		airline[3].reichweite = 12000;
		
		//Airbus 380 Business
		Flugzeug a380B = new Flugzeug();
		//a380B.bezeichnung = "Airbus A380 Business";
		airline[4].bezeichnung = "A-380-Business";
		airline[4].idNummer = 5;
		airline[4].sitze = 409;
		airline[4].geschwindigkeit = airline[3].geschwindigkeit;
		airline[4].reichweite = airline[3].reichweite;
		
		//------------------------------------------------------------------------------
		//ALTE VARIANTE
		
		//Airbus 320
		//double zeitA320 = a320.getTime(6330);
		//int capacityA320 = a320.getCapacity(365);
		
		//Boeing 747
		//double zeitB747 = b747.getTime(6330);
		//int capacityB747 = b747.getCapacity(365);
		
		//AVRO RJ85
		//double zeitAVRO85 = avro85.getTime(6330);
		//int capacityAVRO85 = avro85.getCapacity(365);
		
		//Airbus A380
		//double zeitA380 = a380.getTime(6330);
		//int capacityA380 = a380.getCapacity(365);
		
		//Airbus A380 Business
		//double zeitA380B = a380B.getTime(6330);
		//int capacityA380B = a380B.getCapacity(365);
		
		//a320.printInfo();
		//System.out.println("Dauer: " + Math.round(zeitA320*100.00)/100.00 + " h");
		//System.out.println("Kapazität: " + capacityA320 + " Passagiere pro Jahr");
		//zeilenumbruch();
		//b747.printInfo();
		//System.out.println("Dauer: " + Math.round(zeitB747*100.00)/100.00 + " h");
		//System.out.println("Kapazität: " + capacityB747 + " Passagiere pro Jahr");
		//zeilenumbruch();
		//avro85.printInfo();
		//System.out.println("Dauer: " + Math.round(zeitAVRO85*100.00)/100.00 + " h");
		//System.out.println("Kapazität: " + capacityAVRO85 + " Passagiere pro Jahr");
		//zeilenumbruch();
		//a380.printInfo();
		//System.out.println("Dauer: " + Math.round(zeitA380*100.00)/100.00 + " h");
		//System.out.println("Kapazität: " + capacityA380 + " Passagiere pro Jahr");
		//zeilenumbruch();
		//a380B.printInfo();
		//System.out.println("Dauer: " + Math.round(zeitA380B*100.00)/100.00 + " h");
		//System.out.println("Kapazität: " + capacityA380B + " Passagiere pro Jahr");
		//zeilenumbruch();
		//------------------------------------------------------------------------------
		
		//ERSETZT DURCH:
		
		for (int i=0 ; i<5 ; i++) {
			airline[i].printInfo();
			double time = airline[i].getTime(6330);
			System.out.println("Dauer: " + time + " Stunden");
			int capacity = airline[i].getCapacity(365);
			System.out.println("Kapazität: " + capacity + " Passagiere pro Jahr");
			zeilenumbruch();
		}
		
	}
	
	public static void zeilenumbruch() {
		System.out.println();
	}

}