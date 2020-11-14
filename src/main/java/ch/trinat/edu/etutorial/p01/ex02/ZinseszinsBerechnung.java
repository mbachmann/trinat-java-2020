package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class ZinseszinsBerechnung {

	public static void main(String[] args) {
		Scanner eingabe1 = new Scanner(System.in);
		Scanner eingabe2 = new Scanner(System.in);
		double Geld_Konto;
		double Protzent;
		double Kontostand;
		double Zins;
		int Jahr;
		
		System.out.println("Was liegt auf ihrem konto ?");
		Geld_Konto = eingabe1.nextDouble();
		
		System.out.println("Wie viel Protzent ?");
		Protzent = eingabe2.nextDouble();
		
		Protzent = 1 + Protzent / 100;
		
		for (int i=0; i<10; i++) {
			Jahr = i + 1;
			Kontostand = Math.round(Geld_Konto * Protzent * 100)/100.0;
			Zins = Math.round((Kontostand - Geld_Konto)*100)/100.0;
			
			System.out.println("Im " + Jahr + " Jahr gibt es " + Zins + " Fr. Zins. Neuer Kontostand: " + Kontostand + " Fr.");
			
			Geld_Konto = Kontostand;
		}
		
	}

}
