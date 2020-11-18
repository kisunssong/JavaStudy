import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Fx_02 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		//무대는 한 번에 하나의 장면(Scene)를 가진다.
		VBox root = new VBox();
	}
	public static void main(String[] args) {
		launch(args); // start() 메서드 호출
	}
}
