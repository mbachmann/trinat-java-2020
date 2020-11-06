//Mischa Kissling
//09/2020


package ch.trinat.edu.etutorial.p02.ex02;

import java.util.Random;

public class Ballfabrik {

	public static void main(String[] args) {
		
		Ball[] baelle = new Ball[20];
		//Erzeugen Sie hier 20 Bälle mit einem zufälligen Radius
		 for (int i = 0; i < baelle.length; i++) {
			 Random radius = new Random();
			 double kugel = radius.nextDouble();
			 baelle[i] = new Ball(kugel);
			 }
		 
		//double volume = 0;
		//double surface = 0;
		for (int i=0 ; i<baelle.length ; i++) {
			baelle[i].print();
		}
		
		// Berechnen Sie hier wie gross das gesamte Volumen, bzw. die Oberfläche ist
		System.out.println("Gesamtvolumen: "+Ball.getGesVol()+" Gesamtoberflaeche: " + Ball.getGesOberfl());
	}

}
