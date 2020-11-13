package ch.trinat.edu.javafx.part2.Uebung_9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SlideText extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        final Parent root = FXMLLoader.load(getClass().getResource("slideTextSceneBuilder.fxml"));
        stage.setScene(new Scene(root, 460, 180));
        stage.setTitle("Uebung_9");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}