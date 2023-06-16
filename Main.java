//package week1code;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author YOUR NAME
 */
public class Main extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(800, 800); // Set canvas Size in Pixels
        stage.setTitle("Robot Olympics"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE
        Team a1 = new Team("Real Madrid", 100, 100, Color.GREEN);
        Team a2 = new Team("Barcelona", 100, 250, Color.ROYALBLUE);
        Team a3 = new Team("Arsenal", 100, 400, Color.SADDLEBROWN);
        Team a4 = new Team("", 600, 250, Color.GREEN);

        a1.drawTeam(gc);
        a2.drawTeam(gc);
        a3.drawTeam(gc);
        a4.drawRef(gc);

        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
