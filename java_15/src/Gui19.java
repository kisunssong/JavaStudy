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
		
		label1 = new JLabel(count+" ");//" "+���ڴ� ���ڸ� �켱�ؼ� ����->���ڷκ���
		
		label1.setFont(new Font("�ü�ü", Font.BOLD | Font.ITALIC,50));
		//�󺧿� �۲�,���ϰ� | �����,����ũ��
		panel.add(label1);
		
		button = new JButton("ī���� ����");
		panel.add(button);
		
		button.addActionListener(this); //��ư �̺�Ʈ ���
		add(panel);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ī���� ����");
		setVisible(true);
 	}
	
	public void actionPerformed(ActionEvent e) {
		count++;
		label1.setText(count+" ");
	}// ��ư Ŭ�������� ȣ��
}
public class Gui19 {
	public static void main(String[] args) {
		new Frame19();
	}
}
