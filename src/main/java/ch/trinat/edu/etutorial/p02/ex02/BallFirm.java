package ch.trinat.edu.etutorial.p02.ex02;
public class BallFirm {
	public static void main(String[] args) {
		Ball[] balls = new Ball[20];

		for (int i = 0; i < 20; i++) {
			balls[i] = new Ball(Math.random() * 10);
		}

		double volume = 0;
		double surface = 0;

		for (int i = 0; i < balls.length; i++) {
			balls[i].print();
		}

		/* Calculate here how large the total volume or the surface is */
		for (int i = 0; i < 20; i++) {
			volume += balls[i].volume();
		}
		for (int i = 0; i < 20; i++) {
			surface += balls[i].surface();
		}

		System.out.println("Total volume: " + Math.round(volume * 100) / 100.0 + " Total surface: "
				+ Math.round(surface * 100) / 100.0);
	}
}