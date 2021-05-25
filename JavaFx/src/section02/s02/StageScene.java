/*
 * --module-path ${PATH_TO_JAVAFX} --add-modules=javafx.controls
 */
package section02.s02;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StageScene extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox();		// �����̳�(��ƼĮ)
		vbox.setPrefWidth(400);		// ��
		vbox.setPrefHeight(200);	// ����
		vbox.setAlignment(Pos.CENTER);	// ����(��ġ:����,���, ������, ..)
		vbox.setSpacing(20);
		
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("�����ư");
		button.setOnAction(event->Platform.exit());  // �̺�Ʈ

		vbox.getChildren().add(label);
		vbox.getChildren().add(button);
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setTitle("Stage & Scene Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
