package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();

		l.insertion(20);
		l.insertion(10);
		l.insertion(40);
		l.insertion(50);
		l.insertion(30);
		l.insertion(12);
		l.insertion(5);
		
		l.delete(5);
		l.delete(50);
		l.delete(20);
		l.delete(6);

		
		l.travers();

//		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

	}
}
