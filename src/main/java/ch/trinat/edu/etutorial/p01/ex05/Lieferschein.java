//Mischa Kissling
//08/2020

package ch.trinat.edu.etutorial.p01.ex05;

public class Lieferschein {
	
	public static void line (int laenge , char zeichen) {
		for (int i=0 ; i<laenge ; i++) {
			System.out.print(zeichen);
		}
		
		System.out.println("// " + laenge);
		
	}
	public static double summe (double art1 , double art2, double art3) {
		double total = art1 + art2 + art3;
		return total;
	}

	public static void main(String[] args) {
	
		System.out.println("Lieferschein");
		line(12 , '*');
		System.out.println("Artikel 1		          15.90");
		System.out.println("Artikel 2		          21.90");
		System.out.println("Artikel 3		          32.50");
		line(40 , '-');
		double total = summe (15.90 , 21.90, 32.50);
		System.out.println("Preis total                       " + total);
		line(40 , '=');
	}
	
}
