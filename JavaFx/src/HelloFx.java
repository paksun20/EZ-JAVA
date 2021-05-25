
import javafx.application.Application;
import javafx.stage.Stage;

	public class HelloFx extends Application {
		@Override
		public void start(Stage primaryStage) throws Exception {
			primaryStage.show();  //윈도우 보여주기
		}
		
		public static void main(String[] args) {
			launch(args); //AppMain 객체 생성 및 메인 윈도우 생성
		}
	}

