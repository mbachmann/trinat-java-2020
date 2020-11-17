package ch.trinat.edu.javafx.part2.fxml;

import ch.trinat.edu.javafx.part2.mvvm.presentation.StudentView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //create a root and load fxml code
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        final Parent root = loader.load();

        // get the LoginController
        LoginController loginController = (LoginController) loader.getController();

        stage.setScene(new Scene(root, 460, 180));
        // Load CSS
        // stage.getScene().getStylesheets().add(getClass().getResource("login.css").toExternalForm());

        stage.setTitle("FXML Demo");
        stage.show();
    }

    public static void main(final String[] args)
    {
        launch(args);
    }
}
