package sample.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import sample.Main;
import sample.interfaces.Viewable;

import java.io.IOException;

public class WinView implements Viewable {

    public WinView(){
    }

    @Override
    public Scene getScene() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/win-view.fxml"));
        return new Scene(root, Main.Bounds.HEIGHT, Main.Bounds.WIDTH);
    }
}
