package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class Zinseszins_mit_Schleifen {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		double Geld_Konto;
		double Protzent;
		double Kontostand;
		double Zins;
		int Jahren;
		int Jahr;
			
		System.out.println("Was liegt auf ihrem konto ?");
		Geld_Konto = eingabe.nextDouble();
			
		System.out.println("Wie viel Protzent ?");
		Protzent = eingabe.nextDouble();
			
		System.out.println("Wie viel Jahren ?");
		Jahren = eingabe.nextInt();
				
		Protzent = 1 + Protzent / 100;
				
		for (int i=0; i<Jahren; i++) {
			Jahr = i + 1;
			Kontostand = Math.round(Geld_Konto * Protzent * 100)/100.0;
			Zins = Math.round((Kontostand - Geld_Konto)*100)/100.0;
					
			System.out.println("Im " + Jahr + " Jahr gibt es " + Zins + " Fr. Zins. Neuer Kontostand: " + Kontostand + " Fr.");
					
			Geld_Konto = Kontostand;
		}
	}
}
	

