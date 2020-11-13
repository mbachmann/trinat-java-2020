package ch.trinat.edu.etutorial.p03.oo6.MensaMenus;

public class Menu extends Nahrungsmittel {
	
	Nahrungsmittel fleisch;
	Nahrungsmittel gemuse;
	Nahrungsmittel beilage;
	
	public Menu (String n, Nahrungsmittel f, Nahrungsmittel g, Nahrungsmittel b) {
		super(n);
		fleisch = f;
		gemuse = g;
		beilage = b;
		berechnen();
	}
	
	private void berechnen() {
		for (int i = 0; i < naehrwerte.length; i ++) {
			naehrwerte[i][0] = (fleisch.getNaehrwert(i) + gemuse.getNaehrwert(i) + beilage.getNaehrwert(i))/3.0;
		}
	}
	
	public void kochen() {
		if(!gekocht) {
			fleisch.kochen();
			gemuse.kochen();
			beilage.kochen();
			berechnen();
			gekocht = true;
		}
		else {
			System.err.println("Schon gekocht!");
		}
	}
	
	public void gefroren() {
		if(!gefroren) {
			fleisch.gefrieren();
			gemuse.gefrieren();
			beilage.gefrieren();
			berechnen();
			gefroren = true;
		}
		else {
			System.err.println("Schon gefroren!");
		}
		
	}

}
