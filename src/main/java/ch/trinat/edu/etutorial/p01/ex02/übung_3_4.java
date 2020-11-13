package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class übung_3_4 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);

		int geldbetrag, z;
		int a, b, c, d, e, f, g, h;

		System.out.println(" Wie viel Geld wollen Sie abheben ? ");

		geldbetrag = eingabe.nextInt();
		z = geldbetrag;
		if (geldbetrag > 5000) {
			System.out.println(" Ihr Geldbetrag ist zu hoch. ");

		}

		else {

			System.out.println(" Eingegebener Geldbetrag : " + geldbetrag);

			a = z / 100;
			b = z % 100; // gibt uns den Rest einer Division von z und 100
			if (a >= 1) {
				System.out.println(" 100er : " + a);
			}

			c = b / 50;
			d = b % 50;
			if (c >= 1) {
				System.out.println(" 50er : " + c);
			}

			e = d / 20;
			f = d % 20;
			if (e >= 1) {
				System.out.println(" 20er : " + e);
			}

			g = f / 10;
			h = f % 10;
			if (g >= 1) {
				System.out.println(" 10er : " + g);
			}
			if (h >= 1) {
				System.out.println(" Rest : " + h);
			}

		}
		eingabe.close();
	}

}
