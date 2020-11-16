package ch.trinat.edu.etutorial.p01.ex04.DO;
import java.util.Scanner;

public class Tic_tac_toe {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		Scanner eingabe1 = new Scanner(System.in);
		char [][] spielfeld = new char [3][3];
		char spieler = 'X';
		int zug_spalte;
		int zug_zeile = 0;
		boolean test = false;
		
		spielfeld [0][0] = ' ';
		spielfeld [0][1] = ' ';
		spielfeld [0][2] = ' ';
		spielfeld [1][0] = ' ';
		spielfeld [1][1] = ' ';
		spielfeld [1][2] = ' ';
		spielfeld [2][0] = ' ';
		spielfeld [2][1] = ' ';
		spielfeld [2][2] = ' ';
		
		
	
	    // erzeugt spielfeld
		System.out.println("");
		System.out.println("");
		System.out.println("   1 2 3");
		System.out.print("---------");
		for (int i = 0; i<3; i++) {
			System.out.println();
			System.out.print(i+1 + ": ");
		
			for (int a = 0; a<3; a++) {
				System.out.print(spielfeld[i][a] + "|");
			}
		}		
	
		
		while (test == false)
	     {
			
		
		
	    // user eingabe um feld und zeile zu finden
		System.out.println("");
		System.out.println("Spieler: " + spieler);
		System.out.println("Welches Feld ?");
		System.out.print("Zeile: ");
		zug_zeile = eingabe.nextInt();

		System.out.print("Spalte: ");
		zug_spalte = eingabe1.nextInt();		
		
		
		// testet ob die Eingabe in das Array passt
	    if (zug_zeile-1 < spielfeld.length && zug_spalte-1 < spielfeld.length) {
	
	    // testet ob die schon besezt ist und wenn nicht stellt das zeichen in das Array
	    if 	(spielfeld[zug_zeile-1][zug_spalte-1] != 'X' && spielfeld[zug_zeile-1][zug_spalte-1] != 'O') {
		spielfeld [zug_zeile-1][zug_spalte-1] = spieler;
		
		// andert das Zeichen
		if (spieler == 'O' ) {
             spieler = 'X';

         }
         else {
             spieler = 'O';
         }
		
	    } 
	
	    // stellt das spielfeld wieder da
		System.out.println("");
		System.out.println("");
		System.out.println("   1 2 3");
		System.out.print("---------");
		for (int i = 0; i<3; i++) {
			System.out.println();
			System.out.print(i+1 + ": ");
			
			for (int a = 0; a<3; a++) {
				System.out.print(spielfeld[i][a] + "|");

			}
		}
		
		
		 
		
		 // testet ob eine Row vollstandig ist
		 if ( 
			 (spielfeld[0][0] == spielfeld [0][1] && spielfeld[0][0] == spielfeld [0][2]  && spielfeld[0][0] != ' ') ||
			 (spielfeld[0][0] == spielfeld [1][1] && spielfeld[0][0] == spielfeld [2][2]  && spielfeld[0][0] != ' ') ||
			 (spielfeld[0][0] == spielfeld [1][0] && spielfeld[0][0] == spielfeld [2][0]  && spielfeld[0][0] != ' ') ||
			 (spielfeld[2][0] == spielfeld [2][1] && spielfeld[2][0] == spielfeld [2][2]  && spielfeld[2][0] != ' ') ||
			 (spielfeld[2][0] == spielfeld [1][1] && spielfeld[2][0] == spielfeld [0][2]  && spielfeld[2][0] != ' ') ||
			 (spielfeld[0][2] == spielfeld [1][2] && spielfeld[0][2] == spielfeld [2][2]  && spielfeld[0][2] != ' ') ||
			 (spielfeld[0][1] == spielfeld [1][1] && spielfeld[0][1] == spielfeld [2][1]  && spielfeld[0][1] != ' ') ||
			 (spielfeld[1][0] == spielfeld [1][1] && spielfeld[1][0] == spielfeld [1][2]  && spielfeld[1][0] != ' ') 
			) { 
			 test = true; }
		 
		 
		// endet das spiel wenn das spielfeld voll ist
		if (	
		     (spielfeld [0][0] == 'O' || spielfeld [0][0] == 'X') &&
			 (spielfeld [0][1] == 'O' || spielfeld [0][1] == 'X') &&
			 (spielfeld [0][2] == 'O' || spielfeld [0][2] == 'X') &&
			 (spielfeld [1][0] == 'O' || spielfeld [1][0] == 'X') &&
			 (spielfeld [1][1] == 'O' || spielfeld [1][1] == 'X') &&
			 (spielfeld [1][2] == 'O' || spielfeld [1][2] == 'X') &&
			 (spielfeld [2][0] == 'O' || spielfeld [2][0] == 'X') &&
			 (spielfeld [2][1] == 'O' || spielfeld [2][1] == 'X') &&
			 (spielfeld [2][2] == 'O' || spielfeld [2][2] == 'X')
		    ) {	  
		    System.out.print("Unentschieden"); 
		    test = true; }
		
		
		     }
		
	     }
		
	      
	   
		System.out.println("");
		System.out.println("");
		System.out.print("Game over");
		
		eingabe.close();
		eingabe1.close();
       
}}
