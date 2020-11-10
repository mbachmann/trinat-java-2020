package ch.trinat.edu.etutorial.p03.oo5;
import java.text.SimpleDateFormat;

public class Messstation {
	private String id, name, emission, umgebung;
	private int jahresmittelwert, maxwert, tage50, tage60;





	public  Messstation(String id, String name, String emission, String umgebung,
			int jahresmittelwert, int maxwert, int tage50, int tage60) {

		this.id = id;
		this.name = name;
		this.emission = emission;
		this.umgebung = umgebung;
		this.jahresmittelwert = jahresmittelwert;
		this.maxwert = maxwert;
		this.tage50 = tage50;
		this.tage60 = tage60;

	}
	
	public String print2() {
		return ( name);
			
	}

	public void printausgabe() {
		System.out.println (
				"Id:" + id + 
				"\n" + name + 
				"\n" + "Emission: " + emission + 
				"\n" + "Jahresmittelwert: " + jahresmittelwert + 
				"\n" + "Max Tageswert: " + maxwert +
				"\n" + "Tage mit max Tages Wert uber 50: " + tage50 +
				"\n" + "Tage mit max Tages Wert uber 60: " + tage60);

	}

	
	public String print() {
		return (
				"Id:" + id + 
				"\n" + name + 
				"\n" + "Emission: " + emission + 
				"\n" + "Jahresmittelwert: " + jahresmittelwert + 
				"\n" + "Max Tageswert: " + maxwert +
				"\n" + "Tage mit max Tages Wert uber 50: " + tage50 +
				"\n" + "Tage mit max Tages Wert uber 60: " + tage60);

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


	public String getEmission() {
		return emission;
	}

	public void setEmission(String emission) {
		this.emission = emission;
	}


	public String getUmgebung() {
		return umgebung;
	}

	public void setUmgebung(String umgebung) {
		this.umgebung = umgebung;
	}


	public int getJahresmittelwert() {
		return jahresmittelwert;
	}

	public void setJahresmittelwert(int jahresmittelwert) {
		this.jahresmittelwert = jahresmittelwert;
	}


	public int getMaxwert() {
		return maxwert;
	}

	public void setMaxwert(int maxwert) {
		this.maxwert = maxwert;
	}


	public int getTage50() {
		return tage50;
	}

	public void setTage50(int tage50) {
		this.tage50 = tage50;
	}


	public int getTage60() {
		return tage60;
	}

	public void setTage60(int tage60) {
		this.tage60 = tage60;
	}

}
