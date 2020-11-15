package ch.trinat.edu.etutorial.p03.oo6.adressBuch2;

public class Schwimmer extends Person {

	public Schwimmer(String[] input) {
		// vererbter Konstruktor - init vom Feld Typ
		super(input);
		this.typ = "Schwimmer";
	}

}
