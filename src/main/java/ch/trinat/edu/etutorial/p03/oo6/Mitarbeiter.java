package ch.trinat.edu.etutorial.p03.oo6;

import java.util.GregorianCalendar;

public class Mitarbeiter extends Person {

	String métier, boite;

	public Mitarbeiter(String n, String v, String s, int h, int p, String w, GregorianCalendar g, String métier) {
		super(n, v, s, h, p, w, g);
		this.métier = métier;
	}
	
	
}

