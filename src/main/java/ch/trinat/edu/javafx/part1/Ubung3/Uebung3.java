package ch.trinat.edu.javafx.part1.Ubung3;



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
        import javafx.stage.Stage;

public class Uebung3 extends Application{


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // TODO Auto-generated method stub
        Button btn = new Button("Hello World");

        Button btn2 = new Button("Hello World");
        FlowPane pane = new FlowPane();
        pane.getChildren().add(btn);

        pane.getChildren().add(btn2);
        pane.setPadding(new Insets(7, 7, 7, 7));
        Scene scene = new Scene(pane,300,200);
        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.show();
        btn2.setOnAction(e -> {
            pane.getChildren().add(new Label("- Hello World! -"));
        });

        btn.setOnAction(new EventHandler<ActionEvent>() {


            public void handle(ActionEvent event) {
                pane.getChildren().add(new Label("- Hello World! -"));

            }



        });








    }

}
