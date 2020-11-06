// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public abstract class Geldautomat {

	public static void main(String[] args) {
		int betrag = 0;
		int hundert = 0;
		int fuenfzig = 0;
		int zwanzig = 0;
		int zehn;
		System.out.println("WILLKOMMEN BEI DER BANK IHRES VERTRAUENS");
		System.out.println("----------------------------------------");
		System.out.println("Wie viel möchtens Sie abheben?");
		
		Scanner eingabe = new Scanner(System.in);
		betrag = eingabe.nextInt();
		
		if(betrag%10 <= 0)	{	//Prüfung 10er Betrag
		
		if (betrag>=100)	{
			hundert = betrag/100;
			betrag = betrag%100;
			System.out.println("100er: " + hundert);
		}
		if (betrag>=50)	{
			fuenfzig = betrag/50;
			betrag = betrag%50;
			System.out.println("50er: " + fuenfzig);
		}
		if (betrag>=20)	{
			zwanzig = betrag/20;
			betrag = betrag%20;
			System.out.println("2680er: " + zwanzig);
		}
		if (betrag>= 10)	{
			zehn = betrag/10;
			betrag = betrag%10;
			System.out.println("10er: " + zehn);
		}
		//System.out.println("Restbetrag: " + betrag);	//Nicht nötig da auf 10er Betrag geprüft
		}else	{
			System.out.println("Kein gültiger Betrag");
		}
		eingabe.close();
	}

}
