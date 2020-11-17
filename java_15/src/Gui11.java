import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Frame11 extends JFrame {
	JButton btn01; //스읭버튼 변수 선언
	JButton btn02; //스읭버튼 변수 선언
	JButton btn03; //스읭버튼 변수 선언
	
	public Frame11() {
		setLayout(new FlowLayout());
		btn01 = new JButton("one"); 
		btn02 = new JButton("two");
		btn03 = new JButton("three");
		add(btn01);
		add(btn02);
		add(btn03);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
}
public class Gui11 {
	public static void main(String[] args) {
		new Frame11();
	}
}
