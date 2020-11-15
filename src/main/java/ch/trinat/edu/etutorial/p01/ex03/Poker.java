package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class Poker {
	public static void main(String[] args) {

		int colour1, colour2, colour3, colour4, colour5, value1, value2, value3, value4, value5;
		int swapValue, swapColour;// zu benutzen falls die werte nicht korrekt ("diminuendo") gegeben wurden.
		boolean royalFlush = false;
		boolean straightFlush = false;
		boolean fourOfAKind = false;
		boolean fullHouse = false;
		boolean flush = false;
		boolean straight = false;
		boolean threeOfAKind = false;
		boolean twoPairs = false;
		boolean onePair = false;

		System.out.println("P O K E R");
		System.out.println("*********");
		System.out.println("Information on the coding of the cards");
		System.out.println("VALUE");
		System.out.println("-----");
		System.out.println("2 to 10: like card value");
		System.out.println("11: jack");
		System.out.println("12: queen");
		System.out.println("13: king");
		System.out.println("14: ace");
		System.out.println("COLOUR");
		System.out.println("-----");
		System.out.println("1: clubs");
		System.out.println("2: hearts");
		System.out.println("3: diamonds");
		System.out.println("4: spades");

		System.out.println("ENTER YOUR CARDS");
		System.out.println("--------------------");
		System.out.println("Enter your highest card!");

		Scanner input = new Scanner(System.in);

		System.out.print("1. value: ");
		String input1 = input.next();
		value1 = Integer.parseInt(input1);
		System.out.print("1. colour: ");
		String input2 = input.next();
		colour1 = Integer.parseInt(input2);

		System.out.print("2. value: ");
		String input3 = input.next();
		value2 = Integer.parseInt(input3);
		System.out.print("2. colour: ");
		String input4 = input.next();
		colour2 = Integer.parseInt(input4);

		System.out.print("3. value: ");
		String input5 = input.next();
		value3 = Integer.parseInt(input5);
		System.out.print("3. colour: ");
		String input6 = input.next();
		colour3 = Integer.parseInt(input6);

		System.out.print("4. value: ");
		String input7 = input.next();
		value4 = Integer.parseInt(input7);
		System.out.print("4. colour: ");
		String input8 = input.next();
		colour4 = Integer.parseInt(input8);

		System.out.print("5. value: ");
		String input9 = input.next();
		value5 = Integer.parseInt(input9);
		System.out.print("5. colour: ");
		String input10 = input.next();
		colour5 = Integer.parseInt(input10);

		for (int i = 0; i < 5; i++) {// 5x ein "anticrescendo", mit 5 Werte ist man sicher dass die Ordnung gut ist
			if (value5 > value4) {// tauscht Wert & Farbe um (nicht sehr elegant)
				swapValue = value5;
				value5 = value4;
				value4 = swapValue;
				swapColour = colour5;
				colour5 = colour4;
				colour4 = swapColour;
			}
			if (value4 > value3) {
				swapValue = value4;
				value4 = value3;
				value3 = swapValue;
				swapColour = colour4;
				colour4 = colour3;
				colour3 = swapColour;
			}
			if (value3 > value2) {
				swapValue = value3;
				value3 = value2;
				value2 = swapValue;
				swapColour = colour3;
				colour3 = colour2;
				colour2 = swapColour;
			}
			if (value2 > value1) {
				swapValue = value2;
				value2 = value1;
				value1 = swapValue;
				swapColour = colour2;
				colour2 = colour1;
				colour1 = swapColour;
			}
		}

		System.out.println("You have entered:");
		System.out.println("*********************");
		System.out.println("Card 1: Value: " + value1 + " Colour: " + colour1);
		System.out.println("Card 2: Value: " + value2 + " Colour: " + colour2);
		System.out.println("Card 3: Value: " + value3 + " Colour: " + colour3);
		System.out.println("Card 4: Value: " + value4 + " Colour: " + colour4);
		System.out.println("Card 5: Value: " + value5 + " Colour: " + colour5);

		// Bewertung der Hand
		if ((value1 == value2 + 1) && (value2 == value3 + 1) && (value3 == value4 + 1) && (value4 == value5 + 1)) {
			straight = true;
			System.out.println("STRAIGHT"); // zu Kontrolle, idem unten.
			if ((colour1 == colour2) && (colour2 == colour3) && (colour3 == colour4) && (colour4 == colour5)) {
				straightFlush = true;
				System.out.println("STRAIGHTFLUSH");
				if (value1 == 14) {
					royalFlush = true;
					System.out.println("ROYALFLUSH");
				}
			}
		}
		if ((value1 == value2) && (value2 == value3) && (value3 == value4)) {
			fourOfAKind = true;
			System.out.println("FOUR OF A KIND");
		} else if ((value2 == value3) && (value3 == value4) && (value4 == value5)) {
			fourOfAKind = true;
			System.out.println("FOUR OF A KIND");

		}
		if ((value1 == value2) && (value2 == value3)) {
			threeOfAKind = true;
			System.out.println("3 OF A KIND");
		} else if ((value3 == value4) && (value4 == value5)) {
			threeOfAKind = true;
			System.out.println("THREE OF A KIND");
		}
		if ((value1 == value2) && (value2 == value3) && (value4 == value5)) {
			fullHouse = true;
			System.out.println("FULL HOUSE OH YEAH");
		} else if ((value1 == value2) && (value3 == value4) && (value4 == value5)) {
			fullHouse = true;
			System.out.println("FULL HOUSE");
		}
		if ((colour1 == colour2) && (colour2 == colour3) && (colour3 == colour4)) {
			flush = true;
			System.out.println("FLUSH (NOT THE TOILET)");
		}
		if ((value1 == value2) || (value2 == value3) || (value3 == value4) || (value4 == value5)) {
			onePair = true;
			System.out.println("1 PAIR");
		}
		if ((value1 == value2) || (value2 == value3)) {
			onePair = true;
			System.out.println("ONE PAIR");
			if ((value3 == value4) || (value4 == value5)) {
				twoPairs = true;
				System.out.println("TWO PAIRS");
			}
		} /*
			 * selbstverständlich kann man die liste der Hände durchgehen, damit nur ein
			 * Hand gezeigt wird: einfach vom Royal Flush zum 1 Paar durchlaufen lassen.
			 */
		input.close();
	}

}
