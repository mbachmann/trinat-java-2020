package ch.trinat.edu.etutorial.p01.ex04;

public class Buchtsaben_zeichen {

	public static void main(String[] args) {
		
		char [][] Z = new char [5][5];
		char [][] A = new char [5][5];
		
		Z [0][0]= 'X';
		Z [0][1]= 'X';
		Z [0][2]= 'X';
		Z [0][3]= 'X';
		Z [0][4]= 'X';
		Z [1][3]= 'X';
		Z [2][2]= 'X';
		Z [3][1]= 'X';
		Z [4][0]= 'X';
		Z [4][1]= 'X';
		Z [4][2]= 'X';
		Z [4][3]= 'X';
		Z [4][4]= 'X';
		Z [1][0]= ' ';
		Z [1][1]= ' ';
		Z [1][2]= ' ';
		Z [1][4]= ' ';
		Z [2][0]= ' ';
		Z [2][1]= ' ';
		Z [2][3]= ' ';
		Z [2][4]= ' ';
		Z [3][0]= ' ';
		Z [3][2]= ' ';
		Z [3][3]= ' ';
		Z [3][4]= ' ';
		
		A [0][0]= ' ';
		A [0][1]= ' ';
		A [0][2]= 'X';
		A [0][3]= ' ';
		A [0][4]= ' ';
		A [1][0]= ' ';
		A [1][1]= 'X';
		A [1][2]= ' ';
		A [1][3]= 'X';
		A [1][4]= ' ';
		A [2][0]= 'X';
		A [2][1]= 'X';
		A [2][2]= 'X';
		A [2][3]= 'X';
		A [2][4]= 'X';
		A [3][0]= 'X';
		A [3][1]= ' ';
		A [3][2]= ' ';
		A [3][3]= ' ';
		A [3][4]= 'X';
		A [4][0]= 'X';
		A [4][1]= ' ';
		A [4][2]= ' ';
		A [4][3]= ' ';
		A [4][4]= 'X';
		
		for (int i = 0; i<5; i++) {
			System.out.println();
			for (int a = 0; a<5; a++) {
				System.out.print(Z[i][a]);
			}
		}
		
		System.out.println();
	
		
		for (int j = 0; j<5; j++) {
			System.out.println();
			for (int k = 0; k<5; k++) {
				System.out.print(A[j][k]);
			}
		}
		
	}

}
