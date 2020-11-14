package ch.trinat.edu.etutorial.p01.ex04;

public class Mein_2D_Array {

	public static void main(String[] args) {
		
		char [][] MeinArray = new char [5][5];
		
		MeinArray[0][0] = ' ';
		MeinArray[0][1] = ' ';
		MeinArray[0][2] = 'X';
		MeinArray[0][3] = ' ';
		MeinArray[0][4] = ' ';
		
		MeinArray[1][0] = ' ';
		MeinArray[1][1] = 'X';
		MeinArray[1][2] = ' ';
		MeinArray[1][3] = 'X';
		MeinArray[1][4] = ' ';
		
		MeinArray[2][0] = 'X';
		MeinArray[2][1] = 'X';
		MeinArray[2][2] = 'X';
		MeinArray[2][3] = 'X';
		MeinArray[2][4] = 'X';
		
		MeinArray[3][0] = 'X';
		MeinArray[3][1] = ' ';
		MeinArray[3][2] = ' ';
		MeinArray[3][3] = ' ';
		MeinArray[3][4] = 'X';
		
		MeinArray[4][0] = 'X';
		MeinArray[4][1] = ' ';
		MeinArray[4][2] = ' ';
		MeinArray[4][3] = ' ';
		MeinArray[4][4] = 'X';
		
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(MeinArray[i][j]);
			}
			System.out.println();
		}

	}

}
