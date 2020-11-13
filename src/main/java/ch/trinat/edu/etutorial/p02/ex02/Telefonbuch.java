package ch.trinat.edu.etutorial.p02.ex02;

public class Telefonbuch {

	public static void main(String[] args) {

		Person mutter = new Person("Maria" , 1960 , 20201);
		Person vater = new Person("Hans" , 1958 , 12345);
		Person bruder = new Person("Karim" , 2000 , 12643);
		Person schwester = new Person("Lili" , 1999 , 83645);
		Person person = new Person(); 
		// Person schwesterHandy = new Person(schwester); mit Kopierkonstruktor 
		
		Person schwesterHandy = schwester.clone(); 

		/*mutter.setName("Maria");
		mutter.setDatum(1960);
		mutter.setNummer(20201);

		vater.setName("Hans");
		vater.setDatum(1958);
		vater.setNummer(12345);

		bruder.setName("Karim");
		bruder.setDatum(2000);
		bruder.setNummer(12643);

		schwester.setName("Lili");
		schwester.setDatum(1999);
		schwester.setNummer(83645);*/

		/*mutter.print();
		vater.print();
		bruder.print();
		schwester.print();
		person.print();
		schwesterHandy.print(); */
		
		
		// Aussgabe mit toString Methode 
		System.out.println(mutter); 
		System.out.println(vater); 
		System.out.println(bruder); 
		System.out.println(schwester); 
		System.out.println(person); 
		System.out.println(schwesterHandy); 
		
		if (schwester.equals(schwesterHandy)) {
		    System.out.println("Vergleichbare Objekte");
		}

		if (schwester == schwesterHandy){
		    System.out.println("Gleiches Objekt");
		}
		
		Person.printCounter(); 
		

	}

}
