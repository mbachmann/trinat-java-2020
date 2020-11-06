//Mischa Kissling
//08/2020

package ch.trinat.edu.etutorial.p01.ex05;

import java.util.Scanner;
import processing.core.PApplet;

public class Pandemie extends PApplet {
	// globale Matrix für das Speichern der Population
	static int[][] population = new int[52][22];
	static int tage = 1;
	static int maxtage;
	static int ansteckung;

	public void setup() {
		Scanner z = new Scanner(System.in);
		System.out.println("Anzahl Tage der Simulation: ");
		maxtage = z.nextInt();
		System.out.println("Ansteckungswahrscheinlichkeit in %: ");
		ansteckung = z.nextInt();

		size(1040, 460);	// Setzt die Grösse des Fensters
		background(255);	// Setzt die Hintergrundfarbe auf weiss
		fill(0,255,255);	// Setzt die Schreibfarbe auf türkis
		//fill(0,0,255);	// Setzt die Schreibfarbe auf blau
		//fill(0,255,0);	// Setzt die Schreibfarbe auf grün
		//fill(255,0,0);	// Setzt die Schreibfarbe auf rot
		frameRate(3);		// gibt an wie schnell die Simulation laufen soll
		textSize(20);		// Die Grösse der Schrift wird auf 20 Pixel gesetzt
		
		// Die Werte im Array Personen werden auf 0 gesetzt
		for (int i = 0; i < 52; i++) {
			for (int j = 0; j < 22; j++) {
				population[i][j] = 0;
			}
		}
		population[reihex()][reihey()] = 1;
		
		 //Ausgabe im Processing Fenster: Text wird nicht mit System.out.println
		 //ausgegeben, sondern mit der Methode text. Diese Methode bekommt einen Text
		 //und die Position, wo dieser Text geschrieben werden soll. Position des Texts
		 //x-Wert= x*Schriftgrösse + Schriftgrösse. y-Wert analog

		print();

	}

	public int reihex() {
		double rando = Math.random() * 52;
		int random = (int) rando;
		return random;
	}

	public int reihey() {
		double rando = Math.random() * 22;
		int random = (int) rando;
		return random;
	}

	public void print() {
		for (int x = 0; x < 52; x++) {
			for (int y = 0; y < 22; y++) {
				if (population[x][y] > 0 && population[x][y] < 8) {
					text(population[x][y], x * 20 + 20, y * 20 + 20);
				}
			}
		}
	}

	public int getZufall() {
		double g = Math.random() * (100 / ansteckung);
		int zufall = (int) g;
		return zufall;
	}

	public void ansteckungen(int x, int y) {
		int infizierteNachbarn = 0;
		if (population[x][y] == 0) {
			
				if(infektios(x + 1, y)){
					infizierteNachbarn++;
				}
				if(infektios(x - 1, y)){
					infizierteNachbarn++;
				}
				if(infektios(x, y+1)){
					infizierteNachbarn++;
				}
				if(infektios(x, y-1)){
					infizierteNachbarn++;
				}
				
				if (getZufall() <infizierteNachbarn) {
					population[x][y] = 1;
				}
			}
		 if (population[x][y] < 8&&population[x][y]>0) {
			population[x][y]++;
		}
	}

	public boolean infektios(int x, int y) {
		if (population[x][y] < 8 && population[x][y] > 1) {
			return true;
		} else {
			return false;
		}
	}
	
	// Diese Methode wird endlos wiederholt und macht so die Annimation der Pandemie
	
	public void draw() {

		background(255);
		for (int i = 1; i < 51; i++) {
			for (int j = 1; j < 21; j++) {
				ansteckungen(i, j);
			}
		}
		
		// Ausgabe im Processing Fenster
		print();
		text("Tag " + tage, 0, 460);
		tage++;

	}
}