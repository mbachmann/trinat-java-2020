package ch.trinat.edu.etutorial.p01.ex04;
import java.util.Scanner;

public class Boss_puzzle {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		Scanner eingabe1 = new Scanner(System.in);
		char [][] spielfeld = new char [10][10];
		int zug_spalte;
		int leer_zeile = 0;
		int leer_spalte = 2 ;
		
		spielfeld [0][0] = '3';
		spielfeld [0][1] = '4';
		spielfeld [0][2] = ' ';
		spielfeld [1][0] = '7';
		spielfeld [1][1] = '8';
		spielfeld [1][2] = '5';
		spielfeld [2][0] = '2';
		spielfeld [2][1] = '1';
		spielfeld [2][2] = '6';
	
		
		System.out.println("");
		System.out.println("");
		System.out.println(" S 1 2 3");
		System.out.print("Z  -----");
		for (int i = 0; i<3; i++) {
			System.out.println();
			System.out.print(i+1 + "|");
			
			for (int a = 0; a<3; a++) {
				System.out.print(" " + spielfeld[i][a]);
			}
		}		
	
		int zug_zeile = 2;
		while (zug_zeile != 9) {
		

		System.out.println("");
		System.out.println("Welches Feld m�chten Sie verschieben ?");
		System.out.print("Zeile: ");
		zug_zeile = eingabe.nextInt();

		System.out.print("Spalte: ");
		zug_spalte = eingabe1.nextInt();		
		
	    	
		spielfeld [leer_zeile][leer_spalte] = spielfeld [zug_zeile-1][zug_spalte-1];
		spielfeld [zug_zeile-1][zug_spalte-1] = ' ';
		
		leer_zeile = zug_zeile-1;
		leer_spalte = zug_spalte-1;
		

	
		System.out.println("");
		System.out.println("");
		System.out.println(" S 1 2 3");
		System.out.print("Z  -----");
		for (int i = 0; i<3; i++) {
			System.out.println();
			System.out.print(i+1 + "|");
			
			for (int a = 0; a<3; a++) {
				System.out.print(" " + spielfeld[i][a]);
			
			}
		}
		
      } 
	   
		System.out.println("");
		System.out.println("");
		System.out.print("Game over");
       
		
	    eingabe.close();
	    eingabe1.close();
}}
