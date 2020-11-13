package ch.trinat.edu.etutorial.p01.ex04;
import java.util.Scanner;
public class übung_1 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);

		int [][] resultate = new int [5][3] ; 
		int summe1 = 0; 
		int summe2 = 0 ;
		int summe3 = 0 ;
		int x = 0 ; 
		int []summen = new int [15];



		for ( int i = 0 ; i < 5 ; i++ ) {

			for ( int j = 0 ; j < 3 ; j++) {
				System.out.println( " Spieler " + ( j + 1 ) + " geben Sie Ihre Resultate für Runde " + ( i + 1) + " ein : "); 

				resultate[i][j] = eingabe.nextInt();	
				if ( resultate[i][j] <= 10 ) {
					System.out.print( resultate[i][j] );
				}
				else {
					System.out.println( " Die Zahl ist nicht erlaubt ");
					resultate[i][j] = eingabe.nextInt();
				}

				if ( resultate[i][j] == 10 ) {
					x++;
					System.out.println( " Spieler " +( j+1) + " Sie haben " + x + " Strikes gemacht");
				}

			}


		} 


		System.out.println( " _______________"); 
		System.out.println( "        Spieler "); 
		System.out.println( "        --------");
		System.out.println( "         1  2  3 "); 
		System.out.println( " ---------------"); 

		for ( int i = 0 ; i < 5 ; i++ ) {

			System.out.print( ( i + 1) + ". Runde "); 
			summe1 = summe1 + resultate[i][0];
			summe2 = summe2 + resultate[i][1];
			summe3 = summe3 + resultate[i][2];
			for ( int j = 0 ; j < 3 ; j++) {


				System.out.print( resultate[i][j] + "  ");



			}

			System.out.println(); 


		} System.out.println( "Summe    " + summe1 + "  " + summe2 +  "  " + summe3  );
		System.out.println( " Spieler  Sie haben " + x + " Strikes gemacht");

		if ( summe1 > summe2 && summe1 > summe3 ) {

			System.out.println( " Spieler 1 Sie haben die meisten Punkte erhalten ");
		}
		if ( summe2 > summe1 && summe2 > summe3 ) {

			System.out.println( " Spieler 2 Sie haben die meisten Punkte erhalten ");
		}

		if ( summe3 > summe1 && summe3 > summe2 ) {

			System.out.println( " Spieler 3 Sie haben die meisten Punkte erhalten ");
		}





	}

}
