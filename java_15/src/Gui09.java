import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//WindowListener�� ��ü �������̵��ؾ���
class Frame09 extends Frame implements WindowListener { //�߻�Ŭ����
	
	public Frame09() {
		addWindowListener(this); //������ ������ �̺�Ʈ ���
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
	}//���� ������ ������ �ݱ������� ȣ��->���ʿ��� �߻�޼��带 �������̵� ��

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
