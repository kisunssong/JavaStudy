import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fx_03 extends Application {

	public void start(Stage primaryStage) throws Exception {

	Parent root=FXMLLoader.load(getClass().getResource("root.xml"));
	//getClass()���� Ŭ����, root.xml������ �ε��Ѵ�.
	Scene scene=new Scene(root);//����� ����
	primaryStage.setTitle("FXML ���̾ƿ�");
	primaryStage.setScene(scene);//�������� ��鼳��
	primaryStage.show();//������ ǥ��
	}
	public static void main(String[] args) {
      launch(args);
	}
}
