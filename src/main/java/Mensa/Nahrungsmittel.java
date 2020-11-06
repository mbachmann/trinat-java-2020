package Mensa;

public class Nahrungsmittel {
	
	protected double [][] naehrwerte;
	
	protected final String [] namen = {"Energie", "Wasser", "Protein", "Fett", "Kohlenhydrate", "Ballaststoffe", "Vitamin A",
            "Beta-Carotin", "Vitamin B1", "Vitamin B2", "Vitamin B6", "Vitamin B12", "Folsäure", "Vitamin C", "Vitamin D",
            "Vitamin E", "Calcium", "Chlor", "Kalium", "Magnesium", "Natrium", "Phosphor", "Eisen", "Fluor", "Jod",
            "Zink", "Cholesterin", "Mehrfach ungesättigte Fettsäuren"};
	
	protected final String [] einheiten = {"kJ", "g", "g", "g", "g", "g", "Mikrogramm", "Mikrogramm", "Mikrogramm" ,"Mikrogramm",
        "Mikrogramm","Mikrogramm", "Mikrogramm", "mg", "Mikrogramm", "Mikrogramm", "mg", "mg", "mg", "mg", "mg", "mg",
        "mg", "Mikrogramm", "Mikrogramm", "Mikrogramm", "g", "g"};
	
	String name;
	
	protected boolean gekocht;
	protected boolean gefroren;
	
	public Nahrungsmittel (String n) {
		name = n;
		naehrwerte = new double [28][3];		//28 Naehrwerte, 3 Werte pro Naehrwert
		gekocht = false;
		gefroren = false;
	}
	
	public void printInfo () {
		System.out.println(name + ":\n" + "------------------------");
		for (int i=0 ; i<naehrwerte.length ; i++) {
			System.out.println(namen [i] + ": " + naehrwerte[i][0] + " " + einheiten [i]);
		}
		System.out.println();
	}

	public void setNaehrwerte(double[][] naehrwerte) {
		this.naehrwerte = naehrwerte;
	}
	
	public void gefrieren () {
		if (!gefroren) {
			for (int i=0 ; i<naehrwerte.length ; i++) {
				naehrwerte[i][0] = naehrwerte[i][0] * naehrwerte[i][1];
			}
			gefroren = true;
		}
		else {
			System.out.println("Befindet sich schon in Ihrem Tiefkühler");
		}
	}
	
	public void kochen () {
		if (!gekocht) {
			for (int i=0 ; i<naehrwerte.length ; i++) {
				naehrwerte[i][0] = naehrwerte[i][0] * naehrwerte[i][2];
			}
			gekocht = true;
		}
		else {
			System.out.println("Befindet sich bereits in der Pfanne");
		}
	}
	
	public double getNaehrwerte (int feld) {
		return (naehrwerte[feld][0]);
	}

	public String getName() {
		return name;
	}
}
