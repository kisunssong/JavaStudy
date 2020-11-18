import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame18 extends JFrame {
	private JButton button;
	private JLabel label;
	
	public Frame18() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 예제");
		
		JPanel p = new JPanel();
		button = new JButton("버튼을 누르시오.");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("마침내 버튼이 눌림");
				}
			}//버튼 클릭했을때 호출
		}); //버튼 이벤트 등록하면서 메서드 인자값으로 익명클래스 문법(외부클래스명$번호.calss
		
		p.add(button);
		p.add(label);
		add(p);
		setVisible(true);
	}
}
public class Gui18 {
	public static void main(String[] args) {
		new Frame18();
	}
}
