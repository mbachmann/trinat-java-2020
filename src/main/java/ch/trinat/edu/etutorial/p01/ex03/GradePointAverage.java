package ch.trinat.edu.etutorial.p01.ex03;

import java.util.Scanner;

public class GradePointAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float grade, gradePointAverage;
		float sum = 0;
		float count = 0;
		boolean nextGrade = true;

		while (nextGrade == true) {
			System.out.println("Enter your grade: (enter 0 to finish)");
			grade = input.nextFloat();
			if (grade == 0) {
				nextGrade = false; // nächste Schleife wird nicht ausgeführt
			} else {
				sum += grade; // Noten werden summiert
				count++; // # Noten actualisiert
			}
		}
		gradePointAverage = sum / count;
		System.out.println("Your GPA is: " + gradePointAverage);
		input.close();
	}

}
