package ch.trinat.edu.etutorial.p01.ex05;

public class Lieferschein {

	public static void main(String[] args) {

		double total ;
		total = summe( 15.60, 21.90, 32.50);

		System.out.println("Lieferschein");
		line(12, '*');
		System.out.println("Artikel 1		          15.90");
		System.out.println("Artikel 2		          21.90");
		System.out.println("Artikel 3		          32.50");
		line(3, '=');
		System.out.println("Preis total		          " + total);
		line(40, '-');		
	}

	public static void line(int linien, char laenge ) {
		for (int i = 0 ; i<linien ; i++) {
			System.out.print(laenge);

		}	

		System.out.println(); 
	}


	public static double summe(double v1 , double v2 , double v3) {

		double x =  v1 + v2 + v3;
		return x;

	}
}



