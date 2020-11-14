package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner eingabe1 = new Scanner(System.in);
		Scanner eingabe2 = new Scanner(System.in);
		
		String a;
		String b;
		String a_hilf;
		
		System.out.println("Geben Sie den Wert von a ein :");
		a = eingabe1.next();
		
		System.out.println("Geben Sie den Wert von b ein :");
		b = eingabe2.next();
		
		System.out.println(a + " und " + b);
		
		a_hilf = a;
		a = b;
		b = a_hilf;
		
		System.out.println(a + " und " + b);
		
		eingabe1.close();
		eingabe2.close();
	}

}
