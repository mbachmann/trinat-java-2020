package ch.trinat.edu.etutorial.p01.ex04;
import java.util.Scanner;
public class zwei_dimensional_array {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		/* int zeilen, spalten ;
	
		System.out.println (" Wie viele zeilen ? "); 
		zeilen = eingabe.nextInt();
		
		System.out.println( " Wie viele Spalten ? "); 
		spalten= eingabe.nextInt();*/
		 
		char [][] x = new char [5][5] ; 
		
		x[0][0] = ' ' ; x[1][0] = ' ' ; x[2][0] = 'x' ; x[3][0] = 'x' ; x[4][0] = 'x' ;
		x[0][1] = ' ' ; x[1][1] = 'x' ; x[2][1] = 'x' ; x[3][1] = ' ' ; x[4][1] = ' ' ; 
		x[0][2] = 'x' ; x[1][2] = ' ' ; x[2][2] = 'x' ; x[3][2] = ' ' ; x[4][2] = ' ' ;
		x[0][3] = ' ' ; x[1][3] = 'x' ; x[2][3] = 'x' ; x[3][3] = ' ' ; x[4][3] = ' ' ;
		x[0][4] = ' ' ; x[1][4] = ' ' ; x[2][4] = 'x' ; x[3][4] = 'x' ; x[4][4] = 'x' ;

		for ( int i = 0 ; i < 5 ; i++) {
			for ( int j = 0 ; j < 5 ; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println(); // Zeilenumbruch, damit Zeile für Zeile des Arrays auf den Bildschirm kommt 
		}
	}

}
