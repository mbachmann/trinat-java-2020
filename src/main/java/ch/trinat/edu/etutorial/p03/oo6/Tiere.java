package ch.trinat.edu.etutorial.p03.oo6;

import java.util.GregorianCalendar;

public class Tiere extends Person {

	String besitzer, race;
	
	public Tiere(String n, String v, String s, int h, int p, String w, GregorianCalendar g, String besitzer) {
		super(n, v, s, h, p, w, g);
		this.besitzer = besitzer;
	}
	
}

