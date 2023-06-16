import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Team {
    private double x;
    private double y;
    private String name;
    private Color color;
    private Player player1, player2, player3, player4;
    public Team(String name, double x, double y, Color color) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public String getRandomName() {
        Random names = new Random();
        int name = names.nextInt(3);
        if (name == 0) {
            return "Real Madrid";
        } else if (name == 1) {
            return "Barcelona";
        } else {
            return "Arsenal";
        }
    }
    public Color getRandomColor() {
        String testing = getRandomName();
        if (testing.equals("Real Madrid")) {
            return Color.GREEN;
        } else if (testing.equals("Barcelona")) {
            return Color.ROYALBLUE;
        } else {
            return Color.SADDLEBROWN;
        }
    }
    public void drawTeam(GraphicsContext gc) {
        player1 = new Player(x, y, color);
        player2 = new Player(x + 100, y, color);
        player3 = new Player(x + 200, y, color);

        player1.drawPlayer(gc);
        player2.drawPlayer(gc);
        player3.drawPlayer(gc);

        double sum = player1.drawNumber(gc);
        gc.fillText(name + " (team average " + sum + ")", x + 15, y + 115);
    }

    public void drawRef(GraphicsContext gc) {
        player4 = new Player(x, y, getRandomColor(), getRandomName());
        player4.drawRef(gc);
    }
}
