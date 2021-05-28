/*
 * GridPane Container Layout
 * - ���� ��(Ÿ��) ũ�⸦ ���´�.
 * - ��� ���� �̷���� ���̺� ���·� ��ġ ���̾ƿ�
 */
package section04.s06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GridPaneLayout2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root2.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("GridPane Container Layout - 2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
