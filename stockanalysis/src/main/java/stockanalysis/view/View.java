package stockanalysis.view;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.MenuBar;

public class View {
	public View(Stage stage) {
		BorderPane rootLayout = new BorderPane();

		Canvas canvas = new Canvas(800, 800);
		MenuBar menuBar = new MenuBar();

		rootLayout.setTop(menuBar);
		rootLayout.setCenter(canvas);
		Scene scene = new Scene(rootLayout, 900, 900);
		stage.setScene(scene);
		stage.setTitle("Stock Analysis Application");
		stage.show();
	}
}
