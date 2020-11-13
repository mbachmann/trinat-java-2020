package ch.trinat.edu.etutorial.p01.ex02;
import java.util.Scanner;
public class übung_1_2 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		int Geschwindigkeit , Anhalteweg , Reaktionsweg , Bremsweg;
		
		System.out.println( " Geben Sie die Geschwindigkeit ein in km/h : ");
		Geschwindigkeit =eingabe.nextInt();
		
		Reaktionsweg = 3*(Geschwindigkeit / 10); 
		Bremsweg = (Geschwindigkeit / 10) * (Geschwindigkeit / 10); 
		Anhalteweg = Reaktionsweg + Bremsweg ; 
		
		System.out.println( " Den Reaktionsweg ist von " + Reaktionsweg + "m" );
		System.out.println( " Den Bremsweg ist von " + Bremsweg + "m");
		System.out.println( " Den Anhaleweg ist von " + Anhalteweg + "m");

		eingabe.close();

	}

}
