package ch.trinat.edu.etutorial.p01.ex02.geldautomat;

import java.util.Scanner;

public class Geldautomat 
{
	public static void main(String[] args) 
	{
		// Alle benötigten Variabeln werden deklariert.
		int geld, hunderter, funfziger,zwanziger,zehner,rest;
		final int max=500;
		int kleiner;
		
		try (Scanner eingabe = new Scanner(System.in)) 
		{
			System.out.println("WILLKOMMEN BEI DER BANK IHRES VERTRAUENS");
			System.out.println("****************************************");
			System.out.println("Wie viel möchten Sie abheben?");
			geld = eingabe.nextInt(); //Eingabe der Variabel "geld".
			System.out.println("Eingegebener Geldbetrag: " +geld+ "CHF");
			System.out.println("Möchten Sie kleinere Noten?");
			System.out.println("0: normal");
			System.out.println("1: kleinere Noten");
			kleiner = eingabe.nextInt(); //Eingabe der Variabel "kleiner".
		}
		
		if (geld>max)//Prüfung ob der Maxiamle Betrag überschriten wurde.
		{
			System.out.println("Der Geldbetrag überschreitet den Maximalbetrag von "+max+" CHF!");
			geld=max;
			System.out.println("Der Betrag wurde automatisch auf "+ geld +" CHF abgerundet.");
		}
		
		rest=geld%10; // Berechnung der Variabel "rest", dieser kann nicht in Scheinen ausgegeben werden.
		
		if (rest!=0)//Prüfung ob ein Restbetrag entsteht.
		{
			System.out.println("Der Geldbetrag verursacht einen Restbetrag!");
			geld=geld-rest; // Falls eine Restbetrag ensteht, wird dieser automatisch von der Summe abgezogen.
			System.out.println("Der Betrag wurde automatisch auf "+ geld +" CHF abgerundet.");
		}
		
		hunderter=geld/100;
		if ( kleiner==1)//Im fall "kleinere Noten".
		{
			hunderter=hunderter/2;
			geld=geld-hunderter*100;
		}
		else//Normal Fall.
		{
			geld=geld%100;
		}
		if (hunderter!=0)//Falls es keine dieser Noten gibt, nichts ausgeben.
		{
			System.out.println("100er: " +hunderter);
		}
		
		funfziger=geld/50;
		if (kleiner==1)//Im fall "kleinere Noten".
		{
			funfziger=funfziger/2;
			geld=geld-funfziger*50;
		}
		else//Normal Fall.
		{
			geld=geld%50;
		}
		if (funfziger!=0)//Falls es keine dieser Noten gibt, nichts ausgeben.
		{
			System.out.println("50er: " +funfziger);
		}
		
		zwanziger=geld/20;
		if (kleiner==1)//Im fall "kleinere Noten".
		{
			zwanziger=zwanziger/2;
			geld=geld-zwanziger*20;
		}
		else//Normal Fall.
		{
			geld=geld%20;
		}
		if (zwanziger!=0)//Falls es keine dieser Noten gibt, nichts ausgeben.
		{
			System.out.println("20er: " +zwanziger);
		}
		
		zehner=geld/10;
		geld=geld%10;
		if (zehner!=0)//Falls es keine dieser Noten gibt, nichts ausgeben.
		{
			System.out.println("10er: " +zehner);
		}
	}
}
