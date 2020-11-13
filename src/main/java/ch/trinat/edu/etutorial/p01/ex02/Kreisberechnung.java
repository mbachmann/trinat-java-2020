package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Kreisberechnung {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);

		double radius, umfang, fläche;
		float pi;
		System.out.println(" Geben Sie den Radius ein ");
		pi = (float) 3.14;

		radius = eingabe.nextDouble();
		umfang = 2 * pi * radius;
		fläche = pi * radius * radius;
		System.out.println(" Der Umfang ist :  " + umfang);
		System.out.println(" Die Fläche ist :  " + fläche);

		eingabe.close();
	}

}
