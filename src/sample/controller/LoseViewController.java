package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.Main;
import sample.enums.ViewName;

public class LoseViewController {

    @FXML
    private Button startBtn;

    @FXML
    private Button gameBtn;

    @FXML
    private Button winBtn;

    @FXML
    void onClickGameBtn(ActionEvent event) {
        Main.getStage().setScene(Main.getSceneMap().get(ViewName.GAME));
    }

    @FXML
    void onClickStartBtn(ActionEvent event) {
        Main.getStage().setScene(Main.getSceneMap().get(ViewName.START));
    }

    @FXML
    void onClickWinBtn(ActionEvent event) {
        Main.getStage().setScene(Main.getSceneMap().get(ViewName.WIN));
    }

}
