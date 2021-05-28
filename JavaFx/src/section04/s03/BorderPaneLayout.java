/*
 * BorderPane Container Layout
 * - top, bottom, left, right, center ������ ��ġ�ϴ� �����̳�
 * - �� �������� �ϳ��� ��Ʈ�� �Ǵ� �����̳ʸ� ��ġ�� �� �ִ�.
 */
package section04.s03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BorderPaneLayout extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("BorderPane ContainerLayout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
