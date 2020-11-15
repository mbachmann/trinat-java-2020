package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class GuessingNumbers {

	public static void main(String[] args) {
		int secretNumber, guess, numberOfGuesses;
		boolean correctGuess;
		Scanner input = new Scanner(System.in);

		numberOfGuesses = 0;
		correctGuess = false;

		do {// anweisung GeheimNr, kontrolliert zwischen 0 und 100
			System.out.println("Player 1, enter a secret number between 0 and 100: ");
			secretNumber = input.nextInt();
			if (secretNumber < 0) {
				System.out.println("Number too small!");
			} else if (secretNumber > 100) {
				System.out.println("Number too big!");
			}
		} while ((secretNumber < 0) || (secretNumber > 100));

		while (correctGuess == false) {
			do {// anweisung probeNr, kontrolliert zwischen 0 und 100
				System.out.println("Player 2, guess the secret number!");
				guess = input.nextInt();
				if (guess < 0) {
					System.out.println("Number too small!");
				} else if (guess > 100) {
					System.out.println("Number too big!");
				}
			} while ((guess < 0) || (guess > 100));

			numberOfGuesses++;

			if (guess == secretNumber) {
				correctGuess = true;
				System.out.println("Correct! You're done. You guessed the number in " + numberOfGuesses + " guesses.");
			} else if (guess < secretNumber) {
				System.out.println("Too small!");
			} else if (guess > secretNumber) {
				System.out.println("Too big!");
			}
		}
		input.close();
	}

}
