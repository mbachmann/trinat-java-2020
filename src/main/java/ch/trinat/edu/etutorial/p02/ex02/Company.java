package ch.trinat.edu.etutorial.p02.ex02;

public class Company {

	public static void main(String[] args) {

		// array employees mit 100x Employee
		Employee employees[] = new Employee[100];

		for (int i = 0; i < 10; i++) {// 10 execs
			employees[i] = new Employee(1);
		}
		for (int i = 10; i < 40; i++) {// 30 managers
			employees[i] = new Employee(2);
		}
		for (int i = 40; i < 100; i++) {// 60 Mitarbeiter
			employees[i] = new Employee(3);
		}

		// Büroplatz in Quadratmeter
		int totalSpace = 0;
		for (int i = 0; i < 100; i++) {
			totalSpace += employees[i].getSpace();
		}
		System.out.println("Total office space needed for the company: " + totalSpace + " m^2");

		// Jahreslohn
		int totalSalary = 0;
		for (int i = 0; i < 100; i++) {
			totalSalary += employees[i].getSalary();
		}
		System.out.println("Total annual salary: " + totalSalary);
	}
}
