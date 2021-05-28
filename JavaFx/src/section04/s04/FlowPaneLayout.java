/*
 * FlowPane Container Layout
 * - ��Ʈ���� ���ӵ� ������ ��ġ�ϴ� ���̾ƿ�
 * - ���ʿ��� ���������� �����ؼ� ��ġ
 * - ������ �������� ������ ������ �����ؼ� ��ġ 
 */
package section04.s04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FlowPaneLayout extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("FlowPane Container Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
