//Mischa Kissling
//08/2020

package ch.trinat.edu.etutorial.p02.ex02;

public class Telefonbuch {

	public static void main(String[] args) {
		
		Person mutter = new Person("Ursina", 17051973, 764320329, "Riehen");
		Person vater = new Person("Florian", 30071973, 763467839, "Riehen");
		Person bruder = new Person("Etienne", 17121998, 766812800, "Riehen");
		Person schwester = new Person("Tamara", 4102000, 765710329, "Riehen");
		Person vatergeschaeft = vater.clone();
		Person anonym = new Person();
		
		System.out.println(mutter.toString());
		//oder
		System.out.println(vater);
		System.out.println(vatergeschaeft);
		if (vater.equals(vatergeschaeft)) {
			System.out.println("Vergleichbare Objekte");
		}
		if (vater == vatergeschaeft) {
			System.out.println("Gleiches Objekt");
		}
		System.out.println();
		System.out.println(bruder.toString());
		System.out.println(schwester.toString());
		System.out.println(anonym);
		
		Person.printCounter();
		
		
		//ALTE Variante über Setter
		
		//Mutter
		//mutter.setName("Ursina");
		//mutter.setDatum(17051973);
		//mutter.setNummer(764320329);
		
		//Vater
		//vater.setName("Florian");
		//vater.setDatum(30071973);
		//vater.setNummer(763467839);
		
		//Bruder
		//bruder.setName("Etienne");
		//bruder.setDatum(17121998);
		//bruder.setNummer(766812800);
		
		//Schwester
		//schwester.setName("Tamara");
		//schwester.setDatum(04102000);
		//schwester.setNummer(765710329);
		
		//mutter.print();
		//vater.print();
		//vatergeschaeft.print();
		//bruder.print();
		//schwester.print();
		//anonym.print();
		
		
	}

}
