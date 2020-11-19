package ch.trinat.edu.javafx.decisionbutton.Aufgabe1;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Aufgabe extends Application{

	Button btnAdd = new Button();
	Button btnAdd2 = new Button();
	Scene sceneOne;
	Stage window;
	static String buttonLabel;
	int size = 500;

	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		//create buttons
		btnAdd.setText("klick mich");
		btnAdd.setStyle("-fx-font: 35 arial;");



		//create the scene and display the window
		sceneOne = new Scene(btnAdd, size, size);
		window.setScene(sceneOne);
		window.show();
		primaryStage.setTitle("Entscheidungsknopf");
		
		

		//set button actions
		btnAdd.setOnAction(e -> {
			btnAdd.setText(random());
		});	
	}
	
	

	public String random() {
		String words = "Kino:Essen gehen:Konzert:Zum Jahrmarkt gehen:Zu Hause bleiben:Haris eine gute Note geben";
		String[] wordsAsArray = words.split(":");
		int index = new Random().nextInt(wordsAsArray.length);
		String randomWord = wordsAsArray[index];
		buttonLabel = randomWord;
		return buttonLabel;

	}

}