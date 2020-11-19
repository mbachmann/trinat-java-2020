package ch.trinat.edu.javafx.decisionbutton.Aufgabe2;
import java.util.Random;
import java.util.Vector;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text; 

public class Aufgabe extends Application{
	Button btnAdd = new Button();
	Button display = new Button();
	Scene sceneOne;
	Stage window;
	static String buttonLabel = "save";
	static String buttonLabel2 = "Click mich";
	Vector <String> liste = new Vector <String>();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		
		Text text1 = new Text();  
		text1.setText("Tat:   ");
	
		
		//create buttons
		btnAdd.setText(buttonLabel);
		display.setText(buttonLabel2);
		display.setStyle("-fx-font: 35 arial;");
		

		//create the window grid
		GridPane gridOne = new GridPane();
		GridPane gridTwo = new GridPane();
		gridOne.setPadding(new Insets(10, 10, 10, 10));
		gridOne.setVgap(10);

		//Set textfield
		TextField text = new TextField();

		//create the scene and display the window
		VBox vBox = new VBox();
		vBox.getChildren().addAll(gridOne, gridTwo);
		sceneOne = new Scene(vBox, 400, 250);
		window.setScene(sceneOne);
		window.show();
		
		
		
		//set where the buttons will be located in the grid
	
		gridOne.add(text, 1, 0);
		gridOne.add(btnAdd, 2, 0);
		gridOne.add(text1, 0, 0);
	    gridOne.setAlignment(Pos.TOP_CENTER);
		gridTwo.add(display, 0, 0);
		gridTwo.setAlignment(Pos.CENTER);
		display.setPrefSize(sceneOne.getWidth(), sceneOne.getHeight());
		
		
	
		

		//set button actions
		btnAdd.setOnAction(e -> {
			list(text.getText());
			text.clear();
		});//end action btnAdd	

		//set button actions
		display.setOnAction(z -> {
			display.setText(random());
		});//end action btnAdd	

	}

	public void list(String word) {
		if (word.isEmpty() || liste.contains(word)) {;}
		else {liste.add(word);
		System.out.print(liste);
		System.out.print(liste.toString());
		System.out.println(" '" + word + " '");	
		}
	}

	public String random() {
		buttonLabel2 = "nichts eingegeben";
		if (liste.size() > 0) {
		int index = new Random().nextInt(liste.size());
		String randomWord = liste.get(index);
		buttonLabel2 = randomWord;}
		return buttonLabel2;
		
	}



}