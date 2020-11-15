package ch.trinat.edu.etutorial.p01.ex04;

public class LotteryNumbers {

	public static void main(String[] args) {
		// Array for 6 lottery numbers
		int[] lotteryNumbers = new int[6];

		// Drawing lottery numbers
		for (int i = 0; i < lotteryNumbers.length; i++) {
			lotteryNumbers[i] = (int) (Math.random() * 49) + 1;

			// Preventing double drawing
			for (int j = 0; j < i; j++) {
				if (lotteryNumbers[j] == lotteryNumbers[i]) {
					i--;
				}
			}
		}

		// Output of the numbers on the screen
		for (int i = 0; i < lotteryNumbers.length; i++) {
			System.out.println(lotteryNumbers[i]);
		}

		// Suche für max (und min auch: optimisierung)
		int max = 0, min = 0;
		for (int i = 1; i < lotteryNumbers.length; i++) {
			if (lotteryNumbers[i] > lotteryNumbers[max]) {
				max = i;
			}
			if (lotteryNumbers[i] < lotteryNumbers[min]) {
				min = i;
			}
		}
		System.out.println("Position of max in array: [" + max + "]");
		System.out.println("Position of min in array: [" + min + "]");

		for (int i = 0; i < lotteryNumbers.length; i++) {// wenn Doppelt wird die pos angegeben
			if ((lotteryNumbers[i] == lotteryNumbers[max]) && (i != max)) {
				System.out.println("Other max at [" + i + "]");
			}
			if ((lotteryNumbers[i] == lotteryNumbers[min]) && (i != min)) {
				System.out.println("Other min at [" + i + "]");
			}
		}

		// Bubble sort algo
		int swapVal;
		/*
		 * Extension: jedes Mal gibt es ein weniger zu sortieren wenn man index j
		 * substrahiert
		 */
		for (int j = 0; j < lotteryNumbers.length; j++) {
			for (int i = 0; i < lotteryNumbers.length - 1 - j; i++) {
				if (lotteryNumbers[i] > lotteryNumbers[i + 1]) {
					swapVal = lotteryNumbers[i];
					lotteryNumbers[i] = lotteryNumbers[i + 1];
					lotteryNumbers[i + 1] = swapVal;
				}
			}
		}

		// Output of the numbers on the screen
		for (int i = 0; i < lotteryNumbers.length; i++) {
			System.out.println(lotteryNumbers[i]);
		}
	}

}
