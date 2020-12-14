package ch.trinat.edu.javafx.EntscheidungsKnopf;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

public class EntscheidungsKnopf extends Application {

    Button button1;
    Random r = new Random();

    @Override
    public void start(Stage primaryStage) {

        button1 = new Button("Klick mich!");
        button1.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        Scene scene = new Scene(button1, 300, 100);

        // ActionHandler registrieren
        button1.setOnAction(e -> button1.setText(randomEvent()));

        DropShadow shadow = new DropShadow();
        button1.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> button1.setEffect(shadow));

        primaryStage.setScene(scene);
        primaryStage.setTitle("Random Knopf");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public String randomEvent() {
        String[] events = {"Kimchi", "Pannkuchen", "Spagetti", "Fondue", "Steak", "Suhshi", "Meatballs", "Salat",
                "Wellington", "Lasagne"};
        return events[r.nextInt(10)];
    }
}

