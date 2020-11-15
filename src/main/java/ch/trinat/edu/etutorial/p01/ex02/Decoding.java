package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Decoding {

	public static void main(String[] args) {
		char letter, letter_decoded; // Variables for a character and its encoded version
		int key; // Variable to store the key
		int letter_ascii, letter_ascii_decoded; // variables to move in the ASCII table
		char one, two, three, four, five, six;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter six characters: ");
		String x = input.next();
		letter = x.charAt(0); // takes char at position 0 from the input string
		System.out.println("Enter a key: ");
		key = input.nextInt();
		// System.out.println("Letter is: " + letter + "\nKey is: " + key);

		letter_ascii = (int) letter; // cast the letter variable to its ASCII correspondent number
		letter_ascii_decoded = letter_ascii + key; // encryption by shifting the variable's ASCII number (subtracting
													// the key)
		letter_decoded = (char) letter_ascii_decoded; // re-convert the new ASCII value to the "encrypted" variable
		one = letter_decoded;
		// System.out.println("\nNow the Letter is: " + letter_encoded + "\nWith the Key
		// " + key);

		letter = x.charAt(1); // takes char at the next position
		letter_ascii = (int) letter;
		letter_ascii_decoded = letter_ascii + key;
		letter_decoded = (char) letter_ascii_decoded;
		two = letter_decoded;

		letter = x.charAt(2); // takes char at the next position
		letter_ascii = (int) letter;
		letter_ascii_decoded = letter_ascii + key;
		letter_decoded = (char) letter_ascii_decoded;
		three = letter_decoded;

		letter = x.charAt(3); // takes char at the next position
		letter_ascii = (int) letter;
		letter_ascii_decoded = letter_ascii + key;
		letter_decoded = (char) letter_ascii_decoded;
		four = letter_decoded;

		letter = x.charAt(4); // takes char at the next position
		letter_ascii = (int) letter;
		letter_ascii_decoded = letter_ascii + key;
		letter_decoded = (char) letter_ascii_decoded;
		five = letter_decoded;

		letter = x.charAt(5); // takes char at the next position
		letter_ascii = (int) letter;
		letter_ascii_decoded = letter_ascii + key;
		letter_decoded = (char) letter_ascii_decoded;
		six = letter_decoded;

		System.out.println("The decoded word is: " + one + two + three + four + five + six);
		input.close();
	}

}
