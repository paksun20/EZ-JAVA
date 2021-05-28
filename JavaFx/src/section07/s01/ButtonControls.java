/*
 * ��ư ��Ʈ��
 * - Button       : �⺻��ư
 * - CheckBox     : ���� üũ�ڽ����� ������ ���ð���
 * - RadioButton  : ���� ������ư���� �ϳ��� ���ð���
 * - ToggleButton : ���(On/Off) ����ġ ����
 * - Hyperlink    : ����Ʈ�� ����
 */
package section07.s01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonControls extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Button Controls Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
