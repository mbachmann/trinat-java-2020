package ch.trinat.edu.etutorial.p03.oo6;

public abstract class haushaltsgerat {

	protected	String typ;
	protected	String name;
	protected	String standort;
	protected	String statusmeldung;
	protected	String fehlermeldung;
	protected boolean on ;
	protected boolean fehler ;
	String status;

	public boolean isOn () {
		return on;
	}


	public boolean hatFehler () {
		return fehler;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandort() {
		return standort;
	}
	public void setStandort(String standort) {
		this.standort = standort;
	}
	public String getStatusmeldung() {
		return statusmeldung;
	}
	public void setStatusmeldung(String statusmeldung) {
		this.statusmeldung = statusmeldung;
	}
	public boolean isFehler() {
		return fehler;
	}


	public void setFehler(boolean fehler) {
		this.fehler = fehler;
	}


	public void setOn(boolean on) {
		this.on = on;
	}


	public String getFehlermeldung() {
		return fehlermeldung;
	}
	public void setFehlermeldung(String fehlermeldung) {
		this.fehlermeldung = fehlermeldung;
	}


	public abstract void stop ();





}
