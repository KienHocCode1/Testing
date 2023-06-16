import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Head {
    private double x;
    private double y;
    public Head(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void drawHead(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillOval(x, y, 30, 30);
        gc.fillRect(x+10, y+27, 10, 10);
    }
}
