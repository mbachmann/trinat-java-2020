package ch.trinat.edu.etutorial.p03.oo6;

public class Menu extends Nahrungsmittel {
	
	Nahrungsmittel fleisch;
	Nahrungsmittel gemuese;
	Nahrungsmittel beilage;
	
	public Menu (String n, Nahrungsmittel f, Nahrungsmittel g, Nahrungsmittel b) {
		super(n);
		super.print();
		fleisch = f;
		gemuese = g;
		beilage = b;
		berechnen();
	}
	
	private void berechnen() {
		for (int i = 0; i < naehrwerte.length; i++) {
			naehrwerte[i] [0] = (fleisch.getNaehrwert(i) + gemuese.getNaehrwert(i) + beilage.getNaehrwert(i))/3.0;
		}
	}
	
	public void kochen() {
		if (!gekocht) {
			fleisch.kochen();
			gemuese.kochen();
			beilage.kochen();
			berechnen();
			gekocht = true;
		}
		else {
			System.err.println("Schon gekocht");
		}
	}
	
	public void gefrieren() {
		if (!gefroren) {
			fleisch.gefrieren();
			gemuese.gefrieren();
			beilage.gefrieren();
			berechnen();
			gefroren = true;
		}
		else {
			System.err.println("Schon gefroren");
		}
		
	}

}
