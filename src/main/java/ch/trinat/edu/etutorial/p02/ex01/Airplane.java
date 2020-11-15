package ch.trinat.edu.etutorial.p02.ex01;

public class Airplane {

	// Attribute
	String name;
	int idNumber, seats;
	double speed, range;

	// Methode print
	void printInfo() {
		System.out.println(name + ":\t" + seats + " seats" + "\t" + "Speed: " + speed + " km/h" + "\t" + "Range: "
				+ range + " km");
	}

	// Methode Flugzeit
	double getTime(double dist) {
		double time = 0;
		time = dist / speed;
		return time;
	}

	// Methode Kapazität
	int getCapacity(int days) {
		int capacity = days * seats;
		return capacity;
	}

}
