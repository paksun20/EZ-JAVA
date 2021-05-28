/*
 * TilePane Container Layout
 * - ��Ʈ���� ���ӵ� ������ ��ġ�ϴ� ���̾ƿ�
 * - ���ʿ��� ���������� �����ؼ� ��ġ
 * - ������ �������� ������ ������ �����ؼ� ��ġ 
 * - ������ ��(Ÿ��) ũ�⸦ ���´�.
 */
package section04.s05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TilePaneLayout extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("TilePane Container Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
