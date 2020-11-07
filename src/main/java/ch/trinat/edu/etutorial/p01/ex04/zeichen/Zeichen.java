package ch.trinat.edu.etutorial.p01.ex04.zeichen;

public class Zeichen 
{
	public static void main(String[] args) 
	{
char [][] brettA = new char [5][5];
		
		brettA [0][0] = ' ';
		brettA [0][1] = ' ';
		brettA [0][2] = 'X';
		brettA [0][3] = ' ';
		brettA [0][4] = ' ';
		
		brettA [1][0] = ' ';
		brettA [1][1] = 'X';
		brettA [1][2] = ' ';
		brettA [1][3] = 'X';
		brettA [1][4] = ' ';
		
		brettA [2][0] = 'X';
		brettA [2][1] = 'X';
		brettA [2][2] = 'X';
		brettA [2][3] = 'X';
		brettA [2][4] = 'X';
		
		brettA [3][0] = 'X';
		brettA [3][1] = ' ';
		brettA [3][2] = ' ';
		brettA [3][3] = ' ';
		brettA [3][4] = 'X';
		
		brettA [4][0] = 'X';
		brettA [4][1] = ' ';
		brettA [4][2] = ' ';
		brettA [4][3] = ' ';
		brettA [4][4] = 'X';
		
		for (int j=0; j<5; j++)
		{   
			for (int i=0; i<5; i++)
			{
				System.out.print(brettA[j][i]);
			}
			System.out.println();
		}
		System.out.println();
		
		char [][] brettZ = new char [5][5];
		
		brettZ [0][0] = 'X';
		brettZ [0][1] = 'X';
		brettZ [0][2] = 'X';
		brettZ [0][3] = 'X';
		brettZ [0][4] = 'X';
		
		brettZ [1][0] = ' ';
		brettZ [1][1] = ' ';
		brettZ [1][2] = ' ';
		brettZ [1][3] = 'X';
		brettZ [1][4] = ' ';
		
		brettZ [2][0] = ' ';
		brettZ [2][1] = ' ';
		brettZ [2][2] = 'X';
		brettZ [2][3] = ' ';
		brettZ [2][4] = ' ';
		
		brettZ [3][0] = ' ';
		brettZ [3][1] = 'X';
		brettZ [3][2] = ' ';
		brettZ [3][3] = ' ';
		brettZ [3][4] = ' ';
		
		brettZ [4][0] = 'X';
		brettZ [4][1] = 'X';
		brettZ [4][2] = 'X';
		brettZ [4][3] = 'X';
		brettZ [4][4] = 'X';
		
		for (int j=0; j<5; j++)
		{   
			for (int i=0; i<5; i++)
			{
				System.out.print(brettZ[j][i]);
			}
			System.out.println();
		}
	}
}
