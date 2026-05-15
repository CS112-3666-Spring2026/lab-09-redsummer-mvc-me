package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MapController {

    private void openPopupWindow(String location, RevisedHistoricalEvent rhEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("Event-View.fxml"));
        Parent eventViewParent = loader.load();

        EventController eventController = loader.getController();
        eventController.initData(location, rhEvent);

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL);

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();
    }
    @FXML
    protected void onSanFranciscoCaliforniaButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("Event-View.fxml"));
        Parent eventViewParent = loader.load();

        EventController eventController = loader.getController();
        eventController.initData("San Francisco, CA", new RevisedHistoricalEvent("A minor riot between Black and white soldiers occurred in the Presidio in San Francisco",
                new Date(5, 15, 1919),
                "By correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong. Here is the revised history: minor riot between Black and white soldiers occurred in the Presidio in San Francisco after a dispute about a Thai soldier who was moved from the “colored quarters” to the white military housing. Despite defending our country, housing for Black soldiers was not only segregated but often inferior. Black soldiers also faced increased attacks and other forms of discrimination upon returning home.",
                "https://cdr.lib.unc.edu/downloads/1c18dn56n?locale=en"));

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL);

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();
    }

    @FXML
    protected void onBisbeeArizonaButtonClick() throws IOException {
        RevisedHistoricalEvent bisbee = new RevisedHistoricalEvent(
                "Local police in Bisbee, Arizona attacked the 10th U.S. Cavalry, an African-American unit known as the \"Buffalo Soldiers,\" formed in 1866.",
                new Date(7, 13, 1919),
                "Although sources are limited, the attack occurred on the eve of celebrations meant to honor returning soldiers (like in Norfolk, Virginia).",
                "https://cdr.lib.unc.edu/downloads/1c18dn56n?locale=en");
        this.openPopupWindow("Bisbee, AZ", bisbee);

    }
}
