// Mischa Kissling
// 07/2020

package ch.trinat.edu.etutorial.p01.ex04;

//import java.util.Scanner;

public class ZweiDarray {

	public static void main(String[] args) {
		
		char [][] feld = new char [5][5];
		
		for (int i=0 ; i<5 ; i++) {
			for (int j=0 ; j<5 ; j++) {
				feld [i][j] = 'X';
			}
		}
		//feld [0][0] = 'X';
		//feld [0][1] = 'X';
		//feld [0][2] = 'X';
		//feld [0][3] = 'X';
		//feld [0][4] = 'X';
		
		//feld [1][0] = ' ';
		//feld [1][1] = ' ';
		//feld [1][2] = ' ';
		//feld [1][3] = ' ';
		//feld [1][4] = ' ';
		
		//feld [2][0] = 'X';
		//feld [2][1] = 'X';
		//feld [2][2] = 'X';
		//feld [2][3] = 'X';
		//feld [2][4] = 'X';
		
		//feld [3][0] = ' ';
		//feld [3][1] = ' ';
		//feld [3][2] = ' ';
		//feld [3][3] = ' ';
		//feld [3][4] = ' ';
		
		//feld [4][0] = 'X';
		//feld [4][1] = 'X';
		//feld [4][2] = 'X';
		//feld [4][3] = 'X';
		//feld [4][4] = 'X';
		
		for (int i=0 ; i<5 ; i++) {
			for (int j=0 ; j<5 ; j++) {
				System.out.print(feld[i][j]);
			}
			System.out.println();
		}
		
	}

}
