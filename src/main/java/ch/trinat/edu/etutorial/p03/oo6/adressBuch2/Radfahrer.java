package ch.trinat.edu.etutorial.p03.oo6.adressBuch2;

public class Radfahrer extends Person {

	public Radfahrer(String[] input) {
		// vererbter Konstruktor - init vom Feld Typ
		super(input);
		this.typ = "Radfahrer";
	}

}
