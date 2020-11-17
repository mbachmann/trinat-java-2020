package ch.trinat.edu.javafx.part2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProgressThreadExample extends Application{

	public static void main(String[] args) {
		 launch(args);
		 }
		 public void start(Stage primaryStage) {
		 System.out.println("start: thread = " + Thread.currentThread().getName());
		 primaryStage.setTitle("JavaFX App");
		 ProgressBar bar = new ProgressBar(0);
		 final Label info = new Label();
		 VBox vBox = new VBox(bar, info);
		 Scene scene = new Scene(vBox, 500, 200);
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 Thread taskThread = new Thread(new Runnable() {
		 @Override
		 public void run() {
		 double progress = 0;
		 for (int i = 0; i < 10; i++) {
		 try {
		 Thread.sleep(500);
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }
		 progress += 0.1;
		final double reportedProgress = progress;
		 Platform.runLater(new Runnable() {
		 @Override
		public void run() {
		 bar.setProgress(reportedProgress);
		 info.setText("Progress: " +
		 String.format("%.1g%n",reportedProgress));
		 }
		 });
		 }
		 }
		 });
		 taskThread.start();
		 }
}
