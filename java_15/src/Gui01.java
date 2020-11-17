/*
java.awt 패키지내의 api클래스를 임포트 하면 자바언어로 그림을 그릴 수 있다.
*/

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame01 extends Frame { //awt의 Frame윈도우를 상속받아서 윈도우창을 만든다.
	public Frame01() {
		super("awt window"); //조상클래스 오버로딩된 생성자 호출해서 프레임윈도우
		//제목을 설정
		this.setSize(300,200); //프레임윈도우 폭:300 높이:200
		setVisible(true); //프레임윈도우를 항상나오게 한다.
		
		//WindowAdapter: 어댑터 추상클래스로 프레임윈도우 이벤트 처리 담당한다.	
		addWindowListener (new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose(); //자원해제, 프레임윈도우 닫기
				System.exit(0);
			}
		
			
		}//내부 무명클래스로 닫기 이벤트 처리: 외부클래스명$번호.class로 컴파일된다
		//Frame02$1.class(이름없는 익명클래스 문법으로 주로 자바GUI에서 이벤트
		//사건 처리 목적으로 사용됨
		);//이벤트 등록메서드
	}
}

public class Gui01 {
	public static void main(String[] args) {
		new Frame01();
	}
}
