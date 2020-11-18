import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Frame15 extends JFrame {
	JButton b1;
	private JButton b2;
	private JButton b3;
	
	public Frame15() {
		setTitle("절대 위치로 개발자가 임의로 컴포넌트 배치연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		
		JPanel p = new JPanel();
		p.setLayout(null); // 패널에 배치관리자 설정안함. 절대 위치로 임의로 배치하려고
//		p.setLayout(new FlowLayout()); // 흐름대로 자동배치
		
		b1 = new JButton("Button #1");
		b2 = new JButton("Button #2");
		b3 = new JButton("Button #3");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		b1.setBounds(20,5,95,30); //x,y위치에 95너비, 30높이 만큼 버튼이 배치
		//setSize(20,5) 메서드+setLocation(x:95,y:30)=> setBounds()
		b2.setBounds(55,45,105,90);
		b3.setBounds(180,15,105,90);
		add(p); //패널을 프레임윈도우에 추가
		setVisible(true);
	}
	
}

public class Gui15 {
	public static void main(String[] args) {
		new Frame15();
	}
}
