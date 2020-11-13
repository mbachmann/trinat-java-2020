package ch.trinat.edu.etutorial.p01.ex05;

public class Lieferschein {

	public static void main(String[] args) {
		double total;
		System.out.println("Lieferschein");
		line(12, '*');
		System.out.println("Artikel 1		          15.90");
		System.out.println("Artikel 2		          21.90");
		System.out.println("Artikel 3		          32.50");
		total = summe(15.90, 21.90, 32.50);
		line(40, '=');
		System.out.println("Preis total		          " + total);
		line(40, '-');
	}
	
	
	public static void line (int laenge, char Zeichen) {
		for(int i=0; i<laenge; i++) {
			System.out.print(Zeichen);
		}
		System.out.println();
	}
	
	
	public static double summe(double v1, double v2, double v3) {
		return v1 + v2 + v3;
		
		
		
		
	}
	
	

}



