//Mischa Kissling
//09/2020

package ch.trinat.edu.etutorial.p02.ex02;

	public class BoxFactory {
		
		public static void main(String[] args) {			
			Box[] boxen = new Box[100];
			
			// 10 Einheitsboxen
			for (int i = 0; i < 10; i++) {
				boxen[i] = new Box();
			}
			
			// 80 Random Boxen
			for (int i=10 ; i<90 ; i++) {
				int höhe = (int) Math.round(Math.random())*100;
				int tiefe = (int) Math.round(Math.random())*100;
				int breite = (int) Math.round(Math.random())*100;
				boxen[i] = new Box(höhe, breite, tiefe);
				
			}
			
			// 10 Boxen, welche die Kopien von den letzten 10 sind
			for (int i=90 ; i<100 ; i++) {
				boxen[i] = boxen[i-10].clone();
			}
			
			// Ich habe das mit dem Ausdrucken herausgenommen. Das geht mit einem Array in Java nicht. 
			// Falls du es haben willst, müsstest du im Box eine Funktion printInfo() herstellen. Aber 
			// den müsstest entsprechend so programmieren, dass es höhe, breite und tiefe ausdrückt. 
				
			// Gesamtvolumen
			double volume = 0;
			double volume_temp = 0;
			for (int i = 0; i < boxen.length; i++) {
				volume_temp = boxen[i].getVolume();
				volume = volume + volume_temp;
			}
			
			System.out.println("Das Gesamtvolumen aller Boxen beträgt " + volume);
			
			// Gesamtfläche
			double surface = 0; 
			double surface_temp = 0; 
			for (int i = 0; i < boxen.length; i++) {
				surface_temp = boxen[i].getSurface();
				surface = surface + surface_temp;
			}
			System.out.println("Sie benötigen  " + surface + " Quadratmeter Karton für die Herstellung der Boxen");
			System.out.println("Ich wünsche Ihnen viel Spass beim schneiden");
	}

}