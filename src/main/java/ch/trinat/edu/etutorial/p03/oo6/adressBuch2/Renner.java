package ch.trinat.edu.etutorial.p03.oo6.adressBuch2;

public class Renner extends Person {

	public Renner(String[] input) {
		// vererbter Konstruktor - init vom Feld Typ
		super(input);
		this.typ = "Renner";
	}

}
