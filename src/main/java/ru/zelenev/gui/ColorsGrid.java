package ru.zelenev.gui;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class ColorsGrid extends GridPane {

    private static final int ROWS = 10;
    private static final int COLS = 10;
    private static final int TILE_SIZE = 25;

    public ColorsGrid() {
        super();
        initRandomColors();
    }

    private void initRandomColors() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                Rectangle tile = new Rectangle(TILE_SIZE, TILE_SIZE, getRandomColor());
                this.add(tile, col, row);
            }
        }
    }

    private Color getRandomColor() {
        Random random = new Random();
        return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}
