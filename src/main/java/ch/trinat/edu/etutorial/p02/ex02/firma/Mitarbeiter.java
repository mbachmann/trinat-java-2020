package ch.trinat.edu.etutorial.p02.ex02.firma;

public class Mitarbeiter {
	private int salary, position;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	// Parametrisierter Konstruktor.
	public Mitarbeiter(int salary, int position){
		this.salary = salary;
		this.position = position;
	}
	
	//Kopier-Konstruktor
	public Mitarbeiter(Mitarbeiter m) {
		salary = m.getSalary();
		position = m.getPosition();
	}
	
	// Diese Methode berechnet, wie viel Platz ein Mitarbeiter benötigt.
	public int getSpace() {
		int space;
		space = 10+salary/10000;
		return space;
	}
	
	// Vergleichsmethode equals(), welche vergleicht, ob zwei Mitarbeiter die gleiche Position und das gleiche Gehalt haben.
		public boolean equals(Mitarbeiter m) {
		    if (m != null && m.salary == this.salary && m.position == this.position) {
		        return true;
		    } else {
		        return false;
		    }
		}
		
		public void print() {
			System.out.println("Position: " + position);
			System.out.println("Gehalt: " + salary + "€");
		}
}
