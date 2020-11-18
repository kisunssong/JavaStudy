import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Frame14 extends JFrame {
	public Frame14 () {
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("스읭프레임윈도우");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label01 = new JLabel("자바 피자에 오신것을 환영합니다."+
				 "피자의 종류를 선택하시고.");
		panelA.add(label01);
		
		JButton button01 = new JButton("콤보피자");
		JButton button02 = new JButton("포테이토피자");
		JButton button03 = new JButton("불고기피자");
		panelB.add(button01);
		panelB.add(button02);
		panelB.add(button03);
		
		JLabel label02 = new JLabel("개수");
		JTextField field01 = new JTextField(10);
		panelB.add(label02);
		panelB.add(field01);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);//프레임윈도우에 패널추가
		setVisible(true);
	}
}
public class Gui14 {
	public static void main(String[] args) {
		new Frame14();
		
	}
}
