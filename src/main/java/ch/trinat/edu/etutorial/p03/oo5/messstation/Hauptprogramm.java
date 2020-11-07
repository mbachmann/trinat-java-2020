package ch.trinat.edu.etutorial.p03.oo5.messstation;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Hauptprogramm {

	public static void main(String[] args) {
		String dateiName = "src/main/java/ch/trinat/edu/etutorial/p03/oo5/messstation/PM10_2003.txt";
		Vector <Messstation> messstationen = new Vector<Messstation>();

		try {
			FileReader f = new FileReader (dateiName);
			char[] c = new char[1000000];
			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\n");

			for (int i=0; i < result.length-1; i=i+8) {
				Messstation temp = new Messstation(result[i], result[i+1], result[i+2], result[i+3],
						Integer.parseInt(result[i+4]), Integer.parseInt(result[i+5]),
						Integer.parseInt(result[i+6]), Integer.parseInt(result[i+7]));	
				messstationen.add(temp);
			}
			System.out.println("Die Datei " + dateiName + " wurde erfolgreich eingelesen.");
			System.out.println("Es wurden " + messstationen.size() + " datensätze generiert.\n");
			f.close();
			
		} catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei.");
			System.err.println(e.getMessage());
		}
		
		int durschnittJahresMittelwert = 0;
		for (int i = 0; i < messstationen.size(); i++) {
			durschnittJahresMittelwert+=messstationen.get(i).getJahresmittelwert();
		}
		durschnittJahresMittelwert=durschnittJahresMittelwert/messstationen.size();
		System.out.println("Durschnittswert der Jahresmittelwerte aller Messstationen: " + durschnittJahresMittelwert + "\u03BCg/m\u00B3");
		System.out.println("*****************************************************************\n");
		System.out.println("Vollständiger Datensatz eines Eintrags");
		System.out.println("**************************************\n");
		messstationen.get(1).print();
		System.out.println("Messstationen mit einem Jahresmittelwert über 40\u03BCg/m\u00B3");
		System.out.println("*****************************************************\n");
		for (int i = 0; i < messstationen.size(); i++) {
			if (messstationen.get(i).getJahresmittelwert()>40) {
				messstationen.get(i).printSpezial();
			}
		}
	}
}
