// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		String a;
		String b;
		String a_hilf;
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Geben Sie einen 1. Namen ein");
		a = eingabe.next();
		System.out.println("Geben Sie einen 2. Namen ein");
		b = eingabe.next();
		System.out.println(a + " und " + b);
		a_hilf = a;
		a = b;
		b = a_hilf;
		System.out.println("Swap (Variablentausch)");
		System.out.println(a + " und " + b);
		eingabe.close();
	}
}