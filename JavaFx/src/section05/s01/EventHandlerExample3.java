/*
 * �̺�Ʈ ó��
 * - �̺�Ʈ �ڵ鷯(Event Handler)
 */
package section05.s01;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class EventHandlerExample3 extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPrefSize(200,50);
		root.setAlignment(Pos.TOP_CENTER);
		root.setSpacing(20);
		
		Button btnOk = new Button("Ok");
		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("[Ok ��ư Ŭ��]");
				EventType<?> et = event.getEventType(); 
				System.out.println("EventType: " + et.getName());
			}
		});
		
		Button btnCancel = new Button("Cancel");
		// btnCancel.setOnAction(event -> System.out.println("[Cancel ��ư Ŭ��]"));
		btnCancel.setOnAction(event -> {
			EventType<?> et = event.getEventType(); 
			System.out.println("[Cancel ��ư Ŭ��]");	
			System.out.println("EventType: " + et.getName());
		});

		Button btnExit = new Button("Exit");
		btnExit.setOnAction(event -> Platform.exit());

		// root.getChildren().addAll(btnOk, btnCancel);
		root.getChildren().add(btnOk);
		root.getChildren().add(btnCancel);
		root.getChildren().add(btnExit);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Event Handler Demo");
		primaryStage.setScene(scene);
		
		// primaryStage.setOnCloseRequest(event -> System.out.println("����"));
		primaryStage.setOnCloseRequest((WindowEvent event) -> {
			System.out.println("[����]");
			EventType<?> et = event.getEventType(); 
			System.out.println("EventType: " + et.getName());
		});
		
		primaryStage.show();
	}
}