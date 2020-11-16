package ch.trinat.edu.etutorial.p01.ex03.DO;
import java.util.Scanner;

public class Zahlen_raten {

	public static void main(String[] args) {
		
		// Programm zu erraten von Nummern
		
		System.out.print("Spieler 1: Bitte geben sie eine Zahl zwischen 1 und 100 ein, die vom Spieler 2 erratet werden soll: ");
		Scanner eingabe = new Scanner(System.in);
	    int x = eingabe.nextInt(); // Eingabe cie vom Spieler erratet werden soll
	    
	    System.out.print("Bitte geben sie eine Zahl zwischen 1 und 100 ein: ");
	    Scanner eingabe1 = new Scanner(System.in);
	    int y = eingabe.nextInt(); // eingabe des Spielers 
	    
	    int z = 0; // Zahl von versuchen
	    boolean erratet = false;
        while (erratet == false) {
        	
        	if (y>100 || x>100) {
        		
        		System.out.println("Fehler sie m�ssen eine Zahl zwischen 1 und 100 eingeben");
        		y = eingabe.nextInt();
        	}
        	
        	else {
        		if (y>x) {
        		System.out.println("zu gross");
        		System.out.println("raten Sie");
        		z=z+1;
        		y = eingabe.nextInt();
        		}
        		
        		else if (y<x) {
            		System.out.println("zu klein");
            		System.out.println("raten Sie");
            		z=z+1;
            		y = eingabe.nextInt();
            		}
        		
        		else if (y==x) {
            		System.out.print("Erraten ! " + z + " mal geraten");
            		erratet = true;
            		}
        	}
        	
        }
        eingabe.close();
		eingabe1.close();
	}

}
