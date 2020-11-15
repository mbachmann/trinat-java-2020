package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class PinDo {

	public static void main(String[] args) {
		int a, b, c;
		int attempts = 3;
		boolean code = false;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Bitte geben sie den 3 stelligen Pin ein!");// hier besser als am ende der Schleife
			System.out.println("Sie haben noch " + attempts + " chance(n).\n");
			System.out.print("1. Ziffer: ");
			a = scanner.nextInt();
			System.out.print("2. Ziffer: ");
			b = scanner.nextInt();
			System.out.print("3. Ziffer: ");
			c = scanner.nextInt();
			attempts--;
			System.out.println("Sie haben eingegeben: " + a + b + c);

			if (a == 0 && b == 0 && c == 7) {
				System.out.println("open");
				code = true;
			} else {
				System.out.println("incorrect PIN\n");
			}
		} while ((code == false) && (attempts > 0));
		scanner.close();
	}
}