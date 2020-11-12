package Selbständige;

import java.util.GregorianCalendar;

public class Tiere extends Person {

	String besitzer, race;
	
	public Tiere(String n, String v, String s, int h, int p, String w, GregorianCalendar g, String besitzer) {
		super(n, v, s, h, p, w, g);
		this.besitzer = besitzer;
	}

	
	
	
}
