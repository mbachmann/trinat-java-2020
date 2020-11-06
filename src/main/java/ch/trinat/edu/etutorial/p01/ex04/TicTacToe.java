//Mischa Kissling
//08/2020

package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		char[][] Feld = new char[3][3];
		boolean[][] voll = new boolean[3][3];
		boolean allesVoll = false;
		boolean Break = false;
		int eingabe = 0;
		int number = 0;
		int count = 0;
		int spieler= 0;
		boolean gueltig = true;
		boolean gewonnen = false;

		for (int i = 0; i<3; i++) {			//Spielfeld leer machen (mit Leerschlägen füllen)
			for (int l = 0; l<3; l++) {
				Feld[i][l] = ' ';
			}
		}

		System.out.println("-------");	//Anzeige der Koordinaten der Felder
		System.out.println("|7|8|9|");
		System.out.println("-------");
		System.out.println("|4|5|6|");
		System.out.println("-------");
		System.out.println("|1|2|3|");
		System.out.println("-------");
		System.out.println();
		System.out.println();


		while(!gewonnen && !allesVoll) {	//Spielen solange kein Gewinn oder Feld nivht voll

			for (int i = 0; i<3; i++) {	 	//Feld anzeige
				System.out.println("-------");
				for (int l = 0; l<3; l++) {
					System.out.print("|"+Feld[i][l]);
				}
				System.out.print("|");
				System.out.println();
			}
			System.out.println("-------");
			System.out.println();
			System.out.println();

			spieler = count%2 +1;
			System.out.println("Spieler" + spieler +" Zug");

			do {
				eingabe = z.nextInt(); //Einfachere Eingabe

				switch(eingabe) {
				case 9 :
					number = 3;
					break;
				case 8:
					number = 2;
					break;
				case 7:
					number = 1;
					break;
				case 6:
					number = 6;
					break;
				case 5:
					number = 5;
					break;
				case 4:
					number = 4;
					break;
				case 3:
					number = 9;
					break;
				case 2:
					number = 8;
					break;
				case 1:
					number = 7;
					break;
				default:
					break;	
				}
				number--;
				if (eingabe>9 ||eingabe<1) {		//Ungültigen Zug aussortieren
					System.out.println("Ungültiger Zug!");
					gueltig = true;
				}
				else if (voll[number/3][number%3]) {
					System.out.println("Ungültiger Zug!");
					gueltig = true;
				}
				else {
					gueltig = false;
				}
			}while(gueltig);

			if(spieler == 1) {
				Feld[number/3][number%3] = 'X';
			}
			else {
				Feld[number/3][number%3] = 'O';
			}
			voll[number/3][number%3] = true;

			count++;

			for (int i = 0;i<3;i++) { // Vertikal gleich
				if (Feld[0][i] == Feld[1][i] && Feld[0][i] == Feld[2][i]&& Feld[0][i] != ' ') {
					gewonnen = true;
				}
			}
			for (int i = 0;i<3;i++) { // horizontal gleich
				if (Feld[i][0] == Feld[i][1] && Feld[i][0] == Feld[i][2]&& Feld[i][0] != ' ') {
					gewonnen = true;
				}
			}

			//Diagonal
			if (Feld[0][0] == Feld[1][1] && Feld[1][1] == Feld[2][2] && Feld[0][0] != ' ') {
				gewonnen = true;
			}
			//Diagonal
			if (Feld[2][0] == Feld[1][1] && Feld[1][1] == Feld[0][2] && Feld[2][0] != ' ') {
				gewonnen = true;
			}

			for (int i = 0; i<3;i++) {    //Spielfeld Voll
				for (int l=0; l<3; l++) {
					if (voll[i][l]) {
						allesVoll = true;
						Break = false;
					}
					else {
						allesVoll = false;
						Break = true;
						break;
					}
				}
				if (Break) {
					break;
				}
			}
		}

		for (int i = 0; i<3; i++) {	 	//Anzeige des Feldes
			System.out.println("-------");
			for (int l = 0; l<3; l++) {
				System.out.print("|"+Feld[i][l]);
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("-------");

		if (gewonnen) {		//Gewinner definieren
			System.out.println("Spieler "+spieler+" hat gewonnen!");
		}
		else if (allesVoll) {
			System.out.println("Unentschieden!");
		}

	}

}
