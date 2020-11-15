package ch.trinat.edu.etutorial.p03.oo6.mensa;

public class Menu extends Nahrungsmittel {

	Nahrungsmittel beilage, fleisch, gemuese;

	// Konstruktor von Nahrungsmittel mit super() aufgerufen
	public Menu(String name, Nahrungsmittel b, Nahrungsmittel f, Nahrungsmittel g) {
		super(name); // vererbt Kontruktor von Classe Nahrungsmittel
		this.beilage = b;
		this.fleisch = f;
		this.gemuese = g;
		berechnen();
	}

	public void print() {
		System.out.println("--- " + name + ": ---");
		System.out.println(fleisch.getName() + " mit " + gemuese.getName() + " und " + beilage.getName()
				+ "\n- - - - - - - - - - - - - - - - - - -");
		for (int i = 0; i < naehrwerte.length; i++) {
			System.out.println(namen[i] + ": " + naehrwerte[i][0] + " " + einheiten[i]);
		}
		System.out.println();
	}

	// Durchschnitt der nährwerte des Menüs
	void berechnen() {
		for (int i = 0; i < naehrwerte.length; i++) {
			naehrwerte[i][0] = (beilage.getNaehrwert(i) + fleisch.getNaehrwert(i) + gemuese.getNaehrwert(i)) / 3.0;
		}
	}

	public void kochen() {
		this.beilage.kochen();
		this.fleisch.kochen();
		this.gemuese.kochen();
		berechnen();
		gekocht = true;
	}

	public void gefrieren() {
		this.beilage.gefrieren();
		this.fleisch.gefrieren();
		this.gemuese.gefrieren();
		berechnen();
		gefroren = true;
	}
}