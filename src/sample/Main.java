package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.enums.ViewName;
import sample.view.GameView;
import sample.view.LoseView;
import sample.view.StartView;
import sample.view.WinView;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Main extends Application {


    public static class Bounds{
        public static final int HEIGHT = 600;
        public static final int WIDTH = 400;
    }

    //statyczne, by dostawac dostep z kontrolerów widoków
    private static Map<ViewName, Scene> sceneMap = new TreeMap<>();

    private static Stage primaryStage;

    public static Stage getStage(){
        return primaryStage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.primaryStage = primaryStage;

        //poszczególne odsłony (sceny) są w mapie pod kluczami z typu wyliczeniowego ViewName
        primaryStage.setTitle("How To Crash Your Rocket 1");

        Parent root = FXMLLoader.load(getClass().getResource("/start-view.fxml"));

        initSceneMap();

        primaryStage.setScene(sceneMap.get(ViewName.START));
        primaryStage.show();
    }

    public static Map<ViewName, Scene> getSceneMap() {
        return sceneMap;
    }

    public static void initSceneMap() throws IOException {
        sceneMap.put(ViewName.START, new StartView().getScene());
        sceneMap.put(ViewName.GAME, new GameView().getScene());
        sceneMap.put(ViewName.LOSE, new LoseView().getScene());
        sceneMap.put(ViewName.WIN, new WinView().getScene());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
