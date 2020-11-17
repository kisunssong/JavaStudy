import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//WindowListener은 전체 오버라이딩해야함
class Frame09 extends Frame implements WindowListener { //추상클래스
	
	public Frame09() {
		addWindowListener(this); //프레임 윈도우 이벤트 등록
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		dispose();
		System.exit(0);
	}//현재 프레임 윈도우 닫기했을때 호출->불필요한 추상메서드를 오버라이딩 함

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		
	} 
	
}

public class Gui09 {
	public static void main(String[] args) {
		new Frame09();
	}
}
