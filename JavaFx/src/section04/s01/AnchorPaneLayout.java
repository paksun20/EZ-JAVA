package section04.s01;

	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.fxml.FXML;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.stage.Stage;

	public class AnchorPaneLayout extends Application {
		@Override
		public void start(Stage primaryStage) throws Exception {
			Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setTitle("AppMain");
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}