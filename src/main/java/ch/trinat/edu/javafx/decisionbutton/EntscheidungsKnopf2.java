package ch.trinat.edu.javafx.decisionbutton;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EntscheidungsKnopf2 extends Application{
	Stage fenster;
	Scene szene1, szene2;
	Label EntscheidungsKnopf1, EntscheidungsKnopf2, print;
	Button button1, button2, ideen, save1, save2;
	TextField neuEntscheidung1 = new TextField();
	TextField neuEntscheidung2 = new TextField();
	int i;
	List <String> antworten = new ArrayList<>() ;
	
	public static void main (String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		try {
			fenster = primaryStage;
			EntscheidungsKnopf1 = new Label("Was machen wir heute Abend?");
			EntscheidungsKnopf2 = new Label("Oder?");
			print = new Label();

			button1 = new Button("Klick mich");
			button2 = new Button("Anders");
			ideen = new Button("Ein paar Ideen");
			save1 = new Button("save");
			save2 = new Button("save");
			
			
			save1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (error(neuEntscheidung1.getText()) == false) antworten.add(neuEntscheidung1.getText());
				}
			});
			
			save2.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (error(neuEntscheidung2.getText()) == false) antworten.add(neuEntscheidung2.getText());
					
				}
			});
			
			
			button1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					if (antworten.size() != 0) {
					fenster.setScene(szene2);
					fenster.show();
					i = zufall();
					print.setText(antworten.get(i));
				}
				}
			});
			
			ideen.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					antworten.add("Kino");
					antworten.add("Essen gehen");
					antworten.add("Programmieren");
					antworten.add("Schlafen");
					antworten.add("Einkauf gehen");
					antworten.add("Musik hören");
					antworten.add("Konzert");
					antworten.add("Freunde treffen");
					antworten.add("Fahrrad fahren");
					antworten.add("Fernsehen");
				}
			});

			VBox layout1 = new VBox(30);
			layout1.getChildren().addAll(EntscheidungsKnopf1, neuEntscheidung1, save1, button1, ideen);
			szene1 = new Scene(layout1, 300, 250);

			button2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {

					i = zufall();
					print.setText(antworten.get(i));

					fenster.setScene(szene2);
					fenster.show();
				}
			});
			VBox layout2 = new VBox(30);
			layout2.getChildren().addAll(EntscheidungsKnopf2, print, neuEntscheidung2, save2, button2);
			szene2 = new Scene(layout2, 300, 250);
			primaryStage.setScene(szene1);
			primaryStage.show();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public int zufall () {
		int i = (int) (Math.random()*antworten.size());
		return i;
	}
	
	public boolean error(String s) {
				
		for (int i = 0; i < antworten.size(); i++) {
			if (s.equalsIgnoreCase(antworten.get(i)) == true) {
				return true;
			}
		}
		
		char [] c = s.toCharArray();
		for (int i = 0; i < c.length; i++ ) {
			if (c[i] == ' ' && c[i] == c[i+1]) {
				return true;
			}
		}
		return false;
	}
}

