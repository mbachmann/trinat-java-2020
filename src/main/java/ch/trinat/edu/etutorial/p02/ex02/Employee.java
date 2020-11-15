package ch.trinat.edu.etutorial.p02.ex02;

public class Employee {

	private int salary, position;

	public Employee(int p) {

		if (p == 1) {
			int max = 240000;
			int min = 150000;
			this.salary = min + (int) (Math.random() * (max - min)) + 1;
		}
		if (p == 2) {
			int max = 150000;
			int min = 90000;
			this.salary = min + (int) (Math.random() * (max - min)) + 1;
		}
		if (p == 3) {
			int max = 90000;
			int min = 60000;
			this.salary = min + (int) (Math.random() * (max - min)) + 1;
		}
	}

	// Kopie Konstr.
	public Employee(Employee e) {
		this.salary = e.salary;
		this.position = e.position;
	}

	public int getSpace() {
		int space = 10 + this.salary / 10000;
		return space;
	}

	public boolean equals(Employee e) {
		if ((e != null) && (e.salary == this.salary) && (e.position == this.position)) {
			return true;
		} else
			return false;
	}

	public int getSalary() {
		return salary;
	}
}
