//Mischa Kissling
///09/2020

package ch.trinat.edu.etutorial.p02.ex01;

public class Hotel {

	String name;
	private int id;
	private int stockwerke;
	private int zimmerProStockwerk;
	private int belegung;
		
		
	public int getZimmer() {
		int Zimmer;
		Zimmer  = 	stockwerke * zimmerProStockwerk;
		return Zimmer;
	}
	//EINCHECKEN	
	public void einchecken() {
		if (belegung<getZimmer()) {
			belegung = belegung +1;
			System.out.println("Herzlich willkommen");
		}
		else {
			System.out.println("Leider sind alle Zimmer besetzt");
		}
	}
	//AUSCHECKEN
	public void auschecken() {
		if (belegung>=1) {
			belegung = belegung -1;
			System.out.println("Auf Wiedersehen");
		}
		else {
			System.out.println("Hotel ist leer, Sie haben sich geirrt");
		}
	}
	//HOTEL-ATTRIBUTE
	public Hotel (String name, int id, int stockwerke, int zimmerProStockwerk, int belegung) {
			this.name = name;
			this.id = id;
			this.stockwerke = stockwerke;
			this.zimmerProStockwerk = zimmerProStockwerk;
			this.belegung = belegung;
		}
	//STRING ZUR AUSGABE
	public String toString() {
		return "Hotel " + name + "   (id: " + id + ")" + "\n" + "Es sind " + belegung + " von " + getZimmer() + " belegt" + "\n";
		// \n Zeilenumbruch 
	}
	
	//GETTERS & SETTERS
	//public String getName() {
		//return name;
	//}
	//public void setName(String name) {
		//this.name = name;
	//}
	//public int getId() {
		//return id;
	//}
	//public void setId(int id) {
		//this.id = id;
	//}
	//public int getStockwerke() {
		//return stockwerke;
	//}
	//public void setStockwerke(int stockwerke) {
		//this.stockwerke = stockwerke;
	//}
	//public int getZimmerProStockwerk() {
		//return zimmerProStockwerk;
	//}
	//public void setZimmerProStockwerk(int zimmerProStockwerk) {
		///this.zimmerProStockwerk = zimmerProStockwerk;
	//}
	//public int getBelegung() {
		//return belegung;
	//}
	//public void setBelegung(int belegung) {
		//this.belegung = belegung;
	//}
		
	//public void printInfo() {
		//System.out.println("Hotel " + name + "   (id: " + id + ")");
		//System.out.println("Es sind " + belegung + " von " + getZimmer() + " belegt");
		//System.out.println();
	//}
}

