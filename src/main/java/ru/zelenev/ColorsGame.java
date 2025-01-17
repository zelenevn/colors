package ru.zelenev;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.zelenev.gui.ColorsGrid;

public class ColorsGame extends Application {

    private static final String GAME_TITLE = "Перекраска";

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        ColorsGrid grid = new ColorsGrid();
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle(GAME_TITLE);
        stage.show();
    }
}