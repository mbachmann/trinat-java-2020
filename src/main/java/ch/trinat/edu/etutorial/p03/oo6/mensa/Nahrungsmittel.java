package et6_Mensa;

public class Nahrungsmittel {

	// Array Naehrwerte
	protected double[][] naehrwerte;

	// Namen
	protected final String [] namen = {"Energie", "Wasser", "Protein", "Fett", "Kohlenhydrate", "Ballaststoffe", "Vitamin A",
			"Beta-Carotin", "Vitamin B1", "Vitamin B2", "Vitamin B6", "Vitamin B12", "Folsaeure", "Vitamin C", "Vitamin D",
			"Vitamin E", "Calcium", "Chlor", "Kalium", "Magnesium", "Natrium", "Phosphor", "Eisen", "Fluor", "Jod",
			"Zink", "Cholesterin", "Mehrfach ungesaettigte Fettsaeuren"};

	// Einheiten
	protected final String [] einheiten = {"kJ", "g", "g", "g", "g", "g", "Mikrogramm", "Mikrogramm", "Mikrogramm" ,"Mikrogramm",
			"Mikrogramm","Mikrogramm", "Mikrogramm", "mg", "Mikrogramm", "Mikrogramm", "mg", "mg", "mg", "mg", "mg", "mg",
			"mg", "Mikrogramm", "Mikrogramm", "Mikrogramm", "g", "g"};

	String name;
	protected boolean gekocht, gefroren;

	// Konstruktor Nahrungsmittel
	public Nahrungsmittel (String n) {
		name = n;
		naehrwerte = new double[28][3]; // Initialisieren für 28 Naehrwerte, 3 Werte pro Naehrwert.
		gekocht = false;
		gefroren = false;
	}

	/* public double[][] getNaehrwerte() {
		return naehrwerte;
	} */

	public void setNaehrwerte(double[][] naehrwerte) {
		this.naehrwerte = naehrwerte;
	}

	// Methode kochen
	public void kochen() {
		if (!gekocht) {
			for (int i = 0; i < naehrwerte.length; i++) {
				naehrwerte[i][0] = naehrwerte[i][0] * naehrwerte[i][2];
			}
			gekocht = true;
		}
		else {
			System.err.println("Schon gekocht!");
		}
	}

	// Methode gefrieren
	public void gefrieren() {
		if (!gefroren) {
			for (int i = 0; i < naehrwerte.length; i++) {
				naehrwerte[i][0] = naehrwerte[i][0] * naehrwerte[i][1];
			}
			gefroren = true;
		}
		else {
			System.err.println("Schon gefroren!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNaehrwert(int feld) {
		return(naehrwerte[feld][0]);
	}

	// Konsolenausgabe
	/* public void print() {
		System.out.println(name + ":");
		System.out.println(fleisch.getName() + " mit " + gemuese.getName() + " und " + beilage.getName());
		System.out.println("*********************");
		for (int i = 0; i < naehrwerte.length; i++) {
			System.out.println(namen[i] + ": " + naehrwerte[i][0] + " " + einheiten[i]);
		}
	} */
}
