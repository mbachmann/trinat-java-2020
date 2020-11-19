package ch.trinat.edu.etutorial.p03.oo6;

import java.util.GregorianCalendar;

public class Studierende extends Person {

	String école, formation;
	
	public Studierende(String n, String v, String s, int h, int p, String w, GregorianCalendar g, String école) {
		super(n, v, s, h, p, w, g);
		this.école = école;
	}
}
