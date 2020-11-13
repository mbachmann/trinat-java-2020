package ch.trinat.edu.etutorial.p03.oo5;

public class MessstationDaten {

	private String id, name, emissionsQuelltyp, umgebungsTyp;
	private int jahresMittelWert, maxiTagWert, tageMehrAlsFunfzig, tageMehrAlsSechzig;
	
	public MessstationDaten (String i, String n, String e, String u, int j, int m, int tf, int ts) {
		id = i;
		name = n;
		emissionsQuelltyp = e;
		umgebungsTyp = u;
		jahresMittelWert = j;
		maxiTagWert = m;
		tageMehrAlsFunfzig = tf;
		tageMehrAlsSechzig = ts;
	}
	
	public void print() {
		System.out.println(id + " " + name);
		System.out.println("Emissionsquelltyp: " + emissionsQuelltyp);
		System.out.println("Umgebungstyp: " + umgebungsTyp);
		System.out.println("Jahresmittelwert: " + jahresMittelWert);
		System.out.println("Maximale Tagswert: " + maxiTagWert);
		System.out.println("Tage mit Tageswerten uber 50\u03BCg/m3: " + tageMehrAlsFunfzig);
		System.out.println("Tage mit Tageswerten uber 60\u03BCg/m3: " + tageMehrAlsSechzig);
	}
	
	public void TageMehrAlsVierzig (String n, String e, int j) {
		name = n;
		emissionsQuelltyp = e;
		jahresMittelWert = j;
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

	public String getEmissionsQuelltyp() {
		return emissionsQuelltyp;
	}

	public void setEmissionsQuelltyp(String emissionsQuelltyp) {
		this.emissionsQuelltyp = emissionsQuelltyp;
	}

	public String getUmgebungsTyp() {
		return umgebungsTyp;
	}

	public void setUmgebungsTyp(String umgebungsTyp) {
		this.umgebungsTyp = umgebungsTyp;
	}

	public int getJahresMittelWert() {
		return jahresMittelWert;
	}

	public void setJahresMittelWert(int jahresMittelWert) {
		this.jahresMittelWert = jahresMittelWert;
	}

	public int getMaxiTagWert() {
		return maxiTagWert;
	}

	public void setMaxiTagWert(int maxiTagWert) {
		this.maxiTagWert = maxiTagWert;
	}

	public int getTageMehrAlsFunfzig() {
		return tageMehrAlsFunfzig;
	}

	public void setTageMehrAlsFunfzig(int tageMehrAlsFunfzig) {
		this.tageMehrAlsFunfzig = tageMehrAlsFunfzig;
	}

	public int getTageMehrAlsSechzig() {
		return tageMehrAlsSechzig;
	}

	public void setTageMehrAlsSechzig(int tageMehrAlsSechzig) {
		this.tageMehrAlsSechzig = tageMehrAlsSechzig;
	}
	
}
