package ch.trinat.edu.javafx.part2.Selbstandig;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Selbstandig extends Application{
	
	 Boolean inOrdnung = false;
	 Boolean autorisation = false;
	 int random;
	 String answer;
	 TextField  textField = new TextField();
	 BorderPane borderPane = new BorderPane();
	 Button btn = new Button("Save");
	 Button button = new Button("Klick mich");
	 //ObservableList<String> entries= FXCollections.observableArrayList ();
	List<String> entries = new ArrayList<String>();;
	
	public void start(Stage primaryStage) throws Exception{
		

		btn.setOnAction(event->{
			add();
			System.out.println(entries);
		});
	
		button.setOnAction(event->{
			wahl();	
		});
		
		
		HBox hbox =new HBox (textField,btn,button);
		VBox vbox = new VBox(hbox);
		Scene scene = new Scene(vbox,400,100);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.centerOnScreen();
		
	
	}
	
	public  void wahl(){//Gibt eine random Antwort und setzt diese auf den Button
		
		random = (int) (Math.random()*(entries.size()));
		answer = entries.get(random);
		button.setText(answer);
	}
	
	public void add() {
		
		if (textField.getText().equals("")) { //Ist ewtas im Textfeld geschrieben?
			System.out.println("Sie müssen etwas im Textfeld einschreiben");
			inOrdnung = false;
		}
		

		else if (entries.contains(textField.getText())){//Ist was geschrieben ist schone indie Liste?
				System.out.println("Sie haben schon diese Möglichkeit eingegeben");
				textField.clear();
				inOrdnung = false;
		}
		else {
			inOrdnung = true;// Ohne diese esle{}; wenn inOrdnung einmal gleich false
							 //gesetzt ist dann kann man kein Einträge mehr machen
		}
		
		if(inOrdnung == true){// Wenn die Eingaben richtig sind, dann sind sie an die Liste addiert
			
			entries.add(textField.getText());
			textField.clear();
	
		}
	
	}
	
	
	

	public static void main(String[] args) {
		launch(args);

	}

}
