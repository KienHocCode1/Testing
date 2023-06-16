import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.Random;

public class Player {
    private final double x;
    private final double y;
    private final Color color;
    private String title;
    private Wheel wheel1, wheel2;
    private Head head;
    private int average;
    public Player(double x, double y, Color color ) {
        this.x = x;
        this.y = y;
        this.color = color;

    }
    public Player(double x, double y, Color color, String title ) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.title = title;
    }
    public int getRanNum() {
        Random random = new Random();
        return random.nextInt(100);
    }
    public void drawPlayer(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(x+6, y+35, 60, 60);
        wheel1 = new Wheel(x, y+27);
        wheel2 = new Wheel(x+65, y+27);
        head = new Head(x+20, y);

        wheel1.drawWheel(gc);
        wheel2.drawWheel(gc);
        head.drawHead(gc);
    }
    public double drawNumber(GraphicsContext gc) {
        int random1 = getRanNum();
        int random2 = getRanNum();
        int random3 = getRanNum();

        double sum = (random1 + random2 + random3) /3;

        gc.setFont(Font.font(15));
        gc.fillText(String.valueOf(random1), x + 29, y + 70);
        gc.fillText(String.valueOf(random2), x+128 , y + 70);
        gc.fillText(String.valueOf(random3), x+230, y + 70);
        return sum;
    }
    public void drawRef(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(x+6, y+35, 60, 60);
        wheel1 = new Wheel(x, y+27);
        wheel2 = new Wheel(x+65, y+27);
        head = new Head(x+20, y);

        wheel1.drawWheel(gc);
        wheel2.drawWheel(gc);
        head.drawHead(gc);

        gc.setFont(Font.font(14));
        gc.fillText("Head " + title,x+3, y+110);
        gc.fillText(String.valueOf(100),x+25,y+70);
    }
}
