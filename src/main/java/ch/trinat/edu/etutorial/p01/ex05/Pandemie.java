package ch.trinat.edu.etutorial.p01.ex05;
import processing.core.PApplet;
import java.util.Scanner;
public class Pandemie extends PApplet {
	Scanner eingabe = new Scanner(System.in);
	// globale Matrix für das Speichern der Population
	static int[][] population = new int[52][22];
	static int tage = 1;
    int x = wert() ; 
    int s = ansteckungs() ;
    int y = Ansteckungswahrscheinlichkeit();
    
    
	public void setup() {
		
		
		size(1040, 480); // Setzt die Grösse des Fensters
		background(255); // Setzt die Hintergrundfarbe auf Weiss
		fill(0); // Setzt die Schreibfarbe auf Schwarz;
		frameRate(3); // gibt an wie schnell die Simulation laufen soll
		textSize(20); // Die Grösse der Schrift wird auf 20 Pixel gesetzt
		// Die Werte im Array Personen werden auf 0 gesetzt
		for (int i = 0; i < 52; i++) {
			for (int j = 0; j < 22; j++) {
				population[i][j] = 0;
			}
		}

		/*
		 * Ausgabe im Processing Fenster: Text wird nicht mit System.out.println
		 * ausgegeben, sondern mit der Methode text. Diese Methode bekommt einen Text
		 * und die Position, wo dieser Text geschrieben werden soll. Position des Texts
		 * x-Wert= x*Schriftgrösse + Schriftgrösse. y-Wert analog
		 */

		population[15][10] = 1;
		print();
       
	}

	/*
	 * Diese Methode wird endlos wiederholt und macht so die Annimation der Pandemie
	 */

	public void draw() {
		
		if ( tage < (x+1) ) {
		background(255);
		for (int i = 1; i < 51; i++) {
			for (int j = 1; j < 21; j++) {
				ansteckung(i, j);

			}
		}

		// Ausgabe im Processing Fenster

		print();
      
		text("Tag " + tage , 0, 460);
		tage++;
		}
		else {
		text( " Die simulation ist am Ende " , 0, 460);
		}
		
	}

	/* Hinzufügen der neuen Methoden */

	public void print() {
		for (int x = 0; x < 52; x++) {
			for (int y = 0; y < 22; y++) {
				if (population[x][y] > 0 && population[x][y] != 8 ) {
					text(population[x][y], x * 20 + 20, y * 20 + 20);
				}
				
			}
		}

	}

	public int getZufall() {

		int zufall;
		zufall = (int) (Math.random() * s);
		return zufall;
	}
	
	public int Ansteckungswahrscheinlichkeit () {
		
		int l = 0 ; 
		l = 100/s ; 
		System.out.println( " Die Ansteckungswahrscheinlichkeit ist von : " + l + "%" );
		return l;
	}

	public void ansteckung(int x, int y) {
		if (population[x][y] == 0) {
		 			if (infektioes(x+1,y) || population[x + 1][y] >0 || population[x][y - 1] >0
					|| population[x][y + 1] >0 ) {
				if (getZufall() == 1) {
					population[x][y] = 1;
				}
			}
		}else if (population[x][y] < 8) {
			population[x][y] = population[x][y] +1 ;
                                         
	 
}
	}
	
	public boolean infektioes (int x , int y ) {
		
		boolean ansteckung ;
		
		if ( population[x][y] > 0 && population[x][y] < 8) {
			ansteckung = true ;
		} else {
			ansteckung = false ;
		}
		return ansteckung ;
		
		
	}
	
	public int wert() {
		int y ; 
		System.out.println(" Wie lange soll die Simulation dauern ? "); 
		y = eingabe.nextInt(); 
		return y ; 
	}
	
	public int ansteckungs() {
		int k; 
	     
	    
		System.out.println( " Wie ansteckend ist die Krankheit ? ");
		System.out.println( " Wählen Sie eine ganze Zahl zwischen 2 und 10 ( inclusive ) ");
		k= eingabe.nextInt(); 
		if ( k >1 && k<11 ) {
		
		return k ; 
		
		}
		
		else  {
			
			System.out.println( " Bitte widerholen mit gültige Werten "); 
			k= eingabe.nextInt();
			
			return k; 
		} 
		 
	}
	
	
}