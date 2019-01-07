package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.Main;
import sample.enums.ViewName;

public class StartViewController {

    @FXML
    private Button gameBtn;

    @FXML
    private Button winBtn;

    @FXML
    private Button loseBtn;

    @FXML
    void onClickGameBtn(ActionEvent event) {
        Main.getStage().setScene(Main.getSceneMap().get(ViewName.GAME));
    }

    @FXML
    void onClickLoseBtn(ActionEvent event) {
        Main.getStage().setScene(Main.getSceneMap().get(ViewName.LOSE));
    }

    @FXML
    void onClickWinBtn(ActionEvent event) {
        Main.getStage().setScene(Main.getSceneMap().get(ViewName.WIN));
    }

}
