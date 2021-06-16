/*
 * CSS(Cascading Style Sheets) ĳ�����̵� ��Ÿ�� ��Ʈ
 */
package section10.s01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StyleSheets extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		
		primaryStage.setTitle("Cascading Style Sheets Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
