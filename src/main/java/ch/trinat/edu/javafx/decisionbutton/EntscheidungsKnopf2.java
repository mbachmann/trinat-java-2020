package ch.trinat.edu.javafx.decisionbutton;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class EntscheidungsKnopf2 extends Application{

	public void start(Stage primaryStage) {	
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.TOP_CENTER);
		hbox.setPrefWidth(200);
		hbox.setPrefHeight(80);

		VBox vbox = new VBox();
		vbox.setAlignment(Pos.CENTER);

		final ObservableList<String> answer = FXCollections.observableArrayList();
		Label label2 = new Label("Mögliche Aktivitäten:     ");
		Label label1 = new Label("Was machen wir heute Abend?");
		final TextField textfield = new TextField();
		final Button saveBtn = new Button("Speichern");
		final Button randomBtn = new Button("Klick mich!");

		saveBtn.setOnAction(event-> {
			answer.add(textfield.getText());
			textfield.setText("");
		});

		randomBtn.setOnAction(event-> randomBtn.setText(randomAnswer(answer)));

		hbox.getChildren().add(label2);
		hbox.getChildren().add(textfield);
		textfield.setPrefWidth(400);
		hbox.getChildren().add(saveBtn);

		vbox.getChildren().add(label1);		
		randomBtn.setMinWidth(200);
		randomBtn.setMinHeight(80);
		vbox.getChildren().add(randomBtn);

		StackPane stackpane = new StackPane(hbox, vbox);

		Scene scene = new Scene(stackpane, 700, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Entscheidungsknopf");
		primaryStage.show();
	}

	public String randomAnswer(ObservableList<String> answer) {
		Random randomNumber = new Random();
		int randomInt;

		randomInt = randomNumber.nextInt(answer.size());

		return answer.get(randomInt);
	}

	public static void main(String[] args) {	
		launch(args);
	}

}

