import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Exercise 14.2 from the book Introduction to Java Programming (10th).
 * <p>
 * Tic-tac-toe board.
 *
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */

public class Exercise_14_02 extends Application{
	@Override
	public void start(Stage primaryStage) {
		Image imageX = new Image("res/x.gif");
		Image imageO = new Image("res/o.gif");
		
		// create a grid pane to draw the graphics on
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		
		// add some padding around the pane
		pane.setPadding(new Insets(50, 50, 50, 50));
		
		// generate and draw random data for the board
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				int randomGraphic = (int)(Math.random() * 3);
				if (randomGraphic == 0) {
					pane.add(new ImageView(imageX), col, row);
				} else if (randomGraphic == 1) {
					pane.add(new ImageView(imageO), col, row);
				}
			}
		}
		 
		// standard JavaFX components needed to display the board
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("Exercise 14.2");
	    primaryStage.setScene(scene);
	    primaryStage.show();
		
	}
	
	public static void main(String[] args) {
	    launch(args);
	}
}
