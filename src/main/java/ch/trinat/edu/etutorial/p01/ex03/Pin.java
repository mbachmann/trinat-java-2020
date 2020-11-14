package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
			System.out.print("1. Ziffer: ");
			a = scanner.nextInt();
			System.out.print("2. Ziffer: ");
			b = scanner.nextInt();
			System.out.print("3. Ziffer: ");
			c = scanner.nextInt();
			System.out.println("Sie haben eingegeben: " + a + b + c);
		
			if (a == 0 && b == 0 && c == 7) {
				System.out.println("Offen");
			}
			else System.out.println("Falscher Pin");
		}
		
	scanner.close();
	}
}