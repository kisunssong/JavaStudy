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
		setTitle("�̺�Ʈ ����");
		
		JPanel p = new JPanel();
		button = new JButton("��ư�� �����ÿ�.");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("��ħ�� ��ư�� ����");
				}
			}//��ư Ŭ�������� ȣ��
		}); //��ư �̺�Ʈ ����ϸ鼭 �޼��� ���ڰ����� �͸�Ŭ���� ����(�ܺ�Ŭ������$��ȣ.calss
		
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
