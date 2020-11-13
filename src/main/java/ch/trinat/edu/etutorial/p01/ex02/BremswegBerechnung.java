package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class BremswegBerechnung {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		float Geschwindigkeit;
		float Anhalteweg;
		float Reaktionsweg;
		float Bremsweg;
		
		System.out.println("Geben sie die Geschwindikeit in km/h ein :");
		Geschwindigkeit = eingabe.nextFloat();
		
		Reaktionsweg = Math.round(3 * (Geschwindigkeit / 10 * 100)/100.0);
		
		Bremsweg = (Geschwindigkeit/10) * (Geschwindigkeit/10);
		
		Anhalteweg = Reaktionsweg + Bremsweg;
		
		System.out.println("Bei " + Geschwindigkeit + " km/h :");
		System.out.println("Den Reaktionsweg ist " + Reaktionsweg + " m");
		System.out.println("Den Bremsweg ist " + Bremsweg + " m");
		System.out.println("Den Anhalteweg ist " + Anhalteweg + " m");
		
		eingabe.close();
	}

}
