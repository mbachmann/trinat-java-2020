package ch.trinat.edu.etutorial.p03.oo6;

public class Nahrungsmittel {
	protected boolean gekocht, gefroren;
	protected String name;
	protected double [][] naehrwerte;

	protected final String [] namen = {"Energie", "Wasser", "Protein", "Fett", "Kohlenhydrate", "Ballaststoffe", "Vitamin A",
			"Beta-Carotin", "Vitamin B1", "Vitamin B2", "Vitamin B6", "Vitamin B12", "Folsäure", "Vitamin C", "Vitamin D",
			"Vitamin E", "Calcium", "Chlor", "Kalium", "Magnesium", "Natrium", "Phosphor", "Eisen", "Fluor", "Jod",
			"Zink", "Cholesterin", "Mehrfach ungesättigte Fettsäuren"};

	protected final String [] einheiten = {"kJ", "g", "g", "g", "g", "g", "Mikrogramm", "Mikrogramm", "Mikrogramm" ,"Mikrogramm",
			"Mikrogramm","Mikrogramm", "Mikrogramm", "mg", "Mikrogramm", "Mikrogramm", "mg", "mg", "mg", "mg", "mg", "mg",
			"mg", "Mikrogramm", "Mikrogramm", "Mikrogramm", "g", "g"};


	public Nahrungsmittel(String name, boolean gekocht, boolean gefroren) {
		this.gekocht = gekocht;
		this.gefroren = gefroren;
		this.name = name;
		gekocht = false;
		gefroren = false;
		naehrwerte = new double[28][3]; //Initialisierung für 28 Nährwerte, 3 Werte pro Nährwert
	}
	
	public Nahrungsmittel(String name) {
		this.name =name;
		gekocht = false;
		gefroren = false;
		naehrwerte = new double[28][3]; //Initialisierung für 28 Nährwerte, 3 Werte pro Nährwert
	}

	public void print(){

		System.out.println(name+"\n"+"*******************");
		for (int i = 0; i < naehrwerte.length ; i ++) {
			System.out.println(namen[i]+": " + naehrwerte[i][0] + " " + einheiten[i]);
		}
	}

	public void gefroren() {
		if(!gefroren) {
			for(int j=0; j<naehrwerte.length; j++) {
				naehrwerte[j][0] = naehrwerte[j][0]*naehrwerte[j][1];
			}
			gefroren = true;
		}
		else {
			System.err.println("Schon gefroren!");
		}
	}

	public void gekocht() {
		if(!gekocht) {
			for(int i = 0; i<naehrwerte.length; i++ ) {
				naehrwerte[i][0]=naehrwerte[i][0]*naehrwerte[i][2];
			}
			gekocht = true;
		}
		else {
			System.err.println("Schon gekocht!");
		}
	}


	public double getNaehrwert(int feld) {
		return (naehrwerte[feld][0]);
		
	}

	public String[] getNamen() {
		return namen;
	}

	public void setNaehrwerte(double[][] naehrwerte) {
		this.naehrwerte = naehrwerte;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isGekocht() {
		return gekocht;
	}


	public void setGekocht(boolean gekocht) {
		this.gekocht = gekocht;
	}


	public boolean isGefroren() {
		return gefroren;
	}


	public void setGefroren(boolean gefroren) {
		this.gefroren = gefroren;
	}




}