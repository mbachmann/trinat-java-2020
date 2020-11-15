package ch.trinat.edu.etutorial.p02.ex02;

public class TelephoneBook {

	public static void main(String[] args) {

		// Generierung der Objekte - wegen Kontruktoren nicht möglich
		Person mother = new Person("Helen", 19600508, 792444864);
		Person father = new Person("Robert", 19580301, 791112233);
		Person sister1 = new Person("Eva", 19911808, 793334455);
		Person sister2 = new Person("Ditte", 19820508, 795556677);
		Person sisterTel = new Person(sister2); // Kopie mit Kopie Kontruktor
		Person sisterTel2 = sisterTel.clone(); // Kopie mit clone Methode
		sisterTel.setNumber(420);

		/*
		 * -- geht nicht mehr: private Zugriffprivileg auf die Person-Attribute --
		 * 
		 * mother.name = "Helen"; mother.date = 19600508; mother.number = 792444864;
		 * 
		 * father.name = "Robert"; father.date = 19580301; father.number = 791112233;
		 * 
		 * sister1.name = "Eva"; sister1.date = 19911808; sister1.number = 793334455;
		 * 
		 * sister2.name = "Ditte"; sister2.date = 19820508; sister2.number = 795556677;
		 * 
		 */

		// print 4 Objekte
		System.out.println(mother.toString()); // 2 Varianten von toString
		System.out.println(father); //
		sister1.print();
		sister2.print();
		System.out.println();

		// mit Default Kontruktor erzeugt
		Person person = new Person();
		person.print();

		// Kopieen sister2
		sisterTel.print();
		sisterTel2.print();

		// Vergleich equals() mit ==
		if (sisterTel2.equals(sisterTel)) {
			System.out.println("comparable objects");
		}
		if (sisterTel2 == sisterTel) {
			System.out.println("the same objects");
		}

		// Test Datum Formattierung
		String dateTest = Person.getDateString(sister2.getDate());
		System.out.println(dateTest);

		Person.printCounter();
	}

}
