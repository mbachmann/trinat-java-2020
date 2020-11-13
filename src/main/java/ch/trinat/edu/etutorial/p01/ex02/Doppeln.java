package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Doppeln {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		double zahl;
		System.out.println("Geben sie eine Zahl ein!");
		zahl = eingabe.nextDouble();
		zahl = zahl * 2;
		System.out.println("Das doppelte ist " + zahl );
	}

}
