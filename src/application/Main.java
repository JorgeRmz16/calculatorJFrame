package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("applicationKitty.css").toExternalForm());
			primaryStage.setTitle("Calculadora");
			primaryStage.getIcons().add(new Image("images/calculadora.png"));
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
