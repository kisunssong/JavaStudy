import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
배치관리자: 컨테이너 레이아웃 안에 그림객체 즉 컴포넌트를 어떻게 배치할 것인가를 지정
하는 관리자를 말한다.
setLayout() 배치관리자 메서드로 배치관리자를 설정한다.
FlowLayout 배치관리자 클래스는 레이아웃안에 배치되는 컴포넌트를 물흐르듯 왼쪽에서부터
오른쪽으로 위에서 아래로 물흐르듯 배치한다.
*/
class Frame02 extends Frame {
	public Frame02() {
		setLayout(new FlowLayout());
// this.생략가능, add()메서드로 프레임윈도우 안에 버튼을 추가
		this.add(new Button("Button 01")); 
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));
		
		setSize(300,200); // 프레임 폭:300 높이:200
		setVisible(true); // 항상 보이게 함
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}// 프레임윈도우 닫기했을 때 호출
		}); //윈도우 이벤트(사건,일) 등록
	}
}
public class Gui02 {
	public static void main(String[] args) {
		new Frame02();
		
	}
}
