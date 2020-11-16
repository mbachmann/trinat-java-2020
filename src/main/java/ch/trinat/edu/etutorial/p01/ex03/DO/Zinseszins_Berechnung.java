package ch.trinat.edu.etutorial.p01.ex03.DO;


import java.util.Scanner;

public class Zinseszins_Berechnung {

	public static void main(String[] args) {
		// Programm das Zinsen aussrechnett
	
		String newLine = System.getProperty("line.separator");
		Scanner eingabe = new Scanner(System.in);
		Scanner eingabe1 = new Scanner(System.in);
		Scanner eingabe2 = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie an wieviele Jahre Sie ihr Geld in unserer Bank angelegt haben: ");
		int Jahr = eingabe.nextInt(); // variabel vom jahr  
		
		System.out.print("Bitte geben Sie an wieviel Geld sie am Anfang angelegt haben: ");
		double Geld = eingabe1.nextDouble(); // variabel von Basis-Geld
		
		System.out.print("Bitte geben Sie an wieviele Zinsen pro Jahr sie gew�hlt haben (in %): ");
		double Zins = eingabe2.nextDouble(); // variabel von den zinsen in laufe der jahren
		
		for (int a = 1; a<=Jahr; a++ ) {
		double Geld_new = Geld * (Zins/100) * a;
		double Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im " + a + " Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		}
		
		eingabe.close();
		eingabe1.close();
		eingabe2.close();
	}

}
