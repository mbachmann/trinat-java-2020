package ch.trinat.edu.javafx.part1.SelbststandigeAufgabe;
import java.util.Vector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
	Vector<String> antworten = new Vector<String>();
 
@FXML
 private Button klick;
 @FXML
  
 
 public Vector<String> antworten () {
	
	antworten.add("Kino");
	antworten.add("Fernsehen");
	antworten.add("Nichts");
	antworten.add("Essen gehen");
	antworten.add("Schlaffen");
	antworten.add("Party");
	 return antworten;}
 
 public void change (ActionEvent event)
	{ antworten();
		random();
	}
 public void random () {
			int random=(int) (Math.random() * 6);
		 klick.setText(antworten.get(random));
		 }
		}

