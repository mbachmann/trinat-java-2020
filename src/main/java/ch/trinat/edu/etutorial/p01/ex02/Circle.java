package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		double radius, circumference, area;
		final double PI = 3.14159;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		radius = input.nextDouble();
		circumference = 2 * PI * radius;
		circumference = Math.round(circumference * 100) / 100.0;
		area = PI * radius * radius;
		area = Math.round(area * 100) / 100.0;
		System.out.println("The circumference is: " + circumference);
		System.out.println("The area is: " + area);
		input.close();
	}

}
