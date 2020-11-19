package ch.trinat.edu.etutorial.p01.ex05.DO;
import java.util.Scanner;

import terminal.VT;
import terminal.VTerm;

public class Pandemie_erweiterung {
    // globale Matrix f�r das Speichern der Population
 	static Scanner eingabe = new Scanner(System.in);
 	static Scanner eingabe1 = new Scanner(System.in);
 	static int tage = 0;
 	
 	
	static{System.out.print("Wie viele Menschen m�chten sie simulieren ? (erste Array eingabe) ");}
	static int menschen = eingabe.nextInt();
    static{System.out.print("Was viele Menschen sie simulieren ? (zweite Array eingabe) ");}
	static int menschen1 = eingabe1.nextInt();
    static int[][] population = new int[menschen][menschen1];
    static VTerm console = VTerm.getInstance(menschen+23, menschen1+23, "Pandemie", VT.CS_TINY);
    
   
    
    public static void main(String[] args) {
       
        int i, j; // Laufvariablen f�r die Schleifen
        // Die Werte im Array population werden auf 0 gesetzt
        for (i = 0; i< menschen; i++) {
            for (j = 0; j< menschen1; j++) {
                population[i][j] = 0;
            }
        }
      
        print();

        console.delay(500); // Warten f�r 500 Millisekunden
        // erste Person soll angesteckt werden
        init();

        System.out.print("Wie viele Tage soll die Simulation dauern ? ");
	    int dauer = eingabe.nextInt();
	    System.out.print("Was soll des Anstecksrat der Krankheit sein ? ");
	    double user = eingabe.nextInt();
	    user = user / 100;
        zeit(dauer,user);

        
        // schliessen der Konsole mit Enter
        console.readyToExit(true);
    }
static boolean s =false;
static boolean d =false;
    public static void print() {
    	// Ausgabe im Fenster von console (Typ VTerm)
    	int i , j;
        for  (i= 0; i< menschen; i++) {
            for ( j = 0; j< menschen1; j++) {
            	  if (population[i][j] > 12) {
                  	s=true; 
                  	population[i][j] = 1;
                  }
            else  if (population[i][j] > 0 && population[i][j] < 8) {
          
                    console.print("" + population[i][j]);
                } else {
                    console.print(' ');
                }
            } 
            console.println();
        }
    }

