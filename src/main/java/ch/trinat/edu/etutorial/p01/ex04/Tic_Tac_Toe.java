package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Tic_Tac_Toe {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		char [][] Spielbrett = new char [3][3];
		
		int spieler, zeile, spalte, runde, versuche;
		
		spieler = 1;
		runde = 0;
		versuche = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				Spielbrett[i][j] = ' ';
			}
		}
		while(runde < 9) {
			runde ++;
			System.out.println("   1     2     3");
			for (int i=0; i<3; i++) {
				System.out.print(i+1 + ": ");
				for(int j=0; j<3; j++) {
					System.out.print(Spielbrett[i][j] + "  |  ");
				}
				System.out.println();
			}
			
			versuche = 0;
			
			do  {
				versuche ++;
				
				System.out.println();
				
				if (versuche > 1) { 
					System.out.println("Spieler " + spieler + " muss eine freies Feld eingeben");
				}
				else {
					System.out.println("Spieler " + spieler);	
				}
				System.out.print("Zeile: ");
				zeile = eingabe.nextInt() - 1; 
				System.out.print("Spalte: ");
				spalte = eingabe.nextInt() - 1;
				
			}
			while (Spielbrett[zeile][spalte] != ' ' /*or zeile > 3 or spalte > 3*/);
				
			if (spieler == 1) {
				Spielbrett[zeile][spalte] = 'X';
				spieler++;
			}
			else {
				Spielbrett[zeile][spalte] = 'O';
				spieler --;
			}
			
		}
		
		eingabe.close();
		
	}

}
