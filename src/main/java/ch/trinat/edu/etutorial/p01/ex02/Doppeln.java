package ch.trinat.edu.etutorial.p01.ex02;
import java.util.Scanner;


public class Doppeln {

	
public static void main(String[] args) {
		
		System.out.println("Bitte geben sie die zahl ein die sie doppeln wollen: ");
		
		Scanner eingabe = new Scanner(System.in);
	    double zahl = eingabe.nextDouble();
	    zahl *= 2;
	    
		System.out.println("die verdoppelte zahl ist "+zahl);
		eingabe.close();
		
	}
}
