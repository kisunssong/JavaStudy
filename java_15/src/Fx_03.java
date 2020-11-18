import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fx_03 extends Application {

	public void start(Stage primaryStage) throws Exception {

	Parent root=FXMLLoader.load(getClass().getResource("root.xml"));
	//getClass()현재 클래스, root.xml파일을 로드한다.
	Scene scene=new Scene(root);//장면을 설정
	primaryStage.setTitle("FXML 레이아웃");
	primaryStage.setScene(scene);//무대위에 장면설정
	primaryStage.show();//윈도우 표시
	}
	public static void main(String[] args) {
      launch(args);
	}
}
