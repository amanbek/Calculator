package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	private static final String PATH_TO_ICON = "file:calc_icon.png";

	@ Override
	public void start (Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load (getClass ().getResource ("/application/scene.fxml"));

			Scene scene = new Scene (root, 400, 400);

			primaryStage.getIcons ()
						.add (new Image (PATH_TO_ICON));
			scene   .getStylesheets ()
					.add (getClass ()   .getResource ("application.css")
										.toExternalForm ());
			primaryStage.setTitle ("Calculator");
			primaryStage.setScene (scene);
			primaryStage.show ();

		} catch (Exception e) {
			e.printStackTrace ();
		}
	}

	public static void main (String [] args) {
		launch (args);
	}
}
