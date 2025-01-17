package ru.zelenev.domain;

public class GameField {

    private byte[][] field;

    public GameField(byte rows, byte cols) {
        this.field = new byte[rows][cols];
        initGameField(rows, cols);
    }

    public void color() {

    }

    private void initGameField(byte rows, byte cols) {
        for (byte i = 0; i < rows; i++) {
            for (byte j = 0; j < cols; j++) {
                this.field[i][j] = 0;
            }
        }
    }
}
