package ch.trinat.edu.etutorial.p02.ex01.ferienort;

import java.util.Scanner;

public class Ferienort {
	public static void main(String[] args) {

		Hotel[] grundstück = new Hotel[3];
		for (int i= 0; i< 3; i++){
			grundstück[i]= new Hotel();
		}

		grundstück[0].bezeichnung="Edelweiss";
		grundstück[0].stockwerke=2;
		grundstück[0].zimmerProStockwerk=2;
		grundstück[0].belegung=0;

		grundstück[1].bezeichnung="Astoria";
		grundstück[1].stockwerke=1;
		grundstück[1].zimmerProStockwerk=3;
		grundstück[1].belegung=0;

		grundstück[2].bezeichnung="Alpenblick";
		grundstück[2].stockwerke=3;
		grundstück[2].zimmerProStockwerk=3;
		grundstück[2].belegung=0;

		try(Scanner eingabe = new Scanner(System.in)) {
			int choiceHotel, choiceAktion;
			int quit=1;
			do {	
				do {
					System.out.println("Welches Hotel?");
					System.out.print("1:"+grundstück[0].bezeichnung+"	");
					System.out.print("2:"+grundstück[1].bezeichnung+"	");
					System.out.print("3:"+grundstück[2].bezeichnung+"	");
					System.out.println();
					choiceHotel =eingabe.nextInt();
					if ((choiceHotel<1) || (choiceHotel>3)) {
						System.out.println("Fehlermeldung: Ungültige Eingabe!");
						System.out.println();
					}
				}while((choiceHotel<1) || (choiceHotel>3));

				do {
					System.out.println("Was soll gemacht werden?");
					System.out.print("1: Einschecken	");
					System.out.print("2: Auschecken		");
					System.out.println();
					choiceAktion =eingabe.nextInt();
					if ((choiceAktion<1) || (choiceAktion>2)) {
						System.out.println("Fehlermeldung: Ungültige Eingabe!");
						System.out.println();
					}
				}while((choiceAktion<1) || (choiceAktion>2));

				switch(choiceAktion) {
				case 1:
					grundstück[choiceHotel-1].einchecken();
					grundstück[choiceHotel-1].printInfo();
					break;
				case 2:
					grundstück[choiceHotel-1].auschecken();
					grundstück[choiceHotel-1].printInfo();
					break;
				}

				do {
					System.out.println("Wollen Sie noch eine änderung vornhemen?");
					System.out.print("1: Ja     ");
					System.out.print("2: Nein     ");
					System.out.println();
					quit =eingabe.nextInt();
					if ((quit<1) || (quit>2)) {
						System.out.println("Fehlermeldung: Ungültige Eingabe!");
					}
				}while((quit<1) || (quit>2));
			}while(quit==1);
		}
		for (int i= 0; i< 3; i++){
			grundstück[i].printInfo();
		}
		System.out.println("Vielen dank und noch einen schönen Tag!");
	}
}

