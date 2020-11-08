package ch.trinat.edu.etutorial.p03.oo5;

import java.util.*;

public class Messstation {
	private String id;
	private String name;
	private String emissionquelltyp;
	private String umgebungstyp;
	private int jahresmittelwert;
	private int maxTagesWert;
	private int anzhalT50;
	private int anzahlT60;


	public Messstation(String id,String name,String emissionquelltyp,String umgebungstyp,int jahresmittelwert,int maxTagesWert,int anzhalT50, int anzahlT60) {
		this.id = id;
		this.name = name;
		this.emissionquelltyp = emissionquelltyp;
		this.umgebungstyp = umgebungstyp;
		this.jahresmittelwert = jahresmittelwert;
		this.maxTagesWert = maxTagesWert;
		this.anzhalT50 = anzhalT50;
		this.anzahlT60 = anzahlT60;	
	}
	


	public void print() {
		
		System.out.println(id + " " +name + "\n Emissionsquelltyp: " + emissionquelltyp + "\n Umbgebungstyp: " + umgebungstyp + "\n Jahresmittelwert: " + jahresmittelwert + "\n");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmissionquelltyp() {
		return emissionquelltyp;
	}

	public void setEmissionquelltyp(String emissionquelltyp) {
		this.emissionquelltyp = emissionquelltyp;
	}

	public String getUmgebungstyp() {
		return umgebungstyp;
	}

	public void setUmgebungstyp(String umgebungstyp) {
		this.umgebungstyp = umgebungstyp;
	}

	public int getJahresmittelwert() {
		return jahresmittelwert;
	}

	public void setJahresmittelwert(int jahresmittelwert) {
		this.jahresmittelwert = jahresmittelwert;
	}

	public int getMaxTagesWert() {
		return maxTagesWert;
	}

	public void setMaxTagesWert(int maxTagesWert) {
		this.maxTagesWert = maxTagesWert;
	}

	public int getAnzhalT50() {
		return anzhalT50;
	}

	public void setAnzhalT50(int anzhalT50) {
		this.anzhalT50 = anzhalT50;
	}

	public int getAnzahlT60() {
		return anzahlT60;
	}

	public void setAnzahlT60(int anzahlT60) {
		this.anzahlT60 = anzahlT60;
	}
}