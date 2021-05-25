package section04.s02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

	public class BoxContainerLayout extends Application {
		@Override
		public void start(Stage primaryStage) throws Exception {
			VBox root = (VBox)FXMLLoader.load(
				getClass().getResource("root.fxml")
			);
			Scene scene = new Scene(root);
			
			primaryStage.setTitle("BoxContainerLayout");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}