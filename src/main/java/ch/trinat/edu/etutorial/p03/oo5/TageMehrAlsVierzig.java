package ch.trinat.edu.etutorial.p03.oo5;

public class TageMehrAlsVierzig {
	private String name, emissionsQuelltyp;
	private int jahresMittelWert;
	
	public TageMehrAlsVierzig (String n, String e, int j) {
		name = n;
		emissionsQuelltyp = e;
		jahresMittelWert = j;
	}
	
	public void printStat() {
		System.out.println(name + " " + emissionsQuelltyp + " " + jahresMittelWert);
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

	public int getJahresMittelWert() {
		return jahresMittelWert;
	}

	public void setJahresMittelWert(int jahresMittelWert) {
		this.jahresMittelWert = jahresMittelWert;
	}
	
}
