// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Doppeln {

	public static void main(String[] args) {
		System.out.println("Geben Sie eine Zahl ein!");
		Scanner eingabe = new Scanner(System.in);
		double zahl;
		zahl = eingabe.nextDouble();
		zahl = zahl * 2;
		System.out.println("Ich verdopple zu:");
		System.out.println(zahl);		
		eingabe.close();
	}

}
