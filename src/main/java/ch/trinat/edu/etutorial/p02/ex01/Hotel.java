package ch.trinat.edu.etutorial.p02.ex01;

import java.util.Scanner;

public class Hotel {
	Scanner eingabe = new Scanner(System.in);

	private int stockwerke; 
	private int zimmerProStockwerke;
	private int belegung;
	private String bezeichnung; 



	public Hotel ( String bezeichnung , int stockwerke, int zimmerProStockwerke ) {

		this.stockwerke = stockwerke;
		this.zimmerProStockwerke = zimmerProStockwerke; 
		this.bezeichnung = bezeichnung; 

	}

	public int getFreieZimmer() {

		int capacity = (stockwerke*zimmerProStockwerke) - belegung ; 
		System.out.println(capacity);
		return capacity;

	}

	public void einchecken() {
		


		if ( (stockwerke*zimmerProStockwerke) != belegung ) {
			belegung = belegung + 1 ;
			
		} else {
			System.out.println( " Kein Zimmer verfügbar !!");
			
		}

	}

	public void auschecken() {
		
		if ( belegung != 0 ) {
			belegung = belegung - 1 ;
			
		} else {
			System.out.println( " Keine auschecken möglich ");
			
		}
	}



	public void printInfo() {

		System.out.println( "Hotel" + bezeichnung  );
		System.out.println( belegung + " von " + (stockwerke*zimmerProStockwerke) + " belegt ");
	}

	public void choice() {
		int x; 
		System.out.println( "Hotel " + bezeichnung + "  Guten Tag wollen Sie ein- oder auschecken ? Drücken Sie 1 um einzuchecken und 2 um auszuchecken .");
		x = eingabe.nextInt();

		if ( x<= 1 ) {
			einchecken();
		} else {
			auschecken();
		}
	}

}
