package ch.trinat.edu.etutorial.p02.ex02;

public class BoxFactory {

	public static void main(String[] args) {

		// Array boxes mit 100 Box deklariert
		Box boxes[] = new Box[100];

		// 10x default Box erzeugt
		for (int i = 0; i < 10; i++) {
			boxes[i] = new Box();
		}

		// 80x random Box erzeugt (1-100)
		for (int i = 10; i < 90; i++) {
			boxes[i] = new Box((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1,
					(int) (Math.random() * 100) + 1);
		}

		// 10x Kopieen boxen[80-90]
		for (int i = 90; i < 100; i++) {
			boxes[i] = new Box(boxes[i - 10]);
		}

		// Berechnung des Volumens aller Boxen
		int volume = 0;
		for (int i = 0; i < 100; i++) {
			volume += boxes[i].getVolume();
		}
		System.out.println("Total volume: " + volume + " cm^3");

		// Berechnung der Oberfläche aller Boxen
		int surface = 0;
		for (int i = 0; i < 100; i++) {
			surface += boxes[i].getSurface();
		}
		System.out.println("Cardboard needed for the production of the boxes: " + surface / 1000 + " m^3");
	}

}
