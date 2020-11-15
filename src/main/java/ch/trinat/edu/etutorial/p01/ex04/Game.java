package ch.trinat.edu.etutorial.p01.ex04;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arrSize;
		System.out.println("Enter the value of the array:");
		arrSize = input.nextInt();
		int[] cards = new int[arrSize];
		int sum = 0;

		for (int i = 0; i < cards.length; i++) {
			System.out.println("Enter the value of card " + (i + 1));
			cards[i] = input.nextInt();
		}
		for (int i = 0; i < cards.length; i++) {
			System.out.println("Value of card " + (i + 1) + ": " + cards[i]);
		}
		for (int i = 0; i < cards.length; i++) {
			sum = sum + cards[i];
		}
		System.out.println("Value of sum: " + sum);
		input.close();
	}

}
