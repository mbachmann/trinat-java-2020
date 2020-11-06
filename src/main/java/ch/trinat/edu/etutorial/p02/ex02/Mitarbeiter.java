package ch.trinat.edu.etutorial.p02.ex02;

public class Mitarbeiter {
	
	double salery;
	int position;

	//GETTER & SETTER
	public double getSalery() {
		return salery;
	}
	public void setSalery(double salery) {
		this.salery = salery;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	//Parametrisierter Konstruktor, gefolgt von der Entscheidung des Salärs
	public Mitarbeiter (int p){
		position = p;
		setPosition(p);
		double s = 0;
		// Position 1 => Lohn zwischen 240000 und 150000
		if (p == 1) {
			do {
				s = Math.random() * 240000;
				} while (s < 150000 || s > 240000);
			salery = s;
			setSalery(s);
		}
		else if (p == 2) {
			do {
				s = Math.random() * 150000;
				} while (s < 90000 || s > 150000);
			salery = s;
			setSalery(s);
		}
		else if (p == 3) {
				do {
					s = Math.random() * 90000;
				} while (s < 60000 || s > 90000);
			salery = s;
			setSalery(s);
		}
		else {
			System.out.println("Keine Gültige Position");
		}
	}

	//Platzberechnung
	public double getSpace () {
		double space = 10 + salery/10000;
		return space;
	}
	//Equals
	public boolean equals(Mitarbeiter m) {
		if (m!=null && m.salery==this.salery && m.position==this.position) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Kopierkonstruktor
		public Mitarbeiter clone() {
			Mitarbeiter m = new Mitarbeiter(this.position);
			m.setSalery(this.salery);
			return m;
		}

}
