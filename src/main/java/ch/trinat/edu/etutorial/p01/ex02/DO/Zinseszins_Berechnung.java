package ch.trinat.edu.etutorial.p01.ex02.DO;

import java.util.Scanner;

public class Zinseszins_Berechnung {

	public static void main(String[] args) {
		// Programm das Zinsen aussrechnett
	
		String newLine = System.getProperty("line.separator");
		Scanner eingabe = new Scanner(System.in);
		Scanner eingabe1 = new Scanner(System.in);
		Scanner eingabe2 = new Scanner(System.in);
		
		
		System.out.print("Bitte geben Sie an wieviel Geld sie am Anfang angelegt haben: ");
		double Geld = eingabe1.nextDouble(); // variabel von Basis-Geld
		
		System.out.print("Bitte geben Sie an wieviele Zinsen pro Jahr sie gew�hlt haben (in %): ");
		double Zins = eingabe2.nextDouble(); // variabel von den zinsen in laufe der jahren
		
		double Geld_new = Geld * (Zins/100) * 1;
		double Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 1 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		
		Geld_new = Geld * (Zins/100) * 2;
		Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 2 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		
		Geld_new = Geld * (Zins/100) * 3;
		Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 3 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		
		Geld_new = Geld * (Zins/100) * 4;
		Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 4 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		
		Geld_new = Geld * (Zins/100) * 5;
		Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 5 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
	
		Geld_new = Geld * (Zins/100) * 6;
		Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 6 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		
		Geld_new = Geld * (Zins/100) * 7;
		Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 7 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		
		Geld_new = Geld * (Zins/100) * 8;
		Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 8 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		
		Geld_new = Geld * (Zins/100) * 9;
		Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 9 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		
		Geld_new = Geld * (Zins/100) * 10;
		Geld_real = Geld + Geld_new;
		Geld_real = Math.round(Geld_real*100)/100.0; 
		System.out.print(newLine + "Im 10 Jahr gibt es " + Geld_new + " Fr.Zins. Neuer Kontostand: " + Geld_real + " Fr");
		
		
		eingabe.close();
		eingabe1.close();
		eingabe2.close();
	}

}
