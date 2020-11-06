package ch.trinat.edu.etutorial.p03.oo5;

public class Messstation {

	private String id;
	private String name;
	private String emissionsquelltyp;
	private String umgebungstyp;
	private int jahresMittelWert;
	private int maxTagesWert;
	private int tagesWert50;
	private int tagesWert60;

	public Messstation(String string) {
	}

	public String getId() {
		return id;
	}

	public void setId(String id1) {
		this.id = id1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}
	
	public String getEmissionsquelltyp() {
		return emissionsquelltyp;
	}

	public void setEmissionsquelltyp(String e) {
		this.emissionsquelltyp = e;
	}

	public String getUmgebungstyp() {
		return umgebungstyp;
	}

	public void setUmgebungstyp(String u) {
		this.umgebungstyp = u;
	}

	public int getJahresMittelWert() {
		return jahresMittelWert;
	}

	public void setJahresMittelWert(int j) {
		this.jahresMittelWert = j;
	}

	public int getMaxTagesWert() {
		return maxTagesWert;
	}

	public void setMaxTagesWert(int m) {
		this.maxTagesWert = m;
	}

	public int gettagesWert50() {
		return tagesWert50;
	}

	public void settagesWert50(int t50) {
		this.tagesWert50 = t50;
	}

	public int gettagesWert60() {
		return tagesWert60;
	}

	public void settagesWert60(int t60) {
		this.tagesWert60 = t60;
	}



	public Messstation (String id1, String n, String e, String u, int j, int m, int t50, int t60) {
		super();
		id = id1;
		name = n;
		emissionsquelltyp = e;
		umgebungstyp = u;
		jahresMittelWert = j;
		maxTagesWert = m;
		tagesWert50 = t50;
		tagesWert60 = t60;
	
	}
}
