package ch.trinat.edu.etutorial.p01.ex03.poker;
import java.util.Scanner;

public class Poker {
	public static void main(String[] args) {
		String zustand="NOTHING";//Variabel "zustand" -> Karten Kombination
		int farbe1, farbe2, farbe3, farbe4, farbe5, wert1, wert2, wert3, wert4, wert5;

		System.out.println("P O K E R");
		System.out.println("*********");
		System.out.println("Information zur Codierung der Karten");
		System.out.println("WERT");
		System.out.println("-----");
		System.out.println("2 bis 10: wie Kartenwert");
		System.out.println("11: Junge");
		System.out.println("12: Dame");
		System.out.println("13: König");
		System.out.println("14: As");
		System.out.println("FARBE");
		System.out.println("-----");
		System.out.println("1: Pik");
		System.out.println("2: Herz");
		System.out.println("3: Kreuz");
		System.out.println("4: Karo");

		System.out.println("EINGABE IHRER KARTEN");
		System.out.println("--------------------");
		System.out.println("Geben Sie Ihre höchste Karte ein!");

		try (Scanner eingabe = new Scanner(System.in)){
			do{
					System.out.print("1. Wert: ");
					String eingabe1 = eingabe.next();
					wert1 = Integer.parseInt(eingabe1);
					System.out.print("1. Farbe: ");
					String eingabe2 = eingabe.next();
					farbe1 = Integer.parseInt(eingabe2);
			
					System.out.print("2. Wert: ");
					String eingabe3 = eingabe.next();
					wert2 = Integer.parseInt(eingabe3);
					System.out.print("2. Farbe: ");
					String eingabe4 = eingabe.next();
					farbe2 = Integer.parseInt(eingabe4);
			
					System.out.print("3. Wert: ");
					String eingabe5 = eingabe.next();
					wert3 = Integer.parseInt(eingabe5);
					System.out.print("3. Farbe: ");
					String eingabe6 = eingabe.next();
					farbe3 = Integer.parseInt(eingabe6);
			
					System.out.print("4. Wert: ");
					String eingabe7 = eingabe.next();
					wert4 = Integer.parseInt(eingabe7);
					System.out.print("4. Farbe: ");
					String eingabe8 = eingabe.next();
					farbe4 = Integer.parseInt(eingabe8);
			
					System.out.print("5. Wert: ");
					String eingabe9 = eingabe.next();
					wert5 = Integer.parseInt(eingabe9);
					System.out.print("5. Farbe: ");
					String eingabe10 = eingabe.next();
					farbe5 = Integer.parseInt(eingabe10);
					
					// Überprüfen Sie, ob die Spielerin/der Spieler die Karten tatsächlich der Grösse nachabsteigend eingegeben hat.
					if ((wert1<wert2)||(wert2<wert3)||(wert3<wert4)||(wert4<wert5))
					{
						System.out.println("Fehlermeldung: Reihenfolge ungültig!");
						System.out.println("Die Karten bitte nach Wert absteigend eingegeben.");
					}
			}while((wert1<wert2)||(wert2<wert3)||(wert3<wert4)||(wert4<wert5));//Überprüfen Sie, ob die Spielerin/der Spieler die Karten tatsächlich der Grösse nachabsteigend eingegeben hat.
		}
			
		System.out.println("Sie haben eingegeben:");
		System.out.println("*********************");
		System.out.println("Karte 1: Wert: " + wert1 + " Farbe: " + farbe1);
		System.out.println("Karte 2: Wert: " + wert2 + " Farbe: " + farbe2);
		System.out.println("Karte 3: Wert: " + wert3 + " Farbe: " + farbe3);
		System.out.println("Karte 4: Wert: " + wert4 + " Farbe: " + farbe4);
		System.out.println("Karte 5: Wert: " + wert5 + " Farbe: " + farbe5);

		if ((wert1==wert2)||(wert2==wert3)||(wert3==wert4)||(wert4==wert5))
		{
			zustand="ONE PAIRS";
		}
		if (((wert1==wert2)&&(wert3==wert4))||((wert2==wert3)&&(wert4==wert5))||((wert1==wert2)&&(wert4==wert5)))
		{
			zustand="TWO PAIRS";
		}
		if (((wert1==wert2)&&(wert1==wert3))||((wert2==wert3)&&(wert2==wert4))||((wert3==wert4)&&(wert3==wert5)))
		{
			zustand="THREE OF A KIND";
		}
		if ((wert1-1==wert2)&&(wert2-1==wert3)&&(wert3-1==wert4)&&(wert4-1==wert5))
		{
			zustand="STRAIGHT";	
		}
		if ((farbe1==farbe2)&&(farbe1==farbe3)&&(farbe1==farbe4)&&(farbe1==farbe5))
		{
			zustand="FLUSH";	
		}
		if ((((wert1==wert2)&&(wert1==wert3))&&(wert4==wert5))||(((wert3==wert4)&&(wert3==wert5))&&(wert1==wert2)))
		{
			zustand="FULL HOUSE";
		}
		if (((wert1==wert2)&&(wert1==wert3)&&(wert1==wert4))||((wert2==wert3)&&(wert2==wert4)&&(wert2==wert5)))
		{
			zustand="FOUR OF A KIND";
		}
		if ((zustand=="FLUSH")&&((wert1-1==wert2)&&(wert2-1==wert3)&&(wert3-1==wert4)&&(wert4-1==wert5)))
		{
			zustand="STRAIGHT FLUSH";
		}
		if ((zustand=="STRAIGHT FLUSH")&&(wert1==14))
		{
			zustand="ROYAL FLUSH";
		}
		
		System.out.println("*******************");
		System.out.println("Karten Kombination: " + zustand);
	}
}