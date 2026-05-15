package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class EventController {

    protected void initData(String location, RevisedHistoricalEvent historicalEvent) {
        this.location = location;
        this.Red_SummerEvent = historicalEvent;
        city.setText(this.location);
        date.setText(this.Red_SummerEvent.getEventDay().toString());
        description.setText(this.Red_SummerEvent.getDescription());
        revisedDescription.setText(this.Red_SummerEvent.getRevisedDescription());
    }

    @FXML
    protected void onCloseButtonClick(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    private RevisedHistoricalEvent Red_SummerEvent;
    private String location;

    @FXML
    private ImageView EventImageView;

    @FXML
    private Button CloseButton;

    @FXML
    private Label city;

    @FXML
    private Label date;

    @FXML
    private Label description;

    @FXML
    private Label revisedDescription;
}
