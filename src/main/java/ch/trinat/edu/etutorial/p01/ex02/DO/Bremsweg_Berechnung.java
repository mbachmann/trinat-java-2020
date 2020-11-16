package ch.trinat.edu.etutorial.p01.ex02.DO;
import java.util.Scanner;

public class Bremsweg_Berechnung {

	public static void main(String[] args) {
		//Programm das den Anhaltsweg eines Fahrzeuges berechnett 
		
		String newLine = System.getProperty("line.separator");
		System.out.print("Bitte geben Sie die Geschwindigkeit ein: ");
		Scanner eingabe = new Scanner(System.in);
		
	    double geschwindigkeit = eingabe.nextDouble(); // Geschwindigkeit des Fahrzeuges 
	    double Reaktionsweg = 3 * (geschwindigkeit/10); // Variabel vom Reaktionweg
	    double Bremsweg = (geschwindigkeit/10) * (geschwindigkeit/10); // Variabel vom Bremsweg
	    
	    
        Bremsweg = Math.round(Bremsweg*100)/100.0;
	    Reaktionsweg = Math.round (Reaktionsweg*100)/100.0;
	    double Anhaltsweg = Bremsweg + Reaktionsweg; // Variabel vom Anhaltsweg
	    System.out.print("Der Bremsweg ist " + Bremsweg + " m" + " und der Rekationsweg ist " + Reaktionsweg + " m");
	    System.out.print(newLine + "Der Anhaltsweg ist also: " + Anhaltsweg + " m.");
	    eingabe.close();
	}


}
