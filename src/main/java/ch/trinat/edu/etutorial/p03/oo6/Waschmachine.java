package ch.trinat.edu.etutorial.p03.oo6;

public class Waschmachine extends haushaltsgerat {

	@Override
	public void stop() {
		// TODO Auto-generated method stub

		status= "bereit";
		on = false;
	}



	String programm;
	double menge;
	String status = "bereit";
	String standort;
	String typ;



	public Waschmachine (String n, String o) {
		name = n ;
		standort = "Waschkuche";
		typ = "Waschmachine";

	}



	public String getStandort() { 
		return standort;
	}



	public String getTyp() {
		return typ;
	}



	public void setTyp(String typ) {
		this.typ = typ;
	}



	public void setStandort(String standort) {
		this.standort = standort;
	}



	public void start(String p,int m) {

		programm = p;
		menge =m;
		on = true ;
		status = "lauft mit Programm "+ p;
		if (menge >6) {


			fehler = true ;
			fehlermeldung = "Maschine uberladen";
			status ="fehler";


		}
	}



	public String getProgramm() {
		return programm;
	}



	public void setProgramm(String programm) {
		this.programm = programm;
	}



	public double getMenge() {
		return menge;
	}



	public void setMenge(double menge) {
		this.menge = menge;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}


}
