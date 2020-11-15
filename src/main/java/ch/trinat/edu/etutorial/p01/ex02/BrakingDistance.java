package ch.trinat.edu.etutorial.p01.ex02;

import java.util.Scanner;

public class BrakingDistance {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double speed, reactionDistance, brakingDistance, stoppingDistance;

		System.out.println("Calculation of the braking distance of a vehicle.\n\nEnter your speed (km/h):");
		speed = input.nextDouble();
		reactionDistance = 3 * (speed / 10);
		brakingDistance = (speed / 10) * (speed / 10);
		stoppingDistance = reactionDistance + brakingDistance;
		stoppingDistance = Math.round(stoppingDistance * 100) / 100.0;

		System.out.println("\n\nYour stopping distance is: " + stoppingDistance + " meters.");
		input.close();
	}

}
