package Pizza;

import javax.application.Application;
import javax.stage.Stage;

public class Pizza extends Application {
	@Override
	public void start(Stage primaryStage) {
		PizzaApp app = new PizzaApp();
		app.startApplication(primaryStage);
		
	}		
	public static void main(String[] args) {
		launch(args);
	
	}
}