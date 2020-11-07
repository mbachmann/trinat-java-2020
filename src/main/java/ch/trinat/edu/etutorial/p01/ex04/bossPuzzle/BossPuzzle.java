package ch.trinat.edu.etutorial.p01.ex04.bossPuzzle;
import java.util.Scanner;

public class BossPuzzle 
{
	public static void main(String[] args)
	{
		char [][] spielbrett = new char [3][3];
		
		spielbrett [0][0] = '3';
		spielbrett [0][1] = '4';
		spielbrett [0][2] = ' ';
		
		spielbrett [1][0] = '7';
		spielbrett [1][1] = '8';
		spielbrett [1][2] = '5';
		
		spielbrett [2][0] = '2';
		spielbrett [2][1] = '1';
		spielbrett [2][2] = '6';
		
        System.out.println("--------------");
        System.out.println("|++| 1  2  3 |");
        System.out.println("|--|---------|");
	    for (int i=0; i<3; i++)
	    {
	    	int x=i+1;
	        System.out.print("|"+x+" |");
	        for (int j=0; j<3; j++)
	        {
		        System.out.print(" ");
	    	    System.out.print(spielbrett[i][j]);
		        System.out.print(" ");
	        }
	        System.out.println("|");
	    }
        System.out.println("--------------");
	    
	    int zugZeile=1, zugSpalte=1, leerZeile=0, leerSpalte=2;
        try(Scanner eingabe = new Scanner(System.in))
        {
        	while (zugZeile!=9)
		    {	
        		System.out.println(zugZeile);
			    System.out.println("Welches Feld möchten Sie verschieben?");
			    System.out.println("(9 für Abbruch)");
			    
			    System.out.print("Zeile: ");
			    zugZeile =eingabe.nextInt();    
			    
			    if (zugZeile!=9)
			    {
			        System.out.print("Spalte: ");
			        zugSpalte =eingabe.nextInt();
			        
			        spielbrett[leerZeile][leerSpalte]=spielbrett[zugZeile-1][zugSpalte-1];
			        leerZeile=zugZeile-1;
			        leerSpalte=zugSpalte-1;
			        spielbrett[zugZeile-1][zugSpalte-1]=' ';
			        
			        System.out.println("--------------");
			        System.out.println("|++| 1  2  3 |");
			        System.out.println("|--|---------|");
			        
				    for (int i=0; i<3; i++)
				    {
				    	int x =i+1;
				        System.out.print("|"+x+" |");
				        for (int j=0; j<3; j++)
				        {
					        System.out.print(" ");
				    	    System.out.print(spielbrett[i][j]);
					        System.out.print(" ");
				        }
				        System.out.println("|");
				    }
			        System.out.println("--------------");
        		}
        		else
        		{
			        System.out.println("GAME OVER");
        		}
		    }
        }
	}
}
