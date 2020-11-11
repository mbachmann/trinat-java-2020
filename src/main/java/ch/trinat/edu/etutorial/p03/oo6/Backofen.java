package ch.trinat.edu.etutorial.p03.oo6;

public class Backofen extends haushaltsgerat {

	@Override
	public void stop() {
		temperatur =0;
		hitze = "aus";
		status= "bereit";
		on = false;

		// TODO Auto-generated method stub
	}


	int temperatur;
	String hitze;
	String standort ;
	String typ;
	String status;



	public Backofen (String n, String o) {
		name =n;
		standort = "Kuche" ;
		typ = "Backofen";
		status = "bereit";

	}

	public void start (int t,String h) {
		temperatur =t;
		hitze=h;
		on = true;
		status = "lauft mit "+t+" grad"+h;

	}

	public int getTemperatur() {
		return temperatur;
	}

	public void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
	}

	public String getHitze() {
		return hitze;
	}

	public void setHitze(String hitze) {
		this.hitze = hitze;
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



}
