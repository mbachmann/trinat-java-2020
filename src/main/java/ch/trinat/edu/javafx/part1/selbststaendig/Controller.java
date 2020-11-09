package ch.trinat.edu.javafx.part1.selbststaendig;

import java.util.Vector;
import java.util.List; 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
	Vector<String> liste=new Vector<String>(); 
	int random;

	public Vector<String> liste () {
		liste.add("Kino"); 
		liste.add("Essen gehen");
		liste.add("Schwimmen");
		liste.add("Spazieren gehen");
		liste.add("Kochen");
		liste.add("Schlafen");
		return liste;}

	@FXML
	private Button btn;
	@FXML

	protected void change (ActionEvent event)
	{	liste();
		random();
	}

	public void random () {
		int a=random;
		random=(int) (Math.random() * 6);
		while (a==random) {
			random=(int) (Math.random() * 6);
		}
		for (int i=0; i<6; i++) {
		if (random==i) {
			btn.setText(liste.get(i));}
		}
		
	}}




