package ch.trinat.edu.etutorial.p02.ex02;

import java.util.Scanner;

public class BallFabrick {
	
	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		
		Ball[] baelle = new Ball[20];
			
		double volume = 0  ; 
		double surface = 0 ; 
		
		
		// Erzeugung von 20 Bälle mit einem zufälligen Radius 
		for(int i =0; i <20 ; i++ ) {
			baelle[i] = new Ball(); 
		}
			
		
		// Um einen zufälligen Radius erzustellen
		for(int k = 0 ; k<20 ; k++) {
			
			baelle[k].getZufall();
			
		}
				
		for(int j = 0 ; j<baelle.length ; j++) {
		    System.out.print(j + 1 + ". :");
			baelle[j].print();
			volume = volume + baelle[j].Volumen();
			surface = surface + baelle[j].Oberfläche();
			}
		
		System.out.println( " Das gesamtes Volum ist von : " + volume); 
		System.out.println("Die gesamte Oberfläche ist von : " + surface);
		
		} 
}



