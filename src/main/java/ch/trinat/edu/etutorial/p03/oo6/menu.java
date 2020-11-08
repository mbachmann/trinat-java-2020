package ch.trinat.edu.etutorial.p03.oo6;

public class menu extends Nahrungsmittel {

	Nahrungsmittel fleisch, gemuese, beilage;

	public menu (String name, Nahrungsmittel fleisch, Nahrungsmittel gemuese, Nahrungsmittel beilage) {
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
		if(!gekocht) {
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
		if(!gefrieren) {
			fleisch.gefrieren();
			gemuese.gefrieren();
			beilage.gefrieren();
			berechnen();
			gefrieren = true;
		}
		else {
			System.err.println("Schon gefroren!");
		}
	}

	public void print() {
		System.out.println("Menu 1: \n" + fleisch.getName() + " mit " + gemuese.getName() + " und " + beilage.getName() + ".");
		System.out.println("****************** Naehrwerte ***********************");
		for(int i = 0; i < naehrwerte.length; i++) {
			System.out.println(namen[i] + " " + naehrwerte[i][0] + einheiten[i]);
		}
	}

}


