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
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StageScene2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();		// �����̳�(��ƼĮ)
		hbox.setPrefWidth(400);		// ��
		hbox.setPrefHeight(200);	// ����
		// hbox.setAlignment(Pos.CENTER);	// ����(��ġ:����,���, ������, ..)
		// hbox.setAlignment(Pos.TOP_LEFT);
		// hbox.setAlignment(Pos.BASELINE_CENTER);
		// hbox.setAlignment(Pos.CENTER_RIGHT);
		hbox.setAlignment(Pos.CENTER_LEFT);
		hbox.setSpacing(20);
		
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("�����ư");
		button.setOnAction(event->Platform.exit());  // �̺�Ʈ

		hbox.getChildren().add(label);
		hbox.getChildren().add(button);
		
		Scene scene = new Scene(hbox);
		
		primaryStage.setTitle("Stage & Scene Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
