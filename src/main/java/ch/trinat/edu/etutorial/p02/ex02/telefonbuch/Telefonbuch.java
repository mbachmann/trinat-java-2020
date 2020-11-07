package ch.trinat.edu.etutorial.p02.ex02.telefonbuch;

public class Telefonbuch {

	public static void main(String[] args) {
		
		Person mutter = new Person("Maria", 14091954, 791234567);
		Person vater = new Person("Joseph", 3041961, 791234568);
		Person bruder = new Person("Bob", 21061993, 791234569);
		Person schwester = new Person("Alice", 30081995, 791234570);
		Person person= new Person();
		//Person schwesterHandy = new Person(schwester);// Kopie von "schwester".
		Person schwesterHandy = schwester.clone();
		
		System.out.println(mutter);
		System.out.println(vater);
		System.out.println(bruder);
		System.out.println(schwester);
		System.out.println(person);
		System.out.println(schwesterHandy);

		Person.printCounter();
		}
}
