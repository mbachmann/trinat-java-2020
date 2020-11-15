package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float amount, rate, interest;
		int years = 10;

		System.out.println("Calculate your compound interest over a period of 10 years:\n");
		System.out.println("Enter your investment amount: ");
		amount = input.nextFloat();
		System.out.println("Enter your investment rate: ");
		rate = input.nextFloat();

		for (int i = 1; i <= years; i++) { // loops through the amount of years, updates the amount

			interest = (amount * rate) / 100;
			amount = amount + interest;
			System.out.println("In year " + i + ",	the interest is: " + interest + ".	New balance: " + amount);
			amount = Math.round(amount * 100) / 100;
		}
		input.close();
	}

}
