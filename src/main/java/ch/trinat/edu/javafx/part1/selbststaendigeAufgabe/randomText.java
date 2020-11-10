package ch.trinat.edu.javafx.part1.selbststaendigeAufgabe;

public class randomText {
	// random Activity generator
	public static String randomActivity(){
		int temp = (int)(Math.random()*Main.activity.size());
		return Main.activity.elementAt(temp);
	}

}
