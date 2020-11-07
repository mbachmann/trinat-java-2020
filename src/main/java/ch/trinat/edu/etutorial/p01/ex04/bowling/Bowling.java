package ch.trinat.edu.etutorial.p01.ex04.bowling;
import java.util.Scanner;

public class Bowling 
{
	public static void main(String[] args) 
	{	      
		try(Scanner eingabe = new Scanner(System.in))
		{
	        System.out.println("   (***********)");
	        System.out.println("  (   BOWLING   )");
	        System.out.println("    *********** ");
	        
			int rundeAktuell, spielerAktuell, rundeAnzahl, spielerAnzahl;
			
	        System.out.println("Wie viele Spieler gibt es?");
	        spielerAnzahl = eingabe.nextInt();
	        
	        System.out.println("Wie viele Runden wollen Sie spielen?");
	        rundeAnzahl = eingabe.nextInt();
	        
			int [][] resultate = new int [rundeAnzahl][spielerAnzahl];
			int [] summe = new int [spielerAnzahl];
	        
			for (int i=0; i<rundeAnzahl; i++)
		    {
		        for (int j=0; j<spielerAnzahl; j++)
		        {
		            System.out.println(" _________________");
		            System.out.println("  Spieler  1  2  3");
		            System.out.println(" -----------------");
		    		for (int a=0; a<rundeAnzahl; a++)
		    	    {
	    	        	rundeAktuell=a+1;
	    	            System.out.print(" "+rundeAktuell+". Runde");
		    	        for (int b=0; b<spielerAnzahl; b++)
		    	        {	
		    	            System.out.print("  "+resultate [a][b]);
		    	        }
	    	            System.out.println(" ");
		    	    }
		            System.out.println(" =================");
		            System.out.print("- SUMME -");
		            for (int x=0; x<spielerAnzahl; x++)
		            {
	    	            System.out.print("  "+summe[x]);
		            }
		            System.out.println();
		            System.out.println();
		            
		            rundeAktuell=i+1;
		        	spielerAktuell=j+1;
		        	do
		        	{
		            System.out.println("Wie viel Punkte hat Spieler "+spielerAktuell+" in der "+rundeAktuell+". Runde erreicht?");
			        resultate [i][j] =eingabe.nextInt();
			        if ((resultate [i][j]>10)||(resultate [i][j]<0))
			        {
			            System.out.println("   ****************************************************");
			            System.out.println("   *               !!!Fehlermeldung!!!                *");
			            System.out.println("   *  Punkte müssen sich zwischen 0 und 10 aufhalten! *");
			            System.out.println("   ****************************************************");
			            System.out.println();
			        }
		        	}while((resultate [i][j]>10)||(resultate [i][j]<0));
		        	summe[j]=summe[j]+resultate [i][j];
		        }
		    }
	    }
	}
}
