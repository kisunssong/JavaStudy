import javafx.application.Application;
import javafx.stage.Stage;

public class Fx01 extends Application {
//Java FX UI를 그리기 위해서는 Application 추상클래스로 부터 상속
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Stage는 연극 무대,throws Exception 예외처리
		primaryStage.show();//FX 윈도우 창 보여주기
	}
	public static void main(String[] args) {
     launch(args);//메인 프로그램을 생성하고 윈도우를 생성하기  위해서 start()
     //메서드를 호출
     /*
      * JAVA FX는 윈도우 무대를 Stage로 표현
      */
	}
}