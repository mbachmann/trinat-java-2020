package ch.trinat.edu.etutorial.p02.ex02.kurort;

import java.util.Scanner;

public class Kurort {
	public static void main(String[] args) {

		Hotel Edelweiss = new Hotel("Edelweiss", 2, 2, 0);
		Hotel Astoria = new Hotel("Astoria", 1, 3, 0);
		Hotel Alpenblick = new Hotel("Alpenblick", 3, 3, 0);
				
			
        try(Scanner eingabe = new Scanner(System.in)) {
        	int choiceHotel, choiceAktion;
        	int quit=1;
        	do {	
				do {
					System.out.println("Welches Hotel?");
					System.out.print("1: Edelweiss ");
					System.out.print("2: Astoria ");
					System.out.print("3: Alpenblick ");
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
					if (choiceHotel==1)
					{
						Edelweiss.einchecken();
						System.out.println(Edelweiss);
					}
					if (choiceHotel==2)
					{
						Astoria.einchecken();
						System.out.println(Astoria);
					}
					if (choiceHotel==3)
					{
						Alpenblick.einchecken();
						System.out.println(Alpenblick);
					}
					break;
				case 2:
					if (choiceHotel==1)
					{
						Edelweiss.auschecken();
						System.out.println(Edelweiss);
					}
					if (choiceHotel==2)
					{
						Astoria.auschecken();
						System.out.println(Astoria);
					}
					if (choiceHotel==3)
					{
						Alpenblick.auschecken();
						System.out.println(Alpenblick);
					}
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
		System.out.println(Edelweiss);
		System.out.println(Astoria);
		System.out.println(Alpenblick);
		System.out.println("Vielen dank und noch einen schönen Tag!");
	}
}

