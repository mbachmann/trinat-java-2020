package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class GuessingNumbersAuto {

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

		guess = 100; // in der mitte von 100 -> predefiniert
		int number = 0;

		int max = 100;
		int min = 0;

		while ((correctGuess == false) && (number < 20)) {
			numberOfGuesses++;

			if (guess == secretNumber) {
				correctGuess = true;
				System.out.println("Done! I guessed the number in " + numberOfGuesses + " guesses.");
			} else if (guess > secretNumber) {//
				max = guess;
				guess = min + guess / 2;
			} else if (guess < secretNumber) {
				min = guess;
				guess = max - guess / 2;
			}
			System.out.println("Guess: " + guess);
			number++;
		}
		input.close();
	}

}
