package ch.trinat.edu.javafx.decisionbutton;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EntscheidungsKnopf extends Application{
	Stage fenster;
	Scene szene1, szene2;
	Label EntscheidungsKnopf1, EntscheidungsKnopf2;
	Button button1, button2;
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

			button1 = new Button("Klick mich");
			button2 = new Button();

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

			button1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					fenster.setScene(szene2);
					fenster.show();
					i = zufall();
					button2.setText(antworten.get(i));
				}
			});

			VBox layout1 = new VBox(30);
			layout1.getChildren().addAll(EntscheidungsKnopf1, button1);
			szene1 = new Scene(layout1, 250, 150);


			button2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {

					i = zufall();
					button2.setText(antworten.get(i));

					fenster.setScene(szene2);
					fenster.show();
				}
			});
			VBox layout2 = new VBox(30);
			layout2.getChildren().addAll(EntscheidungsKnopf2, button2);
			szene2 = new Scene(layout2, 250, 150);
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
}
