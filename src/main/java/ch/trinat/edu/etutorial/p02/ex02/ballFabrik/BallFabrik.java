package ch.trinat.edu.etutorial.p02.ex02.ballFabrik;

public class BallFabrik {
	public static void main(String[] args) {
		Ball[] baelle = new Ball[20];
		
		// Erzeugen Sie hier 20 Bälle mit einem zufälligen Radius
		for (int i = 0; i < baelle.length; i++) {
			baelle[i] = new Ball(Math.round(Math.random()*10+1));
		}
		
		double volume = 0;
		double surface = 0;
		
		for (int i = 0; i < baelle.length; i++) {
			baelle[i].print();
		}
		
		// Berechnen Sie hier wie gross das gesamte Volumen, bzw. die Oberfläche ist.
		for (int i = 0; i < baelle.length; i++) {
			volume+=baelle[i].getVolume();
			surface+=baelle[i].getSurface();
		}
		
		System.out.println("Gesamtvolumen: " + volume +"cm3 - Gesamtoberfläche: " + surface + "cm2");
	}
}
