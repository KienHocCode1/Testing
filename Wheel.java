import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Wheel {
    private double x;
    private double y;
    public Wheel(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void drawWheel(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillOval(x, y, 7, 70);
    }
}
