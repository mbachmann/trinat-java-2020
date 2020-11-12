package ch.trinat.edu.etutorial.p03.oo5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Messungsstationen {

	public static void main(String[] args) {
		
		Vector <Messdaten> stationen = new Vector <Messdaten>();
		
		try (FileReader f = new FileReader("src/main/java\\ch.trinat.edu.etutorial.p03.oo5\\PM10_2003.txt")){
			
			char[] c = new char[900000];
			
			f.read(c);
			
			String s = new String(c);
			String[] result = s.split(";|\n|\\r");
			
			for (int i = 0; i < result.length-1; i += 8) {
				
				Messdaten each = new Messdaten(result[i], 
						result[i+1], 
						result[i+2], 
						result[i+3], 
						Float.parseFloat(result[i+4]), 
						Float.parseFloat(result[i+5]), 
						Integer.parseInt(result[i+6]), 
						Integer.parseInt(result[i+7]));
				
				stationen.add(each);
				
			}
			
		}	catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}
		
		System.out.println("Jahresdurchschnitt:\t" + Messdaten.jahresmittelDurchschnitt() + "\u03BCg");
		System.out.println();
		
		System.out.println("Über 40 \u03BCg:");
		for (int i = 0; i<Messdaten.getMessdaten();i++) {
			if(stationen.get(i).getJahresmittelwert()>40) {
				System.out.println(stationen.get(i).toString());
			}
		}
		
		System.out.println();
		System.out.println("Alle Messdaten");
		for (int i = 0; i<Messdaten.getMessdaten();i++) {
			System.out.println(stationen.get(i).toString());
		}
		

	}

}
