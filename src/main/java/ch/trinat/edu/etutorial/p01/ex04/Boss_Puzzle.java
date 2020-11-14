package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Boss_Puzzle {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);

		
		char [][] brett = new char [3][3];
		int zug_zeile, zug_spalte;
		int leer_zeile, leer_spalte;
		
		brett[0][0] = '3';
		brett[0][1] = '4';
		brett[0][2] = ' ';
		
		brett[1][0] = '7';
		brett[1][1] = '8';
		brett[1][2] = '5';
		
		brett[2][0] = '2';
		brett[2][1] = '1';
		brett[2][2] = '6';
		
		leer_zeile = 0;
		leer_spalte = 2;
		zug_zeile = 0;
		
		while(zug_zeile != 4) {
			System.out.println("  S 1 2 3");
			System.out.println("Z");
			
			for(int i=0; i<3; i++) {
				System.out.print(i+1 + "   ");
				for (int j=0; j<3; j++) {
					System.out.print(brett[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("Welches Feld möchten Sie verschieben ?");
			System.out.print("Zeile (5 fur Abbruch): ");
			zug_zeile = eingabe.nextInt() - 1; 
			
			if(zug_zeile != 4) {
				System.out.print("Spalte: ");
				zug_spalte = eingabe.nextInt() - 1;
				brett[leer_zeile][leer_spalte] = brett[zug_zeile][zug_spalte];
				brett[zug_zeile][zug_spalte] = ' ';
				
				leer_zeile = zug_zeile;
				leer_spalte = zug_spalte;
			}
			
			System.out.println();
				
		}
		
		System.out.print("Gluckwunch du hast es geschaft !!!");
		eingabe.close();
	}

}
