package ch.trinat.edu.javafx.part1.selbststaendigeAufgabe;

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class randomText {
	//static Vector<String> activity = new Vector<String>();
	
	// random Activity generator
	public static String randomActivity(){
		int temp = (int)(Math.random()*Main.activity.size());
		return Main.activity.elementAt(temp);
	}

}
