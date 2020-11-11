package ch.trinat.edu.etutorial.p03.oo6;

public class Mikrowelle extends haushaltsgerat {

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		temperatur =0;
		hitze = 0;
		status= "bereit";
		on = false;
	}


	int leistung; 
	double minuten;
	String standort ;
	String typ;
	String status;
	int temperatur;
	double hitze;



	public Mikrowelle (String n, String o) {
		name =n;
		standort = "Kuche" ;
		typ = "Mikrowelle";
		status = "bereit";

	}


	public void start (int t,double d) {
		temperatur =t;
		hitze=d;
		on = true;
		status = "lauft mit "+t+" grad"+d;

	}


	public int getLeistung() {
		return leistung;
	}


	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}


	public double getMinuten() {
		return minuten;
	}


	public void setMinuten(double minuten) {
		this.minuten = minuten;
	}


	public String getStandort() {
		return standort;
	}


	public void setStandort(String standort) {
		this.standort = standort;
	}


	public String getTyp() {
		return typ;
	}


	public void setTyp(String typ) {
		this.typ = typ;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getTemperatur() {
		return temperatur;
	}


	public void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
	}


	public double getHitze() {
		return hitze;
	}


	public void setHitze(double hitze) {
		this.hitze = hitze;
	}




}
