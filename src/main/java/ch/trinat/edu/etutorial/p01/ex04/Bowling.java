package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Bowling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// # Spielern und Rounds
		int players, rounds;
		System.out.println("- BOWLING - \nHow many players?");
		players = input.nextInt();
		System.out.println("How many rounds? ");
		rounds = input.nextInt();
		int results[][] = new int[players][rounds];
		int sum[] = new int[players];

		// Eintrage der score für jeden Player
		int strikes = 0, zeroes = 0;// variablen für # Strikes & null
		for (int i = 0; i < players; i++) {
			for (int j = 0; j < rounds; j++) {
				do {
					System.out.print("Player " + (i + 1) + ", enter points of round " + (j + 1) + ": ");
					results[i][j] = input.nextInt();
					if ((results[i][j] < 0) || (results[i][j] > 10)) {
						System.out.println("Points between 0 and 10!");
					}
				} while ((results[i][j] < 0) || (results[i][j] > 10));

				// Schleifen zum checken von 10 oder 0 pkte
				if (results[i][j] == 10) {
					strikes++;
				} else if (results[i][j] == 0) {
					zeroes++;
				}
			}
		}

		// Addition der Punkte für jeden Player
		int winner = 0, max = 0;
		for (int i = 0; i < players; i++) {
			sum[i] = 0;
			for (int j = 0; j < rounds; j++) {
				sum[i] += results[i][j];
			}
			if (sum[i] > max) {// check Gewinner
				max = sum[i];
				winner = i;
			}
		}

		// Display des Resultates
		System.out.println("\n--- RESULTS: ---");
		System.out.println("__________________________________\n");
		System.out.print("Player\t\t");
		for (int i = 0; i < players; i++) {
			System.out.print(i + 1 + "   ");
		}
		System.out.println("\n__________________________________\n");
		for (int i = 0; i < rounds; i++) {
			System.out.print("Round " + (i + 1) + ":\t");
			for (int j = 0; j < players; j++) {
				System.out.print(results[j][i] + "   ");
			}
			System.out.println();
		}
		System.out.println("__________________________________\n");
		System.out.print("Sum: " + ":\t\t");
		for (int i = 0; i < players; i++) {
			System.out.print(sum[i] + "  ");
		}
		System.out.println("\n__________________________________");
		System.out.println("\n- Strikes: " + strikes + " - Nulls: " + zeroes);
		System.out.println("\n- Winner: Player " + (winner + 1));

		// Display erster Strike
		boolean checkFirst;
		for (int i = 0; i < players; i++) {
			checkFirst = false;
			for (int j = 0; j < rounds; j++) {
				if ((checkFirst == false) && (results[i][j] == 10)) {
					System.out.println("\n- Player " + (i + 1) + ": first strike in round " + (j + 1));
					checkFirst = true;
				}
			}
		}
		input.close();
	}
}
