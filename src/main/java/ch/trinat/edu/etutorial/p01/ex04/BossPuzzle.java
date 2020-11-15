package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class BossPuzzle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int emptyX = 0, emptyY = 0; // tracking der Leerstelle
		char board[][] = new char[3][3];

		board[0][0] = '3';
		board[0][1] = '4';
		board[0][2] = ' ';

		board[1][0] = '7';
		board[1][1] = '8';
		board[1][2] = '5';

		board[2][0] = '2';
		board[2][1] = '1';
		board[2][2] = '6';

		// print 3 Spalten auf 3 Zeilen
		System.out.println("-- BOARD: --\n");
		System.out.println("  C 1 2 3 \nR ---------");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + " ¦ ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
				if (board[i][j] == ' ') {// index x,y der Leerstelle
					emptyX = i;
					emptyY = j;
				}
			}
			System.out.println("¦");
		}
		System.out.println("  ---------");

		// Wahl der Position zu bewegen
		int moveRow, moveColumn; // Variablen zum speichern der Auswahl
		System.out.println("Choose the moving position: (9 to quit)");
		System.out.print("Row: ");
		moveRow = input.nextInt();
		System.out.print("Column: ");
		moveColumn = input.nextInt();

		while (moveRow != 9) {// spielt solange nicht 9 eingetragen wurde
			// Bewegung der ausgewählte Position
			board[emptyX][emptyY] = board[moveRow - 1][moveColumn - 1];// leere Position = Wert ausgewählten Position
			board[moveRow - 1][moveColumn - 1] = ' ';// ausgewählte Position = Leerstelle

			// print wieder
			System.out.println("-- BOARD: --\n");
			System.out.println("  C 1 2 3 \nR ---------");
			for (int i = 0; i < 3; i++) {
				System.out.print((i + 1) + " ¦ ");
				for (int j = 0; j < 3; j++) {
					System.out.print(board[i][j] + " ");
					if (board[i][j] == ' ') {
						emptyX = i;
						emptyY = j;
					}
				}
				System.out.println("¦");
			}
			System.out.println("  ---------");
			System.out.println("Choose the moving position: (9 to quit)");
			System.out.print("Row: ");
			moveRow = input.nextInt();
		}
		input.close();
	}
}
