package ch.trinat.edu.javafx.decisionbutton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DecisionButton extends Application{
	
	public String zufaelligeAntwort() {
		
		String[] antwort = {"Kino", "Konzert", "Essen gehen", "Spazieren gehen", "Fernsehen", "Rheinschwimmen", "Bleiben Sie Zuhause (Alain Berset, 2020)"};
		
		int random = (int)(Math.random()*7);
		return antwort[random];
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			
			root.setMinHeight(400);
			root.setMinWidth(400);
			
			Button button = new Button("Klick mich");
			button.setOnAction(e -> button.setText(zufaelligeAntwort()));
			
			root.setCenter(button);
			
			primaryStage.setScene(new Scene(root));
			primaryStage.setTitle("Entscheidungsknopf");
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
			launch(args);	
	}
	
}
