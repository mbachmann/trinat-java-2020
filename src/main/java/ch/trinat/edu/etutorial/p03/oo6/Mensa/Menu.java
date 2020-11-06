package ch.trinat.edu.etutorial.p03.oo6.Mensa;

public class Menu extends Nahrungsmittel {
	
	Nahrungsmittel fleisch;
	Nahrungsmittel gemuese;
	Nahrungsmittel beilage;

	
	public Menu (String n, Nahrungsmittel fleisch, Nahrungsmittel gemuese, Nahrungsmittel beilage) {
		super(n);
		this.fleisch = fleisch;
		this.gemuese = gemuese;
		this.beilage = beilage;
		berechnen();
	}
	
	private void berechnen () {
		for (int i=0 ; i<naehrwerte.length ; i++) {
			naehrwerte[i][0] = (fleisch.getNaehrwerte(i) + gemuese.getNaehrwerte(i) + beilage.getNaehrwerte(i))/3.0;
		}
	}
	
	public void kochen () {
		if (!gekocht) {
			fleisch.kochen();
			gemuese.kochen();
			beilage.kochen();
			berechnen();
			gekocht = true;
		}
		else {
			System.out.println("Befindet sich bereits in der Pfanne");
		}
	}
	
	public void gefrieren () {
		if (!gefroren) {
			fleisch.gefrieren();
			gemuese.gefrieren();
			beilage.gefrieren();
			berechnen();
			gefroren = true;
		}
		else {
			System.out.println("Befindet sich schon in Ihrem Tiefkühler");
		}
	}
	
	public void printInfo () {
		System.out.println(name);
		System.out.println(fleisch.getName() + " mit " + gemuese.getName() + " und " + beilage.getName());
		System.out.println("-----------------------------------");
		for (int i=0 ; i<naehrwerte.length ; i++) {
			System.out.println(namen [i] + ": " + naehrwerte[i][0] + " " + einheiten [i]);
		}
		System.out.println();
	}
	
}
