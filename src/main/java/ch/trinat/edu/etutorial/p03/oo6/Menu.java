package ch.trinat.edu.etutorial.p03.oo6;

public class Menu extends Nahrungsmittel {
	Nahrungsmittel fleisch, gemuese, beilage;



	public Menu (String name,Nahrungsmittel fleisch,Nahrungsmittel gemuese, Nahrungsmittel beilage) {
		super (name);
		this.fleisch = fleisch;
		this.gemuese = gemuese;
		this.beilage = beilage;
		berechnen();
	}

	private void berechnen() {
		for( int i = 0; i < naehrwerte.length; i++) {
			naehrwerte[i][0] = (fleisch.getNaehrwert(i) + gemuese.getNaehrwert(i) + beilage.getNaehrwert(i))/3.0;
		}

	}

	public void kochen() {
		if(!gekocht) {
			fleisch.gekocht();
			gemuese.gekocht();
			beilage.gekocht();
			berechnen();
			gekocht =  true;
		}
		else {
			System.err.println("Schon gekocht!");
		}
	}
	
	public void gefrieren() {
		if(!gekocht) {
			fleisch.gefroren();
			gemuese.gefroren();
			beilage.gefroren();
			berechnen();
			gekocht =  true;
		}
		else {
			System.err.println("Schon gekocht!");
		}
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(fleisch.getName() + " mit " + gemuese.getName() + " und " + beilage.getName());
		System.out.println("*******************");
		for (int i = 0; i < naehrwerte.length ; i ++) {
			System.out.println(namen[i]+": " + naehrwerte[i][0] + " " + einheiten[i]);
		}
	}

}