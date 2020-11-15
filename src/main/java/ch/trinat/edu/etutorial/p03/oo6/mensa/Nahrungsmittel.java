package ch.trinat.edu.etutorial.p03.oo6.mensa;

public class Nahrungsmittel {

	String name;
	protected boolean gekocht, gefroren;

	protected double naehrwerte[][];

	protected final String[] namen = { "Energie", "Wasser", "Protein", "Fett", "Kohlenhydrate", "Ballaststoffe",
			"Vitamin A", "Beta-Carotin", "Vitamin B1", "Vitamin B2", "Vitamin B6", "Vitamin B12", "Folsaüre",
			"Vitamin C", "Vitamin D", "Vitamin E", "Calcium", "Chlor", "Kalium", "Magnesium", "Natrium", "Phosphor",
			"Eisen", "Fluor", "Jod", "Zink", "Cholesterin", "Mehrfach ungesättigte Fettsäuren" };

	protected final String[] einheiten = { "kJ", "g", "g", "g", "g", "g", "Mikrogramm", "Mikrogramm", "Mikrogramm",
			"Mikrogramm", "Mikrogramm", "Mikrogramm", "Mikrogramm", "mg", "Mikrogramm", "Mikrogramm", "mg", "mg", "mg",
			"mg", "mg", "mg", "mg", "Mikrogramm", "Mikrogramm", "Mikrogramm", "g", "g" };

	// Konstruktor
	public Nahrungsmittel(String name) {
		this.name = name;
		this.gekocht = false;
		this.gefroren = false;
		naehrwerte = new double[28][3]; // 28 Nährwerte, je 3 Werte
	}

	// print Methode
	public void print() {
		System.out.println("--- " + name + ": ---\n");
		for (int i = 0; i < 28; i++) {
			System.out.println(namen[i] + ": " + naehrwerte[i][0] + " " + einheiten[i]);
		}
		System.out.println();
	}

	// kochen() und gefrieren(): Wert mit Faktor multipliziert > neue Wert
	public void kochen() {
		if (!gekocht) {
			for (int i = 0; i < naehrwerte.length; i++) {
				naehrwerte[i][0] *= naehrwerte[i][1];
			}
		}
		this.gekocht = true;
	}

	public void gefrieren() {
		if (!gefroren) {
			for (int i = 0; i < naehrwerte.length; i++) {
				naehrwerte[i][0] *= naehrwerte[i][2];
			}
		}
		this.gefroren = true;
	}

	public void setNaehrwerte(double[][] naehrwerte) {
		this.naehrwerte = naehrwerte;
	}

	public String getName() {
		return name;
	}

	public double getNaehrwert(int n) {
		return naehrwerte[n][0];
	}

}
