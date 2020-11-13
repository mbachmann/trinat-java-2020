package ch.trinat.edu.etutorial.p01.ex04;
import java.util.Scanner;
public class übung_2 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		char brett[][] = new char [3][3];
		int zug_zeile , zug_spalte ;
		int spieler1 ; 
		boolean zustand ; 
		zustand = false;
		int x =0;
			
	
		brett[0][0] = ' ' ; 
		brett[0][1] = ' ' ; 
		brett[0][2] = ' ' ;
		brett[1][0] = ' ' ;
		brett[1][1] = ' ' ;
		brett[1][2] = ' ' ;
		brett[2][0] = ' ' ; 
		brett[2][1] = ' ' ; 
		brett[2][2] = ' ' ; 
		
		 
				
		System.out.println( "    1   2   3 "); 
		System.out.println(" ------------- " );
		for ( int i = 0 ; i<3 ; i++) {
			
			System.out.print( ( i + 1 ) + " : ");
			
			
			for ( int j = 0 ; j<3 ; j++) {
				System.out.print ( brett[i][j] + " ¦ ");
			}
			
			System.out.println();
		}
		
		
		
		
		while (( zustand == false) && ( x < 10) ){
		
		x = x+1;
		
		System.out.println( " Spieler 1 :");
		 
		System.out.println( " In welche Spalte wollen Sie spielen ? "); 
		zug_zeile = eingabe.nextInt(); 
		
		if ( zug_zeile >3 ) {
			System.out.println( " Zeile nicht erlaubt ");
			System.out.println( " Widerholen Sie die eingabe : "); 
			zug_zeile = eingabe.nextInt(); 
			}
		
		System.out.println( " In welche Spalte wollen Sie spielen ? "); 
		zug_spalte =eingabe.nextInt();
		
		if ( zug_spalte >3 ) {
			System.out.println( " Zeile nicht erlaubt ");
			System.out.println( " Widerholen Sie die eingabe : "); 
			zug_spalte = eingabe.nextInt(); 
			}
		
		brett[zug_zeile - 1  ][zug_spalte - 1 ] = 'x' ; 
		
		System.out.println( "    1   2   3 "); 
		System.out.println(" ------------- " );
		for ( int i = 0 ; i<3 ; i++) {
			
			System.out.print( ( i + 1 ) + " : ");
			
			
			for ( int j = 0 ; j<3 ; j++) {
				System.out.print ( brett[i][j] + " ¦ ");
			}
			
			System.out.println();
		} 
		x = x+1;
		System.out.println( " Spieler 2 : ");
		 
		System.out.println( " In welche Spalte wollen Sie spielen ? "); 
		zug_zeile = eingabe.nextInt(); 
		
		if ( zug_zeile >3 ) {
		System.out.println( " Zeile nicht erlaubt ");
		System.out.println( " Widerholen Sie die eingabe : "); 
		zug_zeile = eingabe.nextInt(); 
		}
		
		
		System.out.println( " In welche Spalte wollen Sie spielen ? "); 
		zug_spalte =eingabe.nextInt();
		
		if ( zug_spalte >3 ) {
			System.out.println( " Zeile nicht erlaubt ");
			System.out.println( " Widerholen Sie die eingabe : "); 
			zug_spalte = eingabe.nextInt(); 
			}
		
		brett[zug_zeile - 1  ][zug_spalte - 1 ] = 'o' ; 
		
		System.out.println( "    1   2   3 "); 
		System.out.println(" ------------- " );
		for ( int i = 0 ; i<3 ; i++) {
			
			System.out.print( ( i + 1 ) + " : ");
			
			
			for ( int j = 0 ; j<3 ; j++) {
				System.out.print ( brett[i][j] + " ¦ ");
			}
			
			System.out.println();

		
	 }
		/*if ( (brett[0][0] == 'x' || brett [0][0] == 'o') && ( brett[0][1] == 'x' || brett[0][1] == 'o') && ( brett[0][2] == 'x' || brett[0][2] == '0' )) {
			
			System.out.println( " Sie haben gewonnen !!!!");
			zustand = true ;
		}
       if ( (brett[1][0] == 'x' || brett [1][0] == 'o') && ( brett[1][1] == 'x' || brett[1][1] == 'o') && ( brett[1][2] == 'x' || brett[1][2] == '0' )) {
			
			System.out.println( " Sie haben gewonnen !!!!");
			zustand = true ;
		}
       if ( (brett[2][0] == 'x' || brett [2][0] == 'o') && ( brett[2][1] == 'x' || brett[2][1] == 'o') && ( brett[2][2] == 'x' || brett[2][2] == '0' )) {
	
	System.out.println( " Sie haben gewonnen !!!!");
	zustand = true ;
        }
       if ( (brett[0][0] == 'x' || brett [0][0] == 'o') && ( brett[1][0] == 'x' || brett[1][0] == 'o') && ( brett[2][0] == 'x' || brett[2][0] == '0' )) {
			
			System.out.println( " Sie haben gewonnen !!!!");
			zustand = true ;
		}
       if ( (brett[0][1] == 'x' || brett [0][1] == 'o') && ( brett[1][1] == 'x' || brett[1][1] == 'o') && ( brett[2][1] == 'x' || brett[2][1] == '0' )) {
			
			System.out.println( " Sie haben gewonnen !!!!");
			zustand = true ;
		}
       if ( (brett[0][2] == 'x' || brett [0][2] == 'o') && ( brett[1][2] == 'x' || brett[1][2] == 'o') && ( brett[2][2] == 'x' || brett[2][2] == '0' )) {
			
			System.out.println( " Sie haben gewonnen !!!!");
			zustand = true ;
		}
       if ( (brett[0][0] == 'x' || brett [0][0] == 'o') && ( brett[1][1] == 'x' || brett[1][1] == 'o') && ( brett[2][2] == 'x' || brett[2][2] == '0' )) {
			
			System.out.println( " Sie haben gewonnen !!!!");
			zustand = true ;
		}
       if ( (brett[0][3] == 'x' || brett [0][3] == 'o') && ( brett[1][1] == 'x' || brett[1][1] == 'o') && ( brett[2][0] == 'x' || brett[2][0] == '0' )) {
			
			System.out.println( " Sie haben gewonnen !!!!");
			zustand = true ;
		}*/
       
		}
	 System.out.println( " Niemand hat gewonnen "); 
	} 
	
	}

	


