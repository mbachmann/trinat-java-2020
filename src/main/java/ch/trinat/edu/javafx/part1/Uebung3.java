package ch.trinat.edu.javafx.part1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Uebung3 extends Application {

    // Uebung 1
    public void start(Stage primaryStage) {
        Label l1 = new Label("Hallo");
        Label l2 = new Label("Welt");
        VBox root = new VBox();
        root.getChildren().add(l1);
        root.getChildren().add(l2);

        Scene scene = new Scene(root, 1280, 720);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
        root.getChildren().add(createButton());
        root.getChildren().add(createButtonLambda());
    }

    public static void main(String[] args) {
        launch(args);

    }

    // Uebung 2
    Pane createButton() {
        final Button btn = new Button();
        btn.setText("Add 'Hello World' Label");
        final FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(7, 7, 7, 7));
        pane.getChildren().add(btn);// ActionHandler registrieren
        btn.setOnAction(event -> { // innere Klasse erstellt ActionHandler
            pane.getChildren().add(new Label("-Hello World! -"));
        });
        return pane;
    }

    // Uebung 3
    Pane createButtonLambda() { // Lambda Funktion erstellt ActionHandler
        final Button btn = new Button();
        btn.setText("Add 'Hello World' Label");
        final FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(7, 7, 7, 7));
        pane.getChildren().add(btn);// ActionHandler registrieren
        btn.setOnAction(event -> pane.getChildren().add(new Label("-Hello World! -")));
        return pane;
    }
}
