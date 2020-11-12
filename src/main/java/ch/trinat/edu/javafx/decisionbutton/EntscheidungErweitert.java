package ch.trinat.edu.javafx.decisionbutton;

import java.util.Vector;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EntscheidungErweitert extends Application{
Vector<String> answer = new Vector<String>();
	

	
	public void randomAnswerButton(Button button) {
		if(answer.size()>0) {
			int random = (int) (Math.random()*answer.size());
			button.setText(answer.get(random));
		}
		else {
			System.out.println("Keine Tat angegeben");
		}
	}
	
	public boolean evaluateentry(String entry) {
		if (!entry.isEmpty()) {
			for (int i = 0; i < answer.size(); i++) {
				if(answer.get(i).contentEquals(entry)) {
					System.out.println("Eintrag schon vorhanden");
					return false;
				}
			}
			answer.add(entry);
			return true;
		}
		else {
			System.out.println("Leerer Eintrag");
			return false;
		}
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			root.setMinHeight(200);
			root.setMinWidth(200);
			GridPane topPane = new GridPane();
			
			Label label = new Label("Tat");
			topPane.add(label, 0, 0);
			
			Button button = new Button("Klick mich");
			button.setOnAction(e -> randomAnswerButton(button));
			root.setCenter(button);
			
			TextField entry = new TextField();
			topPane.add(entry, 1, 0);
			
			Button save = new Button("save");
			save.setOnAction(e -> evaluateentry(entry.getText()));
			topPane.add(save, 2, 0);
			
			root.setTop(topPane);
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
