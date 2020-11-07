package ch.trinat.edu.etutorial.p01.ex04.tictactoe;
import java.util.Scanner;

public class TicTacToe 
{
	public static void main(String[] args)
	{
		char [][]brett =new char [3][3];
		boolean spieler1=true,ende=false;
		int zeile, spalte;
		int runde=1;
		String gewonnen="Niemand";
		
		//Initialisierung der Werte des Spielbrettes.
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++)
			{
				brett[i][j]=' ';
			}
		}
		//Erte ausgabe des Spielbretts.
        System.out.println("      1  2  3");
        System.out.println("   <---------");
		for (int i=0;i<3;i++)
		{
			int x=i+1;//dient zur anzeige der richtigen Zeile.
	        System.out.print(" "+x+" | ");
			for (int j=0;j<3;j++)
			{
				System.out.print(" "+brett[i][j]+" ");
			}
			System.out.println();
		}
		try(Scanner eingabe = new Scanner(System.in))
		{
			do 
			{	
				//Spieler Eingabe.
					if(spieler1==true) //Spieler 1 Eingabe.
					{
						do
						{
							System.out.print("Spieler 1: Gebe Sie die Zeile an.");
							do 
							{
						        zeile =eingabe.nextInt();	
						        if ((zeile<1)|(zeile>3))
						        {
									System.out.println("Eingabe ungültig!");
									System.out.println("Eingabe muss sich zwischen 1 und 3 befinden");
						        }
							}while((zeile<1)&(zeile>3));
							
							System.out.print("Spieler 1: Gebe Sie die Spalte an.");
							do 
							{
								spalte =eingabe.nextInt();
						        if ((spalte<1)|(spalte>3))
						        {
									System.out.println("Eingabe ungültig!");
									System.out.println("Eingabe muss sich zwischen 1 und 3 befinden");
						        }
							}while((spalte<1)&(spalte>3));
							if ((brett[zeile-1][spalte-1]=='X')|(brett[zeile-1][spalte-1]=='O'))
							{
								System.out.println("Eingabe ungültig!");
								System.out.println("Es befindet sich schon ein Zeichen an dieser Stelle!");
							}
						}while((brett[zeile-1][spalte-1]=='X')&(brett[zeile-1][spalte-1]=='O'));
				        brett[zeile-1][spalte-1]='X';
						spieler1=false;
						runde++;
					}
					
					else//Spieler 2 Eingabe.
					{
						System.out.print("Spieler 2: Gebe Sie die Zeile an.");
				        zeile =eingabe.nextInt();
						System.out.print("Spieler 2: Gebe Sie die Spalte an.");
				        spalte =eingabe.nextInt();
				        brett[zeile-1][spalte-1]='O';
						spieler1=true;
						runde++;
					}
					
					//Ausgabe des Spielbretts.
			        System.out.println("      1  2  3");
			        System.out.println("   <---------");
					for (int i=0;i<3;i++)
					{
						int x=i+1;//dient zur anzeige der richtigen Zeile.
				        System.out.print(" "+x+" | ");
						for (int j=0;j<3;j++)
						{
							System.out.print(" "+brett[i][j]+" ");
						}
						System.out.println();
					}
					
					//Hat jemand gewonnen?
					if 
						(
							(brett[0][0]=='X')&&(brett[0][1]=='X')&&(brett[0][2]=='X')||
							(brett[1][0]=='X')&&(brett[1][1]=='X')&&(brett[1][2]=='X')||
							(brett[2][0]=='X')&&(brett[2][1]=='X')&&(brett[2][2]=='X')||

							(brett[0][0]=='X')&&(brett[1][0]=='X')&&(brett[2][0]=='X')||
							(brett[0][1]=='X')&&(brett[1][1]=='X')&&(brett[2][1]=='X')||
							(brett[0][2]=='X')&&(brett[1][2]=='X')&&(brett[2][2]=='X')||
							
							(brett[0][0]=='X')&&(brett[1][1]=='X')&&(brett[2][2]=='X')||
							(brett[2][0]=='X')&&(brett[1][1]=='X')&&(brett[0][2]=='X')		
						)
					{
						gewonnen="Spieler 1";
						ende=true;
					}
					if 
						(
							(brett[0][0]=='O')&&(brett[0][1]=='O')&&(brett[0][2]=='O')||
							(brett[1][0]=='O')&&(brett[1][1]=='O')&&(brett[1][2]=='O')||
							(brett[2][0]=='O')&&(brett[2][1]=='O')&&(brett[2][2]=='O')||

							(brett[0][0]=='O')&&(brett[1][0]=='O')&&(brett[2][0]=='O')||
							(brett[0][1]=='O')&&(brett[1][1]=='O')&&(brett[2][1]=='O')||
							(brett[0][2]=='O')&&(brett[1][2]=='O')&&(brett[2][2]=='O')||
							
							(brett[0][0]=='O')&&(brett[1][1]=='O')&&(brett[2][2]=='O')||
							(brett[2][0]=='O')&&(brett[1][1]=='O')&&(brett[0][2]=='O')		
						)
					{
						gewonnen="Spieler 2";			
						ende=true;
					}

			}while((ende==false)&(runde<10));	
			System.out.println(gewonnen+" hat Gewonnen!");
		}
	}
}
