import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame17 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;

	public Frame17() {
		this.setSize(300,200); //this. 프레임 내자신을 뜻함. 생략가능함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 예제"); //스읭 프레임윈도우 제목을 설정

		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 클릭 안되었군요.");
		button.addActionListener(this); //버튼 이벤트 등록
		panel.add(button);
		panel.add(label);

		add(panel); //패널에 프레임윈도우 추가
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			//getSource() 메서드는 이벤트 발생객체를 구함.
			label.setText("마침내 버튼이 클릭되었습니다.");//라벨위의 문자열을 설정

		}
	}
}
public class Gui17 {
	public static void main(String[] args) {
		new Frame17();
	}
}
