package ch.trinat.edu.etutorial.p02.ex02.boxFactory;

public class Box {
	private int höhe, breite, tiefe;

	public int getHöhe() {
		return höhe;
	}

	public void setHöhe(int höhe) {
		this.höhe = höhe;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public int getTiefe() {
		return tiefe;
	}

	public void setTiefe(int tiefe) {
		this.tiefe = tiefe;
	}
	
	//Default-Konstruktor - Radius auf 1 setzen.
	public Box() {
		höhe = 1;
		breite = 1;
		tiefe = 1;
	}
		
	//Parametrisierter Konstruktor.
	public Box(int höhe, int breite, int tiefe){
		this.höhe = höhe;
		this.breite = breite;
		this.tiefe = tiefe;
	}
		
	//Kopier-Konstruktor.
	public Box(Box b) {
		höhe = b.getHöhe();
		breite = b.getBreite();
		tiefe = b.getTiefe();
	}
	
	// Methode getVolume() welche das Volumen der Box zurückgibt.
	public int getVolume() {
		int volume = höhe*breite*tiefe;
		return volume;
	}
	
	//Methode getSurface() welche die Oberfläche der Box zurückgibt.
	public int getSurface() {
		int surface = ((höhe*breite)+(höhe*tiefe)+(breite*tiefe))*2;
		return surface;
	}
	
	//Vergleichsmethode equals(), welche vergleicht, ob zwei Boxen den gleichen Inhalt haben.
	public boolean equals(Box b) {
	    if (b != null && b.höhe == this.höhe && b.breite == this.breite && b.tiefe == this.tiefe) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
