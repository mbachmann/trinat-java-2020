package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char board[][] = new char[3][3];
		boolean won = false;

		// wash board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}

		// print board
		System.out.println("\n   1 2 3  ");
		System.out.println("----------");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + " |");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("\n");

		do {
			// move player1
			won = false;
			int moveX, moveY;
			boolean ok = false;
			do {
				System.out.print("Player 1, select a row: ");
				moveX = input.nextInt();
				System.out.print("Player 1, select a column: ");
				moveY = input.nextInt();
				if (board[moveX - 1][moveY - 1] == ' ') {
					board[moveX - 1][moveY - 1] = 'X';
					ok = true;
				} else
					System.out.println("Wrong move. Try again.");
			} while (ok == false);
			ok = false; // reset für nächste Schleife

			// print board
			System.out.println("\n   1 2 3  ");
			System.out.println("----------");
			for (int i = 0; i < 3; i++) {
				System.out.print((i + 1) + " |");
				for (int j = 0; j < 3; j++) {
					System.out.print(board[i][j] + "|");
				}
				System.out.println();
			}
			System.out.println("\n");

			// check wins Spieler 1
			int winCount = 0;
			for (int i = 0; i < 3; i++) {
				winCount = 3;
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == 'X')
						winCount--;
					if (winCount == 0) {
						System.out.println("Player 1 wins!");
						won = true;
					}
				}
			}

			winCount = 3;
			for (int i = 0; i < 3; i++) {
				if (board[i][i] == 'X')
					winCount--;
				if (winCount == 0) {
					System.out.println("Player 1 wins!");
					won = true;
				}
			}

			winCount = 3;
			for (int i = 0; i < 3; i++) {
				if (board[2 - i][i] == 'X')
					winCount--;
				if (winCount == 0) {
					System.out.println("Player 1 wins!");
					won = true;
				}
			}

			// Ausführung nur wenn Spieler 1 nicht gewonnen hat(do-while)
			if (won == false) {
				// move player 2
				do {
					System.out.print("Player 2, select a row: ");
					moveX = input.nextInt();
					System.out.print("Player 2, select a column: ");
					moveY = input.nextInt();
					if (board[moveX - 1][moveY - 1] == ' ') {
						board[moveX - 1][moveY - 1] = 'O';
						ok = true;
					} else
						System.out.println("Wrong move. Try again.");
				} while (ok == false);
				ok = false; // reset für nächste Schleife

				// print board
				System.out.println("\n   1 2 3  ");
				System.out.println("----------");
				for (int i = 0; i < 3; i++) {
					System.out.print((i + 1) + " |");
					for (int j = 0; j < 3; j++) {
						System.out.print(board[i][j] + "|");
					}
					System.out.println();
				}
				System.out.println("\n");

				// check wins Spieler 2
				for (int i = 0; i < 3; i++) {
					winCount = 3;
					for (int j = 0; j < 3; j++) {
						if (board[i][j] == 'O')
							winCount--;
						if (winCount == 0) {
							System.out.println("Player 2 wins!");
							won = true;
						}
					}
				}
				for (int j = 0; j < 3; j++) {
					winCount = 3;
					for (int i = 0; i < 3; i++) {
						if (board[i][j] == 'O')
							winCount--;
						if (winCount == 0) {
							System.out.println("Player 2 wins!");
							won = true;
						}
					}
				}
				winCount = 3;
				for (int i = 0; i < 3; i++) {
					if (board[i][i] == 'O')
						winCount--;
					if (winCount == 0) {
						System.out.println("Player 2 wins!");
						won = true;
					}
				}

				winCount = 3;
				for (int i = 0; i < 3; i++) {
					if (board[2 - i][i] == 'O')
						winCount--;
					if (winCount == 0) {
						System.out.println("Player 2 wins!");
						won = true;
					}
				}

			}
		} while (won == false);
		input.close();
	}

}
