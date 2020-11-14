package ch.trinat.edu.javafx.part1.Ubung_6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ubung_6 extends Application implements EventHandler<ActionEvent> {

	public void start (Stage primaryStage) {
		try {
			//create MenuBar
			MenuBar menuBar = new MenuBar();

			//create Menus
			Menu fileMenu = new Menu ("File");
			Menu editMenu = new Menu ("Edit");
			Menu helpMenu = new Menu ("Help");

			//Create MenuItems
			MenuItem newItem = new MenuItem ("New"); 
			newItem.setOnAction(this);

			MenuItem openFileItem = new MenuItem("Open File");
			MenuItem exitItem = new MenuItem("Exit");

			//Set an accelerator for Exit MenuItem
			exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+x"));

			//When User click on the exitItem, use anonymous inner class
			exitItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					System.exit(0);	
				}	
			});
			
			MenuItem copyItem= new MenuItem("Copy");
			MenuItem pasteItem= new MenuItem("Paste");
			
			// Add menuItems to the Menus
			fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
			editMenu.getItems().addAll(copyItem, pasteItem);
			
			// RadioMenuItemRadio
			RadioMenuItem updateItem1= new RadioMenuItem("Auto Update");
			RadioMenuItem updateItem2= new RadioMenuItem("Ask for Update");
			
			ToggleGroup group= new ToggleGroup();
			updateItem1.setToggleGroup(group);
			updateItem2.setToggleGroup(group);
			updateItem1.setSelected(true);
			helpMenu.getItems().addAll(updateItem1,updateItem2);
			
			// Add Menus to the MenuBar
			menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
			BorderPane root= new BorderPane();
			root.setTop(menuBar);
			Scene scene= new Scene(root, 350, 200);
			primaryStage.setTitle("JavaFX Menu");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		}	

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
