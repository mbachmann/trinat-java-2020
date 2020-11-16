package ch.trinat.mohlertanja.abgabe.javafx1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class EntscheidungsKnopf extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			VBox root = new VBox();
			Scene scene = new Scene(root, 400, 100, Color.AZURE);
			root.setPadding(new Insets(10));
			
			root.getChildren().add(createButton());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Was machen wir heute Abend?");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	Pane createButton() {
		final Button button = new Button();
		button.setText("Klick mich");
		
		final BorderPane pane = new BorderPane();
		BorderPane.setAlignment(button, Pos.CENTER);
	    BorderPane.setMargin(button, new Insets(12,12,12,12));
		pane.setCenter(button);
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				button.setText(randomAnswer());
			}
		});
				
		return pane;
	}
	
public String randomAnswer() {
		String[] todaysPlan = {	"Wir gehen ins Kino", "Wir gehen an ein Konzert", "Wir gehen essen", "Wir gehen spazieren", "Wir sehen uns einen Film an", "Wir gamen", "Wir gehen tanzen"};
		int random = (int) (Math.random()*7);
		return todaysPlan[random];
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
