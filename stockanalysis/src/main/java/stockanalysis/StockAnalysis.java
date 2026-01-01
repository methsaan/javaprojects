package stockanalysis;

import javafx.application.Application;
import stockanalysis.view.View;
import javafx.stage.Stage;

public class StockAnalysis extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage stage) {
		new View(stage);
	}
}
