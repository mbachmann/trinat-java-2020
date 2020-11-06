// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class Zinseszins {

	public static void main(String[] args) {
		float saldo;
		float zinssatz;
		float saldo_neu;
		float zins;
		int jahr;
		System.out.println("Wie viel Geld möchten Sie anlegen?");
		Scanner eingabe = new Scanner(System.in);
		saldo = eingabe.nextFloat();
		System.out.println("Wie lange möchten Sie das Geld anlegen?");
		jahr = eingabe.nextInt();
		System.out.println("Zu welchem Zinssatz?");
		zinssatz = eingabe.nextFloat();
		zinssatz = 1+(zinssatz/100);
		
		for (int i=1; i<=jahr; i++) {
			saldo_neu = saldo * zinssatz;
			zins = saldo_neu - saldo;
			System.out.println("Im " + i + ". Jahr gibt es " + zins + " Fr. Zins. Neuer Kontostand: " + saldo_neu + " Fr.");
			saldo = saldo_neu;
		}
		eingabe.close();
	}

}
