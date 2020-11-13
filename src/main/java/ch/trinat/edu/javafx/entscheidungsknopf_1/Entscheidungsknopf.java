package ch.trinat.edu.javafx.entscheidungsknopf_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Entscheidungsknopf extends Application{

	public String randomAnswer() {
		
		String[] answer = {"Wir gehen ins Kino", "Wir gehen ans Konzert", 
							"Wir gehen essen", "Wir gehen in den Park",
							"Wir bleiben heute zu Hause", "Wir gehen heute schwimmen"
		};
		int random = (int) (Math.random()*6);
		return answer[random];
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			root.setMinHeight(200);
			root.setMinWidth(200);
			Button button = new Button("Klick mich");
			button.setOnAction(e -> button.setText(randomAnswer()));
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
