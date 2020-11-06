package ch.trinat.edu.etutorial.p02.ex02;

public class Firma {

	public static void main(String[] args) {
		
		Mitarbeiter[] AG = new Mitarbeiter[100];
		// 10 Vorstandsmitglieder
		for (int i = 0; i < 10; i++) {
			AG[i] = new Mitarbeiter(1);
		}
		// 30 Kader
		for (int i = 10; i < 40; i++) {
			AG[i] = new Mitarbeiter(2);
		}
		// 60 normale Angestellte 
		for (int i = 40; i < 100; i++) {
			AG[i] = new Mitarbeiter(3);
		}
		
		// Burofläche berechnen
		double fläche = 0;
		double fläche_help = 0;
		for (int i = 0; i < AG.length; i++) {
			fläche_help = AG[i].getSpace();
			fläche = fläche + fläche_help;
		}
		System.out.println("Ihr Firma benötigt insgesamt " + fläche + " m2 Burofläche");
		
		// Jahresgehalt berechnen
		double gehalt = 0; 
		double gehalt_help = 0;
		for (int i = 0; i < AG.length; i++) {
			gehalt_help = AG[i].getSalery();
			gehalt = gehalt + gehalt_help;
		}
		System.out.println("Die jährlichen Ausgaben für die Gehälter belaufen sich auf " + gehalt + " Franken");

	}

}