    public static double ansteckung2(int x, int y) {
    	
    	double k = 0;
    	if (population[x+1][y] < 2 )  {
    	   k = 0.0;
    	   return k;}
    	
    	else if (population[x+1][y] < 4 && population[x+1][y] > 2 )  {
     	   k = 0.25;
     	   return k;}
    	
    	else if (population[x+1][y] < 6 && population[x+1][y] > 4 )  {
      	   k = 0.5;
      	   return k;}
      	   
    	else if (population[x+1][y] < 8 && population[x+1][y] > 6 )  {
           k = 0.75;  
      	   return k;}
    	
      else {return k;}
    	 } 
    
    
    public static double ansteckung3 (int x, int y) { 
    	double e = 0;
    	
    if (population[x-1][y] < 2 )  {
  	   e = 0.0;
  	   return e;}
  	
  	else if (population[x-1][y] < 4 && population[x+1][y] > 2 )  {
   	   e = 0.25;
   	   return e;}
  	
  	else if (population[x-1][y] < 6 && population[x+1][y] > 4 )  {
    	   e = 0.5;
    	   return e;}
    	   
  	else if (population[x-1][y] < 8 && population[x+1][y] > 6 )  {
         e = 0.75;  
    	   return e;}
 	
    else {return e;}
    }
    
    
    
    
    public static double ansteckung4 (int x, int y) { 
    	double z = 0;
    	
    if (population[x][y+1] < 2 )  {
  	   z = 0.0;
  	   return z;}
  	
  	else if (population[x][y+1] < 4 && population[x+1][y] > 2 )  {
   	   z = 0.25;
   	   return z;}
  	
  	else if (population[x][y+1] < 6 && population[x+1][y] > 4 )  {
    	z = 0.5;
       return z;}
    	   
  	else if (population[x][y+1] < 8 && population[x+1][y] > 6 )  {
        z = 0.75;  
       return z;}
 	
    else {return z;}
    }
    
    
    public static double ansteckung5 (int x, int y) { 
    	double t = 0;
    	
    if (population[x][y+1] < 2 )  {
  	   t = 0.0;
  	   return t;}
  	
  	else if (population[x][y+1] < 4 && population[x+1][y] > 2 )  {
   	   t = 0.25;
   	   return t;}
  	
  	else if (population[x][y+1] < 6 && population[x+1][y] > 4 )  {
    	t = 0.5;
       return t;}
    	   
  	else if (population[x][y+1] < 8 && population[x+1][y] > 6 )  {
        t = 0.75;  
       return t;}
 	
    else {return t;}
    }
    
    
    
    

    
    public static void ansteckung(int x, int y, double z) {
    	int zufall = 10;
		int test =0;
    	boolean a = infectioes(x+1,y);
    	boolean b = infectioes(x-1,y);
    	boolean c = infectioes(x,y+1);
    	boolean d = infectioes(x,y-1);
   
    	
		
    	
    	if (population[x][y] == 0  ) {
    		
    	
    		if (a && b && c && d)  {
         	     zufall = (int)(Math.random() * (1  + ansteckung2(x,y) + ansteckung3(x,y) + ansteckung4(x,y) + ansteckung5(x,y))/z);}
         	     
    		else if (a && b && c || a && b && d || a && d && c || b && d && c )  {
    			zufall = (int)(Math.random() * (1 + 0.25 + ansteckung2(x,y) + ansteckung3(x,y) + ansteckung4(x,y) + ansteckung5(x,y))/z);}
    		
    		else if (a && b || a && c || a && d || b && c || b && d || c && d)  {
    			zufall = (int)(Math.random() * (1 + 0.50 + ansteckung2(x,y) + ansteckung3(x,y) + ansteckung4(x,y) + ansteckung5(x,y))/z);}
    		
    		else if (a || b || c || d)  {
    			zufall = (int)(Math.random() * (1 + 0.75 + ansteckung2(x,y) + ansteckung3(x,y) + ansteckung4(x,y) + ansteckung5(x,y))/z);}
       		
    		
    		
    	
    	       if (zufall == 0) {
                  // Berechnung der Ansteckung
                  population[x][y] = 1;}  
    	} else if (population[x][y] >= 1  ) {
    		population[x][y] = population[x][y]+1;
    	
    } 
} 
    
    public static void test(int o) {
    }
    	
    	
    public static void init() {
    	for (int i=0; i<3; i++) {
    	int x = (int)(Math.random() * menschen-1)+1;
    	int y = (int)(Math.random() * menschen1-1)+1;
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
    
    public static void zeit(int limit, double z) {
    	int c =0;
    	int b=0;
    	int a=0;
      	int e=0;
      	
      	
    for ( tage = 0; tage< limit; tage++) {
        for (int i = 1; i< menschen-1; i++) {
            for (int j = 1; j< menschen1-1; j++) {
            	ansteckung2(i,j);
            	ansteckung3(i,j);
            	ansteckung(i,j,z);
            	
            	
            	if (population[i][j] == 8) {
            		e++;
            	}
            	
            	if (population[i][j] == 1) {
            		a++;
            	}
            	
            
            	
            	 if (population[i][j] > 7 && population[i][j] < 13 && s == true) {
                  	b++;
                  	s = false;}
                  	
            }
        }

        console.clearScreen(); // L�schen des Inhalts von console
        console.println("Tag: " + tage );
        console.println("Kranke Personen: " + (a-e));
        console.println("Geheilte Personen: " + b);
        console.println("Noch nicht erkrankte Personen: " + ((menschen*menschen1)-(a-e+b)));
        // Ausgabe im Fenster von console (Typ VTerm)
        
        print();
        console.delay(500);
    }  
    }
    
    
}