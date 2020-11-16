package ch.trinat.edu.javafx.part1;

import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AufgabeFX1 extends Application {

	
	Stage fenster;
	Scene szene;
	Button buttonRandom , buttonExit;
	
	int x = 0 ; 

	public void start(Stage primaryStage) {
		try {

			fenster = primaryStage;
			fenster.setTitle("                                          Entscheidungsknopf");

            
			
			VBox layout = new VBox();
			
			layout.setPrefWidth(220); // initialise taile optimale du bouton
			layout.setPrefHeight(65);
			
			
			buttonRandom = new Button("START");
           
            buttonRandom.setMinWidth(layout.getPrefWidth());  // donne la taille du bouton 
            buttonRandom.setMinHeight(layout.getPrefHeight()); 
            
            buttonRandom.setTranslateX(155);  // positionne le bouton 
            buttonRandom.setTranslateY(80);
            
            Font f= new Font("Arial" , 28);  // permet de modifier la taille du texte dans le boutton 
            buttonRandom.setFont(f);
            
			buttonExit = new Button("EXIT"); // initialise buttonExit pour quitter interface 
			
			buttonExit.setTranslateX(460);  // positionne le bouton Exit  
			buttonExit.setTranslateY(159);

			
			buttonRandom.setStyle("-fx-background-color: pink");   // initialse la couleur du bouton 
			buttonExit.setStyle("-fx-background-color: red");
			
			
			szene = new Scene(layout, 500, 250);
			
			layout.getChildren().addAll(buttonRandom, buttonExit);
			primaryStage.setScene(szene);
			primaryStage.show();

			
			buttonRandom.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent event) {
				
					do {
					buttonRandom.setText(text());
					fenster.show();
					x++ ; 
					}while(x < x++) ;

				}

			});
			
			
			buttonExit.setOnAction(new EventHandler<ActionEvent>() {    // met en action le boutton pour quitter interface 
				
				@Override
			 public void handle(ActionEvent event) {
			 System.exit(0);
			 }
			});
            
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*public String texte() {
		
		
	try {
		
		String file = "src\\ErsteProgrammen\\random.txt";
		FileReader f = new FileReader(file);
		char[] c = new char[8000];
		f.read(c);
		String s = new String(c);
		String[] result;
		result = s.split(";|\n");
		
		for (int i = 0 ; i < result.length ; i = i + 1) {
			String tmp = result[i]; 
		}
		
	
		
	}catch (IOException e) {
		System.err.println("Fehler beim Einlese der Datei.");
		System.err.println(e.getMessage());
	}
	
	
	return null;
	}
	*/
	
   public static int Zufall() {
		int zufall ; 
		zufall = (int) (Math.random() * 10) ;
		
		return zufall;
		
	}
	

	public String text() {

		
		String [] name = new String[10];
		
		name[0] = "Ins Kino gehen"; 
		name[1] = "Essen gehen";
		name[2] = "Trinken gehen"; 
		name[3] = "Im Park gehen"; 
		name[4] = "Bus fahren"; 
		name[5] = "Auto fahren"; 
		name[6] = "Party gehen"; 
		name[7] = "Netflix"; 
		name[8] = "Velo fahren"; 
		name[9] = "Tanzen gehen"; 
		
		

		return name[Zufall()];

	}

	public static void main(String[] args) {
			launch(args);
	}

}

