package ch.trinat.edu.etutorial.p01.ex03;
import java.util.Scanner;

public class Wohnblock {

	public static void main(String[] args) {
	
   Scanner eingabe = new Scanner(System.in);
   
   System.out.print("Wie viele Stockwerke m�chten Sie?: ");
   int stock = eingabe.nextInt();
   System.out.print("Wie viele Wohnungen pro Stockwerk m�chten Sie?: ");
   int wohn = eingabe.nextInt();
		
   
   
	for (int a = 0; a<stock; a++) {
		
		System.out.println();
		
		for (int x = 1; x<=wohn; x++) {
			System.out.print("[" + a + "," + x + "]");
			
		}
		
	}
	
eingabe.close();

	}

}
