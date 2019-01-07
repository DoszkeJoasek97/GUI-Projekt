package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.Main;
import sample.enums.ViewName;

public class GameViewController {

    @FXML
    private Button startBtn;

    @FXML
    private Button winBtn;

    @FXML
    private Button loseBtn;

    @FXML
    void onClickLoseBtn(ActionEvent event) {
        Main.getStage().setScene(Main.getSceneMap().get(ViewName.LOSE));
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
