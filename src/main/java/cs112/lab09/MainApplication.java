package cs112.lab09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
  //      FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Map_View.fxml"));
  //      Scene scene = new Scene(fxmlLoader.load(), 700, 465);
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("start-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
  //      FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Event-View.fxml"));
  //      Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}