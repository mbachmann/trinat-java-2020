package Selbständige;

import java.util.GregorianCalendar;

public class Mitarbeiter extends Person {

	String métier, boite;

	public Mitarbeiter(String n, String v, String s, int h, int p, String w, GregorianCalendar g, String métier) {
		super(n, v, s, h, p, w, g);
		this.métier = métier;
	}
	
	

}

/* je te montre ici à quoi ressemble mon constructor Person ;)
 * 
 * public Person (String n, String v, String s, int h, int p, String w, GregorianCalendar g) {
		setName(n);
		setVorname(v);
		setGeburtsdatum(g);
		setStrasse(s);
		setWohnort(w);
		setHausnummer(h);
		setPostleitzahl(p);

	}
 */