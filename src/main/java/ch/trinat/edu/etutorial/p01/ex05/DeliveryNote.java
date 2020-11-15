package ch.trinat.edu.etutorial.p01.ex05;

public class DeliveryNote {
	public static void main(String[] args) {
		double total;

		System.out.println("Delivery Note");
		line(12, '*');
		System.out.println("Product 1		          15.90");
		System.out.println("Product 2		          21.90");
		System.out.println("Product 3		          32.50");
		line(40, '-');
		total = sum(15.30, 21.90, 32.50);
		System.out.println("Total price		          " + total);
		line(40, '=');

	}

	// print Linie mit Parameter für länge
	public static void line(int length, char character) {
		for (int i = 0; i < length; i++) {
			System.out.print(character);
		}
		System.out.println();
	}

	// Summierung der Preisen
	public static double sum(double d, double e, double f) {
		double sum = d + e + f;
		return sum;
	}
}
