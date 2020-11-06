package ch.trinat.edu.etutorial.p03.oo5;
//Mischa Kissling
//10/2020

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Feinstaubbelastung {

	public static void main(String[] args) {

		Vector<Messstation> FeinstaubData = new Vector<Messstation>();
		String[] result = null;

		try (FileReader f = new FileReader("PM10_2003.txt");){
			//FileReader f = new FileReader("PM10_2003.txt");
			char[] c = new char [1000000];
			f.read(c);
			String s = new String(c);
			result = s.split(";|\n");

			for (int i=0 ; i<result.length-1 ; i=i+8) {

				Messstation tempData = new Messstation (result[i], result[i+1], result[i+2], result[i+3], 
						Integer.parseInt(result[i+4]), Integer.parseInt(result[i+5]),
						Integer.parseInt(result[i+6]),Integer.parseInt(result[i+7]));

				FeinstaubData.add(tempData);
			}
			System.out.println("File wurde erfolgreich eingelesen");
			System.out.println(FeinstaubData.size() + " Einträge generiert \n");

			System.out.println("Durchschnitt aller Jahresmittelwerte: " + calcYearlyAverage(FeinstaubData));
			
			Vector<Messstation> dataOverValue = getStationAverageOver(FeinstaubData, 40);
			System.out.println(dataOverValue.size() + " Stationen mit Jahresmittelwert über dem Grenzwert von 40 " + (char) 181 + "g/m3");
			System.out.println("------------------------------------------------------------------------------");
			
			formattedDataPrint(dataOverValue);

		}
		catch (IOException e) {
			System.err.println("Fehler beim Einlesen der Datei");
			System.err.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Bei der Verarbeitung ist ein Fehler aufgetreten");
			System.out.println(e.getMessage());
		}
	}			//Main geht bis hier


	public static double calcYearlyAverage(Vector<Messstation> data) {
		double total = 0;

		for (int i=0 ; i<data.size() ; i++) {
			Messstation tmpData = data.get(i);
			total = total + tmpData.getYearlyAverage();
		}
		return total/data.size();
	}

	private static Vector<Messstation> getStationAverageOver(Vector<Messstation> data, int limitValue) {

		Vector<Messstation> dataOverValue = new Vector<Messstation>();
		for (int i=0 ; i<data.size() ; i++) {
			Messstation tmpData = (Messstation) data.get(i);
			if (tmpData.getYearlyAverage() > limitValue) {
				dataOverValue.add(tmpData);
			}
		}
		return dataOverValue;
	}

	public static void formattedDataPrint (Vector<Messstation> data) {

		for (int i=0 ; i<data.size() ; i++) {
			Messstation tmpData = (Messstation) data.get(i);
			System.out.println(tmpData.getName() + " - " + tmpData.getSourceTyp() + " - " + tmpData.getEnvironment());
		}
	}


	public static void formattedDataPrint (Vector<Messstation> data, int vectorPlace) {

			Messstation tmpData = (Messstation) data.get(vectorPlace);
			System.out.println(tmpData.getId() + " " + tmpData.getName());
			System.out.println("Emissionsquelltyp: " + tmpData.getSourceTyp());
			System.out.println("Umgebungstyp: " + tmpData.getEnvironment());
			System.out.println("Jahresmittelwert: " + tmpData.getYearlyAverage());
			System.out.println("Maximaler Tageswert: " + tmpData.getDailyMax());
			System.out.println("Tage über dem Grenzwert von 50 Mikrogramm pro Kubikmeter: " + tmpData.getDaysOver50());
			System.out.println("Tage über dem Grenzwert von 50 Mikrogramm pro Kubikmeter: " + tmpData.getDaysOver60());
			
	}
}