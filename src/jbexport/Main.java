package jbexport;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("jbexport.fxml"));
        primaryStage.setTitle("JB Exporter");
        primaryStage.setScene(new Scene(root, 1200, 900));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}