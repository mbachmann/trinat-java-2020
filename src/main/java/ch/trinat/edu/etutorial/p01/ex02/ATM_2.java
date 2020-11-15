package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class ATM_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float sum, wantedSum;
		float maxSum = 3000;
		int note10, note20, note50, note100;
		char mixedNotes = 'n';

		System.out.println("Enter a sum to withdraw: ");
		wantedSum = input.nextFloat();

		if (maxSum > wantedSum) {
			sum = wantedSum;
			System.out.println("\nDesired sum: " + sum + " - Would you like mixed notes? (no = n, yes = y)");
			mixedNotes = input.next().charAt(0);
			if (mixedNotes == 'n') {
				note100 = (int) sum / 100;
				sum = sum % 100;
				note50 = (int) sum / 50;
				sum = sum % 50;
				note20 = (int) sum / 20;
				sum = sum % 20;
				note10 = (int) sum / 10;
				sum = sum % 10;
			} else {
				note100 = (int) (sum / 2) / 100;
				sum = sum - note100 * 100;
				note50 = (int) (sum / 2) / 50;
				sum = sum - note50 * 50;
				note20 = (int) sum / 20;
				sum = sum % 20;
				note10 = (int) sum / 10;
				sum = sum % 10;
			}

			if (sum > 0) {
				System.out.println("\nYou will get the amount of " + (wantedSum - sum) + " in the following notes:\n");
			} else {
				System.out.println("\nYou get the following notes:\n");
			}
			if (note100 > 0) {
				System.out.println(note100 + " note(s) of 100");
			}
			if (note50 > 0) {
				System.out.println(note50 + " note(s) of 50");
			}
			if (note20 > 0) {
				System.out.println(note20 + " note(s) of 20");
			}
			if (note10 > 0) {
				System.out.println(note10 + " note(s) of 10");
			}
			if (sum > 0) {
				System.out.println("Remainder: " + sum);
			}

		} else
			System.out.println("No withdrawals above 3000, are you a drug dealer?");
		input.close();
	}

}
