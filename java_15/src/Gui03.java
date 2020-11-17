import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame03 extends Frame {
	public Frame03() {
		setLayout(new BorderLayout());
/*
보더 레이아웃 배치관리자는 각 컴포넌트 위치를 동,서,남,북,중앙 지정해서 배치할 수 있다.
*/
		add(new Button("Button 01"), "North"); //프레임 북쪽에 배치
		add(new Button("Button 02"), "West"); //프레임 서쪽에 배치
		add(new Button("Button 03"), "Center"); //프레임 중앙에 배치
		add(new Button("Button 04"), "East"); //프레임 오른쪽 배치
		add(new Button("Button 05"), "South"); //프레임 남쪽, 아래쪽 배치
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}			
		});
	}
}
public class Gui03 {
	public static void main(String[] args) {
		new Frame03();
	}
}
