package ch.trinat.edu.etutorial.p03.oo5;


public class Messstation {
	
	private String id;
	private String name, umbgebungstyp ;
	private String emissionsquelltyp;
	private int jahresmittelwert,maxtageswert,tagemehrals50,tagemehrals60;
	public static double durchschnitt=0;
	
	
	
	
	
	public Messstation(String id, String name, String umbgebungstyp, String emissionsquelltyp, int jahresmittelwert,
			int maxtageswert, int tagemehrals50, int tagemehrals60) {
	
		this.id = id;
		this.name = name;
		this.umbgebungstyp = umbgebungstyp;
		this.emissionsquelltyp = emissionsquelltyp;
		this.jahresmittelwert = jahresmittelwert;
		this.maxtageswert = maxtageswert;
		this.tagemehrals50 = tagemehrals50;
		this.tagemehrals60 = tagemehrals60;
	}
	public  String getId() {
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
	public String getUmbgebungstyp() {
		return umbgebungstyp;
	}
	public void setUmbgebungstyp(String umbgebungstyp) {
		this.umbgebungstyp = umbgebungstyp;
	}
	public String getEmissionsquelltyp() {
		return emissionsquelltyp;
	}
	public void setEmissionsquelltyp(String emissionsquelltyp) {
		this.emissionsquelltyp = emissionsquelltyp;
	}
	public int getJahresmittelwert() {
		return jahresmittelwert;
	}
	public void setJahresmittelwert(int jahresmittelwert) {
		this.jahresmittelwert = jahresmittelwert;
	}
	public int getMaxtageswert() {
		return maxtageswert;
	}
	public void setMaxtageswert(int max_tageswert) {
		this.maxtageswert = max_tageswert;
	}
	public int getTagemehrals50() {
		return tagemehrals50;
	}
	public void setTagemehrals50(int tagemehrals50) {
		this.tagemehrals50 = tagemehrals50;
	}
	public int getTagemehrals60() {
		return tagemehrals60;
	}
	public void setTagemehrals60(int tagemehrals60) {
		this.tagemehrals60 = tagemehrals60;
	}
	public void Durchschnitt() {
		durchschnitt = durchschnitt + jahresmittelwert;
	}
	
	public void Print() {
	
		System.out.println(id + " " + name + 
				"\n Umgebungstyp: "+ emissionsquelltyp+
				"\n Emissionsquellentyp: " + umbgebungstyp + 
				"\n Jahresmittelwert: " + jahresmittelwert +" \u03BCg/m3"+
				"\n Maximaler Tageswert " + maxtageswert+ " \u03BCg/m3"+
				"\n Tage mit Tageswerten > 50 \u03BCg/m3: " + tagemehrals50 + 
				"\n Tage mit Tageswerten > 60 \u03BCg/m3: " + tagemehrals60 ) ;
	}
	public void Grenzwert() {
		if (jahresmittelwert>40) {
		System.out.println(name +" ,"+emissionsquelltyp +" ,"+ jahresmittelwert);
		}
	}

		
	}
	
	
