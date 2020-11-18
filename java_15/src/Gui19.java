import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame19 extends JFrame implements ActionListener {
	private JLabel label;
	private JLabel label1;
	private JButton button;
	private int count = 0;
	
	public Frame19() {
		JPanel panel = new JPanel();
		label = new JLabel("Counter");
		panel.add(label);
		
		label1 = new JLabel(count+" ");//" "+숫자는 문자를 우선해서 숫자->문자로변경
		
		label1.setFont(new Font("궁서체", Font.BOLD | Font.ITALIC,50));
		//라벨에 글꼴,진하게 | 기울임,글자크기
		panel.add(label1);
		
		button = new JButton("카운터 증가");
		panel.add(button);
		
		button.addActionListener(this); //버튼 이벤트 등록
		add(panel);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("카운터 증가");
		setVisible(true);
 	}
	
	public void actionPerformed(ActionEvent e) {
		count++;
		label1.setText(count+" ");
	}// 버튼 클릭했을때 호출
}
public class Gui19 {
	public static void main(String[] args) {
		new Frame19();
	}
}
