import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame20 extends JFrame implements ActionListener {
	JPanel p1;
	JButton sum;
	JLabel label;
	public Frame20() {
		setSize(300,200);
		setTitle("스읭 ui연습");	
		
		label = new JLabel(sum+" ");
		p1.add(label);
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());

		sum = new JButton("+");
		p1.add(sum);

		for(int i=0; i<10; i++) {
			p1.add(new JButton(i+" ")); //10개의 버튼을 패널에 추가
		}
		add(p1); //프레임윈도우에 패널추가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		sum.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		
	}



}

public class Gui20 {
	public static void main(String[] args) {
		new Frame20();
	}
}
