package pl.am.projects.snake;

import java.awt.*;

public class Board {
    public static final int FIELD_X = 20;
    public static final int FIELD_Y = 20;
    public static final int SIZE = 30;
    public static final int MAX_X = FIELD_X * SIZE;
    public static final int MAX_Y = FIELD_Y * SIZE;

    public static void draw(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, MAX_X, MAX_Y);
    }
}
