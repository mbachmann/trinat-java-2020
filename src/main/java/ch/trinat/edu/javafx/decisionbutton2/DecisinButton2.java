package ch.trinat.edu.javafx.decisionbutton2;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class DecisinButton2 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("ListView Experiment 1");
		final String[] names = { "Micha", "Andi", "Andy", "Tom", "Matze" };
		final ObservableList<String> entries = FXCollections.observableArrayList (names);
		final ListView<String> listView = new ListView<>(entries);
		final SelectionModel<String> selectionModel = listView.getSelectionModel();
		
		Button readButton = new Button("In Konsole Auslesen");
		Button addButton = new Button("Neu");
		TextField textField = new TextField();
		Button removeButton = new Button("Entfernen");
		HBox hbox = new HBox(addButton, textField, removeButton);
		removeButton.disableProperty().bind(
				Bindings.isNull(selectionModel.selectedItemProperty()));
		addButton.setOnAction(evt -> {
			entries.add(textField.getText());
		});
		readButton.setOnAction(event -> {
			System.out.println("o = " +
					selectionModel.selectedItemProperty().getValue());
		});
		removeButton.setOnAction(event -> {
			String selectedValue = selectionModel.selectedItemProperty(). getValue();
			entries.remove(selectedValue);
		});
		VBox vBox = new VBox(hbox, listView, readButton);
		Scene scene = new Scene(vBox, 300, 280);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}