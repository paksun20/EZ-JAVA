package section01.s01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloFX extends Application {
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

		vbox.getChildren().add(label);
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setTitle("Hello JavaFX Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
