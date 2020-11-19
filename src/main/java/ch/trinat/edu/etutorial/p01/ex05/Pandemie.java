package ch.trinat.edu.etutorial.p01.ex05;

import terminal.VT;
import terminal.VTerm;

public class Pandemie {
    // globale Matrix f�r das Speichern der Population
    static int[][] population = new int[21][51];
   
    static VTerm console = VTerm.getInstance(25, 80, "Pandemie", VT.CS_TINY);

    public static void main(String[] args) {
        int i, j; // Laufvariablen f�r die Schleifen
        // Die Werte im Array population werden auf 0 gesetzt
        for (i = 0; i< 21; i++) {
            for (j = 0; j< 51; j++) {
                population[i][j] = 0;
            }
        }
      
        print();

        console.delay(500); // Warten f�r 500 Millisekunden
        // erste Person soll angesteckt werden
        init();

        for (int tage = 0; tage< 30; tage++) {
            for (i = 1; i< 20; i++) {
                for (j = 1; j< 50; j++) {
                	ansteckung(i,j);
                }
            }

            console.clearScreen(); // L�schen des Inhalts von console
            console.println("Tag " + tage);

            // Ausgabe im Fenster von console (Typ VTerm)
            
            print();
            
            console.delay(500);
        }

        // schliessen der Konsole mit Enter
        console.readyToExit(true);
    }

    public static void print() {
    	// Ausgabe im Fenster von console (Typ VTerm)
    	int i , j;
        for  (i= 0; i< 21; i++) {
            for ( j = 0; j< 51; j++) {
                if (population[i][j] > 0 && population[i][j] < 8) {
                    console.print("" + population[i][j]);
                } else {
                    console.print(' ');
                }
            }
            console.println();
        }
    }

    public static void ansteckung(int x, int y) {
    	int zufall = 10;
    	
    	if (population[x][y] == 0  ) {
    		if (infectioes(x+1,y) || infectioes(x-1,y) || infectioes(x,y+1) || infectioes(x,y-1))  {
    	     zufall = (int)(Math.random() * 10);
    	       if (zufall == 0) {
                  // Berechnung der Ansteckung
                  population[x][y] = 1;}}  
    	} else if (population[x][y] < 8  ) {
    		population[x][y] = population[x][y]+1;
    	
    } 
}
    
    public static void init() {
    	for (int i=0; i<3; i++) {
    	int x = (int)(Math.random() * 20)+1;
    	int y = (int)(Math.random() * 50)+1;
    	population[x][y] = 1;
    	}
    }
    
    public static boolean infectioes(int x, int y) {
        boolean ansteckend;
        if (population[x][y]< 8 && population[x][y] > 0) {
        	ansteckend = true;
        } else {
        	    ansteckend = false;
               }
        return ansteckend;}
    
    
}