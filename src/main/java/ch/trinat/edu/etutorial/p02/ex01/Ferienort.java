package ch.trinat.edu.etutorial.p02.ex01;

import java.util.Scanner;


public class Ferienort {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);

		int y ; 

		y = 0 ; 

		/*Hotel a = new Hotel(); 
		Hotel b = new Hotel(); 
		Hotel c = new Hotel();*/

		Hotel edelweiss = new Hotel ( " Edelweiss ", 5 , 20);
		Hotel astoria = new Hotel ( " Astoria " , 10 , 50);
		Hotel alpenblick = new Hotel ( " Alpenblick " , 3 , 30); 

		/*a.bezeichnung = "Edelweiss";
		a.stockwerke = 5;
		a.zimmerProStockwerke = 20;


		b.bezeichnung = "Astoria";
		b.stockwerke = 10;
		b.zimmerProStockwerke = 50;

		c.bezeichnung = "Alpenblick" ;
		c.stockwerke = 3;
		c.zimmerProStockwerke = 30;*/

		do {
			edelweiss.choice();edelweiss.printInfo();
			astoria.choice();astoria.printInfo();
			alpenblick.choice();alpenblick.printInfo();
			System.out.println( " Wählen Sie 1 um zu halten. Etwas anderes um weiter zu machen.");
			y = eingabe.nextInt(); 
		} while ( y != 1);


		eingabe.close();

	}

}
