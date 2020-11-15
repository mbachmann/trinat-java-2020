package ch.trinat.edu.etutorial.p01.ex04;

public class CharDisplay {

	public static void main(String[] args) {
		char display[][] = new char[5][5];

		// Initialization Z
		display[0][0] = 'X';
		display[0][1] = 'X';
		display[0][2] = 'X';
		display[0][3] = 'X';
		display[0][4] = 'X';

		display[1][0] = ' ';
		display[1][1] = ' ';
		display[1][2] = ' ';
		display[1][3] = 'X';
		display[1][4] = ' ';

		display[2][0] = ' ';
		display[2][1] = ' ';
		display[2][2] = 'X';
		display[2][3] = ' ';
		display[2][4] = ' ';

		display[3][0] = ' ';
		display[3][1] = 'X';
		display[3][2] = ' ';
		display[3][3] = ' ';
		display[3][4] = ' ';

		display[4][0] = 'X';
		display[4][1] = 'X';
		display[4][2] = 'X';
		display[4][3] = 'X';
		display[4][4] = 'X';

		// print 5 Spalten in 5 Zeilen
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(display[i][j]);
			}
			System.out.println();
		}

		// Initialization A
		display[0][0] = ' ';
		display[0][1] = ' ';
		display[0][2] = 'X';
		display[0][3] = ' ';
		display[0][4] = ' ';

		display[1][0] = ' ';
		display[1][1] = 'X';
		display[1][2] = ' ';
		display[1][3] = 'X';
		display[1][4] = ' ';

		display[2][0] = 'X';
		display[2][1] = 'X';
		display[2][2] = 'X';
		display[2][3] = 'X';
		display[2][4] = 'X';

		display[3][0] = 'X';
		display[3][1] = ' ';
		display[3][2] = ' ';
		display[3][3] = ' ';
		display[3][4] = 'X';

		display[4][0] = 'X';
		display[4][1] = ' ';
		display[4][2] = ' ';
		display[4][3] = ' ';
		display[4][4] = 'X';

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(display[i][j]);
			}
			System.out.println();
		}
	}
}
