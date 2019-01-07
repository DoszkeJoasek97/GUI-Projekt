package sample.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import sample.Main;
import sample.interfaces.Viewable;

import java.io.IOException;

public class LoseView implements Viewable {

    public LoseView(){
    }

    @Override
    public Scene getScene() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/lose-view.fxml"));
        return new Scene(root, Main.Bounds.HEIGHT, Main.Bounds.WIDTH);
    }
}
