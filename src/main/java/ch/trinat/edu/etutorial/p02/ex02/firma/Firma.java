package ch.trinat.edu.etutorial.p02.ex02.firma;

public class Firma {

	public static void main(String[] args) {

	int burofläche = 0 , jahresgehalt = 0;
		
	// Array mit Platz für 100 Mitarbeiter wird erstellt.
	Mitarbeiter[] mitarbeiter = new Mitarbeiter[100];
	
	for (int i = 0; i < mitarbeiter.length; i++) {
		// In diesem Array werden 10 Vorstandsmitglieder,
		if (i<=9){
			mitarbeiter[i] = new Mitarbeiter((int)(Math.random()*90000+150000), 1);
		}
		// 30 Kader,
		else if ((i>9) && (i<=39)){
			mitarbeiter[i] = new Mitarbeiter((int)(Math.random()*60000+90000), 2);
		}
		// nd 60 normale Angestellte gespeichert.
		else {
			mitarbeiter[i] = new Mitarbeiter((int)(Math.random()*30000+60000), 3);
		}
	}
	
	// Berechnen Sie wie viel Bürofläche Ihre Firma braucht.
	for (int i = 0; i < mitarbeiter.length; i++) {
		burofläche+=mitarbeiter[i].getSpace();
	}
	
	// Berechnen Sie wie viel Jahresgehalt Sie bezahlen müssen.
	for (int i = 0; i < mitarbeiter.length; i++) {
		jahresgehalt+=mitarbeiter[i].getSalary();
	}
	
	for (int i = 0; i < mitarbeiter.length; i++) {
		mitarbeiter[i].print();
	}
	
	System.out.println("Burofläche: " + burofläche +"m2 - Jahresgehalt: " + jahresgehalt + "€");
	}
}
