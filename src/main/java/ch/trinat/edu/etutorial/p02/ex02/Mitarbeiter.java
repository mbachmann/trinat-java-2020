package ch.trinat.edu.etutorial.p02.ex02;
import java.util.Scanner;

public class Mitarbeiter {
	Scanner eingabe = new Scanner(System.in);
	
	private int salery ;
	private int position; 
	private int gehalt1 ; 
	private int gehalt2 ;
	private int gehalt3 ;

	
	// Geter und Setter zur Attribut Salery 
	public int getSalery() {
		return salery;
	}

	public void setSalery(int salery) {
		this.salery = salery;
	} 
	
	public Mitarbeiter( Mitarbeiter p ) {
		salery = p.salery;
		position = p.salery;
	}
	
	public int Position1() {
		int position ;
		position = 1 ;
		salery = gehalt1;
		return position ;
		
	}
	
	public int Position2() {
		int position ; 
		position = 2 ;
		salery = gehalt2;
		return position; 
	}
	
	public int position3() {
		int position ; 
		position = 3 ; 
		salery = gehalt3;
		return position; 
	}
	
	//Default-Konstruktor um die Atributs zu initialisieren
	public Mitarbeiter() {
		gehalt1 = 150000;
		gehalt2 = 90000;
		gehalt3 = 60000;
	}
	
	
	
	public int getSpace1() {
		int platz1; 
		platz1 = 10 + (gehalt1/10000);
		return platz1;
		
	}
	
	public int getSpace2() {
		int platz2; 
		platz2 = 10 + (gehalt2/10000);
		return platz2;
		
	}
	
	public int getSpace3() {
		int platz3; 
		platz3 = 10 + (gehalt3/10000);
		return platz3;
		
	}
	
	public int jahresgehalt1() {
		int jahr1;
		jahr1 = 150000;
		return jahr1;
	}
	
	public int jahresgehalt2() {
		int jahr2;
		jahr2 = 90000;
		return jahr2;
	}
	
	public int jahresgehalt3() {
		int jahr3;
		jahr3 = 60000;
		return jahr3;
	}
	
	// Vergleichsmethode
	 public boolean equals(Mitarbeiter t){
		 if (t!= null && t.position == this.position && t.salery == this.salery){
		 return true;
		 }
		 return false;
		 } 
	
	
	
}
