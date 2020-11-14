package ch.trinat.edu.javafx.part1.Ubung_8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ubung_8 extends Application{
	
	 static String answer;
	 
	 static Pane createButton() {
			final Button btn = new Button();
			btn.setText("Klick mich");
			final FlowPane pane = new FlowPane();
			pane.setPadding (new Insets(7,7,7,7));
			pane.getChildren().add(btn);
			
			//ActionHandler registrieren
			btn.setOnAction(even->btn.setText(random()));
			
			return pane;

	 }
	
	public void start(Stage primaryStage){
		BorderPane borderPane = new BorderPane();

	
		Scene scene = new Scene(borderPane,200,200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle ("EnscheidungsKnopf");
		primaryStage.show();
		primaryStage.centerOnScreen();
		borderPane.getChildren().add(createButton());
	}
	
	
	public static String random() {
		
		String [] mögligkeit = {"Wir gehen ins Kino","Wir gehen ins Restaurant","Wir gehen Schwimmen","Wir bleiben zu Hause","Wir wandern","Wir gehen schlafen","Wir gehen ans Fussballspiel","Wir spielen Tennis","Wir fahren zu OPa und Oma"};

		int random = (int) (Math.random()*8);
		
		answer = mögligkeit [random];
		return answer;
	}
	

	public static void main(String[] args) {
		launch(args);

	}

}
