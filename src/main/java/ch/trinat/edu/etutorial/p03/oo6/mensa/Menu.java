package ch.trinat.edu.etutorial.p03.oo6.mensa;

public class Menu extends Nahrungsmittel {
	
	private Nahrungsmittel fleisch, gemuese, beilage;

	public Menu(String name, Nahrungsmittel fleisch, Nahrungsmittel gemuese, Nahrungsmittel beilage) {
		super(name);	
		this.fleisch = fleisch;
		this.gemuese = gemuese;
		this.beilage = beilage;
		berechnen();
	}
	
	private void berechnen() {
		for (int i = 0; i < naehrwerte.length; i++) {
			naehrwerte[i][0] = (fleisch.getNaehrwert(i) + gemuese.getNaehrwert(i) + beilage.getNaehrwert(i))/3.0;
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
			System.err.println("Schon gekocht!");
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
			System.err.println("Schon gefroren!");
		}
	}
	
	public void print() {
		System.out.println(name + ":\n");
		System.out.println(fleisch.getName() + " mit " + gemuese.getName() + " und " + beilage.getName());
		System.out.println("****************************************************");
		fleisch.print();
		gemuese.print();
		beilage.print();
	}
}
