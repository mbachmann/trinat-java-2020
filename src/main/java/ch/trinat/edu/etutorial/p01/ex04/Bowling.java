package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Bowling {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		int [][] Resultaten = new int [5][5];
		int [] Summen = new int [3];

		int spieler = 0;
		int runde = 0;
		int resultat;



		do {
			System.out.println("            Spieler");
			System.out.println("           1   2   3");
			System.out.println();

			for (int i=0; i<5; i++) {
				System.out.print(i+1 + ". Runde   ");
				for(int j=0; j<3; j++) {
					System.out.print(Resultaten[i][j] + "   ");

				}
				System.out.println();
			}	
			System.out.println();		
			System.out.print("Wie viele Pins hat der " + (spieler+1) + " spieler umgeworffen ?");
			System.out.println();
			resultat = eingabe.nextInt();
			Resultaten[runde][spieler] = resultat;
			Summen[spieler] = Summen[spieler] + resultat;
			spieler ++;
			if(spieler > 2) {

				runde ++;
				spieler = 0;
			}
		}
		while(runde < 5);


		System.out.println("            Spieler");
		System.out.println("           1   2   3");
		System.out.println();

		for (int i=0; i<5; i++) {
			System.out.print(i+1 + ". Runde   ");
			for(int j=0; j<3; j++) {
				System.out.print(Resultaten[i][j] + "   ");
			}
			System.out.println();
		}	

		System.out.print("Summe :   ");
		for(int i=0; i<3; i++) {
			System.out.print(Summen[i] + "  ");
		}

		eingabe.close();




	}

}
