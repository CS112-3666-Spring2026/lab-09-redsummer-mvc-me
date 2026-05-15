package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainController {
    @FXML
    private ImageView logoImageView;

    @FXML
    private Label title;

    @FXML
    private Label subtitle;

    @FXML
    private Label information;

    @FXML
    private Button start;

    @FXML
    private Button quit;

    @FXML
    protected void onStartClick(ActionEvent actionEvent) throws IOException {
        Parent Map_View = FXMLLoader.load(MainApplication.class.getResource("Map_View.fxml"));
        Scene mapViewScene = new Scene(Map_View);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mapViewScene);

        window.show();
    }

    @FXML
    protected void onQuitClick() {
        Platform.exit();
    }
}