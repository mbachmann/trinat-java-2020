// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Zinseszins {

	public static void main(String[] args) {
		float saldo;
		float zinssatz;
		float saldoNeu;
		float zins;
		System.out.println("Wie viel Geld möchten Sie anlegen?");
		Scanner eingabe = new Scanner(System.in);
		saldo = eingabe.nextFloat();
		System.out.println("Zu welchem Zinssatz?");
		zinssatz = eingabe.nextFloat();
		zinssatz = 1+(zinssatz/100);
		
		for (int i=1; i<=10; i++) {
			saldoNeu = saldo * zinssatz;
			zins = saldoNeu - saldo;
			System.out.println("Im " + i + ". Jahr gibt es " + zins + " Fr. Zins. Neuer Kontostand: " + saldoNeu + " Fr.");
			saldo = saldoNeu;
		}
		eingabe.close();
	}
}