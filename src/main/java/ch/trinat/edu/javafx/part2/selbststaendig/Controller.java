package ch.trinat.edu.javafx.part2.selbststaendig;

import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
	static Vector<String> liste=new Vector<String>(); 
	int random;
	boolean erreur;

	public static Vector<String> liste () {
		liste.add("Kino"); 
		liste.add("Essen gehen");
		liste.add("Schwimmen");
		liste.add("Spazieren gehen");
		liste.add("Kochen");
		liste.add("Schlafen");
		return liste;}

	@FXML
	private Button btn1;
	@FXML
	private TextField text;
	@FXML
	private Button save;
	@FXML

	protected void change (ActionEvent event)
	{	random();
	}


	public void add () {
		liste.add(text.getText());
		fehler();
	}

	public void random () {
		int a=random;
		random=(int) (Math.random() * liste.size());
		while (a==random) {
			random=(int) (Math.random() * liste.size());
		}
		for (int i=0; i<liste.size(); i++) {
			if (random==i) {
				btn1.setText(liste.get(i));}}
	}

	public void fehler () {
		if (liste.indexOf("Schreiben Sie hier...")==(liste.size()-1)) {
			System.out.println("Achtung ! Sie haben nichts geändert!");
			liste.remove(liste.size()-1);}

		for (int i=0; i<liste.size()-1; i++) {
			if (liste.indexOf(liste.get(i))==liste.indexOf(liste.get(liste.size()-1))) {
				System.out.println("Achtung ! Es gibt schon diese Tat!");
				liste.remove(liste.size()-1);}}

		if (liste.indexOf("")==liste.indexOf(liste.get(liste.size()-1))) {
			System.out.println("Achtung ! Sie haben nichts getippt!");
			liste.remove(liste.size()-1);}}

}








