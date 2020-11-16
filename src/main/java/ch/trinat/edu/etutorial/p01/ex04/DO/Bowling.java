package ch.trinat.edu.etutorial.p01.ex04.DO;

import java.util.Scanner;

public class Bowling {

	public static void main(String[] args) {
		
		int [][] resultate;
		int max=0;
		int index = 0;
		int z = 0;
	    int search = 10;
		int firstIndex = -1;
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Wie viele Runden m�chten Sie spielen ?: ");
	    int c = eingabe.nextInt();// variabeln fur runden
	    System.out.println("Wie viele Spieler werden spielen?: ");
	    int b = eingabe.nextInt();// variabeln fur spieler
	    System.out.println();
	    System.out.println();

	    
	    if (c>=b) { // array funktionniert nicht wenn nicht diseleben nummern es konstutieren ??
		resultate = new int [c][c]; // array fur deco
		int [] summe = new int [c*b];// array fur summe
		int test=0; // variabeln fur punkte
		
		
		for (int i = 0; i<c; i++) {
			for (int a = 0; a<b; a++) {
				System.out.print("Bitte geben sie die Punkte des " + (a+1) + " Spielers an in der " + (i+1) + " Runde: ");
				test = eingabe.nextInt();
				 while (test > 10) {
				    	System.out.print("Bitte geben sie eine Zahl zwischen 0 und 10 an: ");
				    	test = eingabe.nextInt();
				    }
			    resultate[i][a] = test; // eingabe von den punkten in das array
			}
		}	
		
		System.out.println("***********************");
		System.out.println("            * Spieler *");
		System.out.println("            ***********");
	   
		System.out.print("           ");
		for (int i = 0; i<b; i++) {
		System.out.print(" " + (i+1)); // ausgabe von nummern von spielern
		}
		System.out.println();
		System.out.print("***********************");
		
		for (int i = 0; i<c; i++) {
			System.out.println();
			System.out.print(i+1 + ".Runde    "); // ausgabe fur nummern von Runden
			
			for (int a = 0; a<b; a++) {
				System.out.print(" " + resultate[i][a]);	
			}
		}		
		
		
		System.out.println();
		System.out.println("***********************");
		
	    System.out.print("Summe:      ");
	    if (c>b) {
		for(int i = 0; i < resultate.length-1; i++){    
            for(int j = 0; j < resultate.length; j++){  
              summe[i] = summe[i] + resultate[j][i];  // eingabe von summe in das summen array
            }  
            
            System.out.print(summe[i] + " "); 
		}
		
		
		   System.out.println();
		   System.out.print("Keinen pin: "); // for schleife die nach der Nummer 0 sucht
            int s=0;
            for(int p=0;p<resultate.length-1;p++){
	 		    for(int w=0;w<resultate.length;w++) {
	 		        if(resultate[w][p]<1){
	 		         s++;
	 	    }
	 		     
        } System.out.print(s + " "); 
	 		        s=0;
			}
 			
           int e =0;
            System.out.println();
			   System.out.print("Strikes:    "); // for schleife die nach der Nummer 10 sucht
	            int f=0;
	            for(int p=0;p<resultate.length-1;p++){
		 		    for(int w=0;w<resultate.length;w++) {
		 		        if(resultate[w][p]>9){
		 		        f++;
		 		        e=f;
		 	    }
		 		     
	        } System.out.print(f + " "); 
		 		        f=0;
				}
	           
    		   
	            for(int i = 0; i < summe.length; i++) // findet den spieler mit der maximalen punktzahl und gibt seine Nummer aus
		        { 
		            if(max < summe[i])
		            {
		                max = summe[i];
		                index =  i ;
		            }
		        }
	            System.out.println();
	            System.out.println("***********************");
		        System.out.println("Spieler: "+(index+1) + " hat gewonnen");
		
		       
	
		      for (int i = 0; i < resultate.length; i++) {
		    	  for ( z = 0; z < resultate.length; z++) { 
		         
		         if (resultate[z][i] == search ) {
		               firstIndex = z;
		               z = z+(c-z); 
		               
		          }
		    	  }
		    	 
		    	  
		    	  if (firstIndex+1 != 0) {
			    	  System.out.println("Der Spieler " + (i+1) + " hat in der Runde " + (firstIndex+1) + " seinen ersten Strike gebowlt");
			    	  firstIndex = -1;
			    	  }
	    }
		    

		      

			 
		        
		        
		        
		        
		        
		        
		        
		        
		        
		
		 		    }
		
		else {
			for(int i = 0; i < resultate.length; i++){    
	            for(int j = 0; j < resultate.length; j++){  
	              summe[i] = summe[i] + resultate[j][i];  // eingabe von summe in das summen array
	             
	            }  
	            System.out.print(summe[i] + " "); 
	           
			}		
		
			for(int i = 0; i < resultate.length; i++){    
	            for(int j = 0; j < resultate.length; j++){  
	              summe[i] = summe[i] + resultate[j][i];  // eingabe von summe in das summen array
	             
	            }   
			}
			
			   System.out.println();
			   System.out.print("Keinen pin: "); // for schleife die nach der Nummer 0 sucht
	            int s=0;
	            for(int p=0;p<resultate.length;p++){
		 		    for(int w=0;w<resultate.length;w++) {
		 		        if(resultate[w][p]<1){
		 		         s++;
		 	    }
		 		     
	        } System.out.print(s + " "); 
		 		        s=0;
				}
	 			
  
	            System.out.println();
				   System.out.print("Strikes:    "); // for schleife die nach der Nummer 10 sucht
		            int f=0;
		            for(int p=0;p<resultate.length;p++){
			 		    for(int w=0;w<resultate.length;w++) {
			 		        if(resultate[w][p]>9){
			 		        f++;
			 	    }
			 		     
		        } System.out.print(f + " "); 
			 		        f=0;
					}
		  
		            
		            for(int i = 0; i < summe.length; i++)
			        { 
			            if(max < summe[i])
			            {
			                max = summe[i];
			                index =  i ;
			            }
			        }
		            
		            System.out.println();
		            System.out.println("***********************");
			        System.out.println("Spieler: "+(index+1) + " hat gewonnen");
			
			
			   
				 
				      
				      for (int i = 0; i < resultate.length; i++) {
				    	  for ( z = 0; z < resultate.length; z++) { 
				         
				    		  
				    		
				    		  z = 0;
						      search = 10;
						      firstIndex = -1;
						     
						      
						      for ( i = 0; i < resultate.length-1; i++) {
						    	  for ( z = 0; z < resultate.length; z++) { 
						         
						    		  z = 0;
								      search = 10;
								      firstIndex = -1;
								     
								      
								      for ( i = 0; i < resultate.length-1; i++) {
								    	  for ( z = 0; z < resultate.length; z++) { 
								         
								         if (resultate[z][i] == search ) {
								               firstIndex = z;
								               z = z+(c-z); 
								               
								          }
								    	  }
								    	 
								    	  
								    	  if (firstIndex+1 != 0) {
									    	  System.out.println("Der Spieler " + (i+1) + " hat in der Runde " + (firstIndex+1) + " seinen ersten Strike gebowlt");
									    	  firstIndex = -1;
									    	  }
							    }
								    
						    
				          
            	 
        		  
	
    
	    
	    
	    
	    
	    
	    
	
		
	    
	    
				      }
	    }}}}}
	    
	    else if (c<b) { // selbe code nur ist b grosser als c
			resultate = new int [b][b]; // deshalb verndert sich auch die grosse des Arrays
			int [] summe = new int [c*b];
			int test;
			
			
			for (int i = 0; i<c; i++) {
				for (int a = 0; a<b; a++) {
					System.out.print("Bitte geben sie die Punkte des " + (a+1) + " Spielers an in der " + (i + 1) + " Runde: ");
					test = eingabe.nextInt();
					 while (test > 10) {
					    	System.out.print("Bitte geben sie eine Zahl zwischen 0 und 10 an: ");
					    	test = eingabe.nextInt();
					    }
				    resultate[i][a] = test;	
				}
			}	
			
			
			System.out.println("***********************");
			System.out.println("            * Spieler *");
			System.out.println("            ***********");
		   
			System.out.print("           ");
			for (int i = 0; i<b; i++) {
			System.out.print(" " + (i+1));
			}
			System.out.println();
			System.out.print("***********************");
			
			for (int i = 0; i<c; i++) {
				System.out.println();
				System.out.print(i+1 + ".Runde    ");
				
				for (int a = 0; a<b; a++) {
					System.out.print(" " + resultate[i][a]);
					
				}
			}		
			
			
			System.out.println();
			System.out.println("***********************");
			 System.out.print("Summme:     ");
			
			for(int i = 0; i < resultate.length; i++){    
	            for(int j = 0; j < resultate.length; j++){  
	              summe[i] = summe[i] + resultate[j][i];  
	            }  
	            
	            System.out.print(summe[i] + " "); 
	          
			}    
			
			System.out.println();
			   System.out.print("Keinen pin: "); // for schleife die nach der Nummer 0 sucht
	            int s=0;
	            for(int p=0;p<resultate.length;p++){
		 		    for(int w=0;w<resultate.length;w++) {
		 		        if(resultate[w][p]<1){
		 		         s++;
		 	    }
		 		     
	        } System.out.print(s + " "); 
		 		        s=0;
				}
	 			

	            System.out.println();
				   System.out.print("Strikes:    "); // for schleife die nach der Nummer 10 sucht
		            int f=0;
		            for(int p=0;p<resultate.length;p++){
			 		    for(int w=0;w<resultate.length;w++) {
			 		        if(resultate[w][p]>9){
			 		        f++;
			 	    }
			 		     
		        } System.out.print(f + " "); 
			 		        f=0;
					}
			
		            
		            
		            for(int i = 0; i < summe.length; i++)
			        { 
			            if(max < summe[i])
			            {
			                max = summe[i];
			                index =  i ;
			            }
			        }
		            System.out.println();
		            System.out.println("***********************");
			        System.out.println("Spieler: "+(index+1) + " hat gewonnen");
			
			
			  
				      
				      for (int i = 0; i < resultate.length; i++) {
				    	  for ( z = 0; z < resultate.length; z++) { 
				         
				         if (resultate[z][i] == search ) {
				               firstIndex = z;
				               z = z+(c-z);
				             
				          }
				    	  }
				    	  if (firstIndex+1 != 0) {
				    	  System.out.println("Der Spieler " + (i+1) + " hat in der Runde " + (firstIndex+1) + " seinen ersten Strike gebowlt"); 
				    	  firstIndex = -1;
				    	  }
			
	    
	    
	    
	    }
	
	
	 eingabe.close();
	
	
	    }}}
