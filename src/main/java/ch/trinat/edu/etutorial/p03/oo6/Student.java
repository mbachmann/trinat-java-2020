package ch.trinat.edu.etutorial.p03.oo6;

public class Student extends Person {
 
	protected static String studiengang;
	
	public static final String[] anzeige= {
			"Name" , "Vorname", "Strasse" , "Hausnummer" , "PLZ" ,
			"Wohnort" , "Geburtsdatum(dd.mm.yyyy)", "Studiengang"
	};
	public Student(String[]input) {
		super(input);
		studiengang=input[6];
	}

}
