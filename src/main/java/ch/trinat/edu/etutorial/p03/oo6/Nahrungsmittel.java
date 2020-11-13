package ch.trinat.edu.etutorial.p03.oo6;

public class Nahrungsmittel {

	String nahrungsmittelName;
	protected double[][] naehrwerte;
	protected boolean gekocht;
	protected boolean gefroren;

	protected final String[] namen = { "Energie", "Wasser", "Protein", "Fett", "Kohlenhydrate", "Ballaststoffe",
			"Vitamin A", "Beta-Carotin", "Vitamin B1", "Vitamin B2", "Vitamin B6", "Vitamin B12", "Folsäure",
			"Vitamin C", "Vitamin D", "Vitamin E", "Calcium", "Chlor", "Kalium", "Magnesium", "Natrium", "Phosphor",
			"Eisen", "Fluor", "Jod", "Zink", "Cholesterin", "Mehrfach ungesättigte Fettsäuren" };

	protected final String[] einheiten = { "kJ", "g", "g", "g", "g", "g", "Mikrogramm", "Mikrogramm", "Mikrogramm",
			"Mikrogramm", "Mikrogramm", "Mikrogramm", "Mikrogramm", "mg", "Mikrogramm", "Mikrogramm", "mg", "mg", "mg",
			"mg", "mg", "mg", "mg", "Mikrogramm", "Mikrogramm", "Mikrogramm", "g", "g" };

	public Nahrungsmittel(String n) {
		nahrungsmittelName = n;
		naehrwerte = new double[28][3];
		gekocht = false;
		gefroren = false;
	}

	public void setNaehrwerte(double[][] naehrwerte) {
		this.naehrwerte = naehrwerte;
	}

	public void print() {
		System.out.println( nahrungsmittelName + ":\n" + "**************************");
		for (int i = 0; i < naehrwerte.length; i++) {
			System.out.println(namen[i] + ":" + naehrwerte[i][0] + " " + einheiten[i]);
		}
		System.out.println();
	}

	public void gefrieren() {
		if (!gefroren) {
			for (int i = 0; i < naehrwerte.length; i++) {
				naehrwerte[i][0] = naehrwerte[i][0] * naehrwerte[i][1];
			}
			gefroren = true;
		}

		else {
			System.err.println("Schon gefroren!!");
		}

	}

	public void kochen() {
		if (!gekocht) {
			for (int i = 0; i < naehrwerte.length; i++) {
				naehrwerte[i][0] = naehrwerte[i][0] * naehrwerte[i][2];
			}
			gekocht = true;
		} else {
			System.err.println("Schon gekocht!!");
		}

	}

	// Getter für den Namen

	public String[] getNamen() {
		return namen;
	}

	// Schreiben Sie einen Getter für ein Feld des Arrays, der als Parameter eine
	// Ganzzahl hat und den Wert des Nährwerts mit diesem Index zurückgibt.
	public double getNaehrwert(int feld) {
		return (naehrwerte[feld][0]);
	}

}