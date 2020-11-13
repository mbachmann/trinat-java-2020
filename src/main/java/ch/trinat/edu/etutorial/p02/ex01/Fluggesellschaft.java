package ch.trinat.edu.etutorial.p02.ex01;

import java.util.Scanner;

public class Fluggesellschaft {
	
	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		Flugzeug[] airline = new Flugzeug[5];
		
		for(int i =0; i <5 ; i++ ) {
			airline[i] = new Flugzeug(); 
		}
		
		

	/*	Flugzeug a320;
		Flugzeug b747;
		Flugzeug avro85;
		Flugzeug a380 = new Flugzeug();
		Flugzeug a380B = new Flugzeug();  
		
		a320 = new Flugzeug();
		b747 = new Flugzeug();
		avro85 = new Flugzeug();*/
		
		
		
		airline[0].bezeichnung = "Airbus 320";
		airline[0].idNummer = 1;
		airline[0].sitze = 165;
		airline[0].geschwindigkeit = 890;
		airline[0].reichweite = 12600;
		
		
		airline[1].bezeichnung = "Boeing 747";
		airline[1].idNummer = 2;
		airline[1].sitze = 436;
		airline[1].geschwindigkeit = 907;
		airline[1].reichweite = 13700;
		
		airline[2].bezeichnung = "Avro RJ85";
		airline[2].idNummer = 3;
		airline[2].sitze = 93;
		airline[2].geschwindigkeit = 760 ; 
		airline[2].reichweite = 2200;
		
		
		airline[3].bezeichnung = "Airbus 380";
		airline[3].idNummer = 4;
		airline[3].sitze = 516;
		airline[3].geschwindigkeit = 907;
		airline[3].reichweite = 12000;
		
		airline[4].bezeichnung = "Airbus 380B";
		airline[4].idNummer = 5; 
		airline[4].geschwindigkeit = airline[3].geschwindigkeit; //a380.geschwindigkeit;
		airline[4].reichweite = airline[3].reichweite; // a380.reichweite;
		airline[4].sitze = 409;
		
		for (int j = 0; j < 5; j++){
		    airline[j].printinfo();
		    double time = airline[j].getTime(6330.0);
		    System.out.println("Dauer: " + Math.round(time*10) / 10.0 + " h");
		    int cap = airline[j].getCapacity(365);
		    System.out.println("Kapazität: " + cap + " Passagiere/Jahr");
		}
		
		
	/*	double zeitA320 = a320.getTime(6330.00);
		int capacityA320 = a320.getCapacity(365);
		a320.printinfo();
		System.out.println("Dauer : " + Math.round(zeitA320*10) / 10.0 + "h");
		System.out.println("Kapazität : " + capacityA320 + " Passagiere/Jahr");
		
		double zeitB747 = b747.getTime(6330.00);
		int capacityB747 = b747.getCapacity(365);
		b747.printinfo();
		System.out.println("Dauer : " + Math.round(zeitB747*10) / 10.0 + "h");
		System.out.println("Kapazität : " + capacityB747 + " Passagiere/Jahr");
		
		double zeitAVRO85 = avro85.getTime(6330.00);
		int capacityAVRO85 = avro85.getCapacity(365);
		avro85.printinfo();
		System.out.println("Dauer : " + Math.round(zeitAVRO85*10) / 10.0 + "h");
		System.out.println("Kapazität : " + capacityAVRO85 + " Passagiere/Jahr");
		
		double zeitA380 = a380.getTime(6330.00);
		int capacityA380 = a380.getCapacity(365);
		a380.printinfo();
		System.out.println("Dauer : " + Math.round(zeitA380*10) / 10.0 + "h");
		System.out.println("Kapazität : " + capacityA380 + " Passagiere/Jahr");
		
		double zeitA380B = a380B.getTime(6330.00);
		int capacityA380B = a380B.getCapacity(365);
		a380B.printinfo();
		System.out.println("Dauer : " + Math.round(zeitA380B*10) / 10.0 + "h");
		System.out.println("Kapazität : " + capacityA380B + " Passagiere/Jahr");*/

	}
}