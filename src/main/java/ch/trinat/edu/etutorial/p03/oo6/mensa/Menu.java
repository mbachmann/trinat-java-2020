package ch.trinat.edu.etutorial.p03.oo6.mensa;

public class Menu extends Nahrungsmittel {
	Nahrungsmittel fleisch, gemuese, beilage;
	public Menu (String n, Nahrungsmittel f, Nahrungsmittel g, Nahrungsmittel b) {
		super(n);
		fleisch = f;
		gemuese = g;
		beilage = b;
		berechnen();
	}

	// Methode berechnen
	private void berechnen() {
		for (int i = 0; i < naehrwerte.length; i++) {
			naehrwerte[i][0] = (fleisch.getNaehrwert(i) + gemuese.getNaehrwert(i) + beilage.getNaehrwert(i)) / 3.0;
		}
	}

	// Methode kochen
	public void kochen() {
		if (!gekocht) {
			fleisch.kochen();
			gemuese.kochen();
			beilage.kochen();
			berechnen();
			gekocht = true;
		}
		else {
			System.err.println("Schon gekocht!");
		}
	}

	// Methode gefrieren
	public void gefrieren() {
		if (!gefroren) {
			fleisch.gefrieren();
			gemuese.gefrieren();
			beilage.gefrieren();
			berechnen();
			gefroren = true;
		}
		else {
			System.err.println("Schon gefroren!");
		}
	}

	// Konsolenausgabe
	public void print() {
		System.out.println(name + ":");
		System.out.println(fleisch.getName() + " mit " + gemuese.getName() + " und " + beilage.getName());
		System.out.println("*************************************");
		for (int i = 0; i < naehrwerte.length; i++) {
			System.out.println(namen[i] + ": " + naehrwerte[i][0] + " " + einheiten[i]);
		}
	}
}
