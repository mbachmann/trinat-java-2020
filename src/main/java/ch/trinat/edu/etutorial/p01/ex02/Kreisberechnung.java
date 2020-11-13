package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Kreisberechnung {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		double umfang;
		double flache;
		double radius;
		final double pi = 3.14159265359;
		System.out.println("Geben sie den Radius ein!");
		radius = eingabe.nextDouble();
		umfang = Math.round(2 * pi * radius*100)/100.0;
		flache = Math.round(pi * radius * radius*100)/100.0;
		System.out.println("Radius:  " + radius);
		System.out.println("Der Kreisumfang ist " + umfang + "." );
		System.out.println("Die Kreiflache ist " + flache + "." );
	}

}
