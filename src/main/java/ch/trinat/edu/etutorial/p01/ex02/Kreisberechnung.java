// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Kreisberechnung {

	public static void main(String[] args) {
		final double pi;
		pi = 3.14159265359;
		System.out.println("Geben Sie den Radius ein!");
		Scanner eingabe = new Scanner(System.in);
		double radius;
		double flaeche;
		double umfang;
		radius = eingabe.nextDouble();
		flaeche = radius * radius * pi;
		umfang = 2 * pi * radius;
		flaeche = Math.round(flaeche*100)/100.0;
		umfang = Math.round(umfang*100)/100.0;
		System.out.println("Die Fläche ist gleich:" + flaeche);
		System.out.println("Der Umfang ist gleich:" + umfang);		
		eingabe.close();
	}

}
