package ch.trinat.edu.etutorial.p02.ex02.boxFactory;

public class BoxFactory {

	public static void main(String[] args) {
		
		int gesamtVolume = 0;
		int gesamtSurface = 0;
		
		// Array mit Platz für 100 Boxen wird erstellt.
		Box[] boxen = new Box[100];
		
		// In diesem Array werden 10 Einheitsboxen (1X1X1 cm3) gespeichert.
		for (int i = 0; i < boxen.length; i++) {
			if (i<=9){
				boxen[i] = new Box();
			}
			// Dann 80 zufällig erzeugte Boxen.
			else if ((i>9) && (i<=89)){
				boxen[i] = new Box(((int)(Math.random()*100+1)), ((int)(Math.random()*100+1)),((int)(Math.random()*100+1)));
			}
			// Dann noch 10 Boxen welche die Kopie der Boxen 80-90 sind.
			else {
				boxen[i] = new Box(boxen[i-10]);
			}
		}

		// Anschliessend an die Erstellung der Boxen soll berechnet werden, wie gross das Volumen aller Boxen zusammen ist.
		for (int i = 0; i < boxen.length; i++) {
			gesamtVolume+=boxen[i].getVolume();
		}
		
		// Es soll berechnet werden, wie viel Quadratmeter Karton für die Herstellung der Boxen benötigt wird.
		for (int i = 0; i < boxen.length; i++) {
			gesamtSurface+=boxen[i].getSurface();
		}
		
		System.out.println("Gesamtvolumen: " + gesamtVolume +"cm3 - Gesamtoberfläche: " + gesamtSurface + "cm2");
	}
}
