package ch.trinat.edu.etutorial.p03.oo6;

public class Nahrungsmittel {

	protected double[][] naehrwerte;
	protected final String [] namen = {"Energie", "Wasser", "Protein", "Fett", "Kohlenhydrate", "Ballaststoffe", "Vitamin A",
			"Beta-Carotin", "Vitamin B1", "Vitamin B2", "Vitamin B6", "Vitamin B12", "Folsäure", "Vitamin C", "Vitamin D",
			"Vitamin E", "Calcium", "Chlor", "Kalium", "Magnesium", "Natrium", "Phosphor", "Eisen", "Fluor", "Jod",
			"Zink", "Cholesterin", "Mehrfach ungesättigte Fettsäuren"};
	protected final String [] einheiten = {"kJ", "g", "g", "g", "g", "g", "µg", "µg", "µg" ,"µg",
			"µg","µg", "µg", "mg", "µg", "µg", "mg", "mg", "mg", "mg", "mg", "mg",
			"mg", "µg", "µg", "µg", "g", "g"};
	protected String name;
	protected boolean gekocht, gefrieren;

	public Nahrungsmittel (String name) {
		this.name = name;
		naehrwerte = new double[28][3];
		gekocht = false;
		gefrieren = false;
	}

	public void gefrieren() {
		if(!gefrieren) {
			for(int i = 0; i < naehrwerte.length; i++) {
				naehrwerte[i][0] *= naehrwerte[0][1];
			}
			gefrieren = true;
		}
		else {
			System.err.println("Schon gefroren!");
		}
	}

	public void kochen() {
		if(!gekocht) {
			for(int i = 0; i < naehrwerte.length; i++) {
				naehrwerte[i][0] *= naehrwerte[i][2];
			}
			gekocht = true;
		}
		else {
			System.err.println("Schon gefroren!");
		}

	}


	void print() {
		System.out.println(name + "\n" + "************************");

		for(int i = 0; i < 28; i++) {
			System.out.println(namen[i] + " " + naehrwerte[i][0] + einheiten[i]);
		}
		System.out.println(" ");
	}

	public void setNaehrwerte(double[][] naehrwerte) {
		this.naehrwerte = naehrwerte;
	}

	public String getName() {
		return name;
	}
	public double getNaehrwert(int feld) {
		return(naehrwerte[feld][0]);
	}
}
