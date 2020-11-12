package ch.trinat.edu.etutorial.p03.oo6.adressbuch;

public class Student extends Person {
	
	@SuppressWarnings("unused")
	private int studentID;
	public static final String [] anzeige = {" Name", " Vorname", " Strasse", " Hausnummer", " PLZ", " Ort", " Geburtsdatum (dd.mm.yyyy)", " Student ID"};
	
	public Student(String[] input, int studentID) {
		super(input);
		this.studentID = studentID;
	}

}
