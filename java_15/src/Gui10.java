import javax.swing.JFrame;

//스읭 프레임윈도우 창 만들기
class Frame10 extends JFrame {
	
	public Frame10() {
		super("스윙 프레임 윈도우"); //스읭(swing)프레임윈도우 제목 설정
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스읭프레임닫기
	}
}
public class Gui10 {
	public static void main(String[] args) {
		new Frame10();
	}
}
