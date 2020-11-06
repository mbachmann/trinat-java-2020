//Mischa Kissling
///09/2020

package ch.trinat.edu.etutorial.p02.ex01;

import java.util.Scanner;

public class Ferienort {

	public static void main(String[] args) {
		
		//Hotel[] typ= new Hotel[3];
		//for (int i = 0; i < 3; i++){
		    //typ[i] = new Hotel();
		//}
		
		//typ[0].id = 1;
		//typ[0].name = "Edelweiss";
		//typ[0].stockwerke = 5;
		//typ[0].zimmerProStockwerk = 8;
		//typ[0].belegung = 8;
		
		//typ[1].id = 2;
		//typ[1].name = "Astoria";
		//typ[1].stockwerke = 20;
		//typ[1].zimmerProStockwerk = 10;
		//typ[1].belegung = 42;
		
		//typ[2].id = 3;
		//typ[2].name = "Alpenblick";
		//typ[2].stockwerke = 6;
		//typ[2].zimmerProStockwerk = 5;
		//typ[2].belegung = 29;
		
		Hotel edel = new Hotel("Edelweiss", 1, 5, 8, 0);
		Hotel ast = new Hotel("Astoria", 2, 20, 10, 0);
		Hotel alps = new Hotel("Alpenblick", 3, 6, 5, 0);
		
		//for (int i=0 ; i<3 ; i++) {
			//typ[i].printInfo();
		//}
		
		System.out.println(edel.toString());
		System.out.println(ast.toString());
		System.out.println(alps.toString());
		
		int m=0;
		do {
			int entscheid;
			do {
				System.out.println("Möchten Sie ein- oder auschecken?");
				System.out.println("1 für einchecken, 2 für auschecken");
				Scanner option = new Scanner(System.in);
				entscheid = option.nextInt();
				System.out.println();
			}
			while (entscheid!=1 && entscheid!=2);
			
			
			if (entscheid==1) {
				System.out.println("In welchem Hotel möchten Sie einchecken?");
				System.out.println("1: Edelweiss, 2 Astoria, 3 Alpenblick");
				Scanner rooms = new Scanner(System.in);
				int wahl = rooms.nextInt();
				//typ[wahl-1].einchecken();
					if (wahl==1) {
						edel.einchecken();
					}
					if (wahl==2) {
						ast.einchecken();
					}
					if (wahl==3) {
						alps.einchecken();
					}
				System.out.println();
			}
			
			if (entscheid==2) {
				System.out.println("In welchem Hotel möchten Sie auschecken?");
				System.out.println("1: Edelweiss, 2 Astoria, 3 Alpenblick");
				Scanner rooms = new Scanner(System.in);
				int wahl = rooms.nextInt();
				//typ[wahl-1].auschecken();
					if (wahl==1) {
						edel.auschecken();
					}
					if (wahl==2) {
						ast.auschecken();
					}
					if (wahl==3) {
						alps.auschecken();
					}
				
				System.out.println();
			}
			
			//for (int i=0 ; i<3 ; i++) {
				//typ[i].printInfo();
			//}
			
			System.out.println(edel.toString());
			System.out.println(ast.toString());
			System.out.println(alps.toString());
			
		}while(m<1);
	}
}
