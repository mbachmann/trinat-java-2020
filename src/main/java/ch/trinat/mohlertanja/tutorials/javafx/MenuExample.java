package ch.trinat.mohlertanja.tutorials.javafx;

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

public class MenuExample extends Application {
	public void start(Stage primaryStage) {
		try {
			MenuBar menuBar = new MenuBar();

			Menu fileMenu = new Menu("File");
			Menu editMenu = new Menu("Edit");
			Menu helpMenu = new Menu("Help");

			MenuItem newItem = new MenuItem("New");
			newItem.getOnAction();

			MenuItem openFileItem = new MenuItem("Open File");
			MenuItem exitItem = new MenuItem("Exit");

			exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));

			exitItem.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					System.exit(0);
				}
			});
			MenuItem copyItem = new MenuItem("Copy");
			MenuItem pasteItem = new MenuItem("Paste");

			fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
			editMenu.getItems().addAll(copyItem, pasteItem);

			RadioMenuItem updateItem1 = new RadioMenuItem("Auto Update");
			RadioMenuItem updateItem2 = new RadioMenuItem("Ask for Updates");

			ToggleGroup group = new ToggleGroup();
			updateItem1.setToggleGroup(group);
			updateItem2.setToggleGroup(group);
			updateItem1.setSelected(true);
			helpMenu.getItems().addAll(updateItem1, updateItem2);

			menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

			BorderPane root = new BorderPane();
			root.setTop(menuBar);
			Scene scene = new Scene(root, 350, 200);

			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}
