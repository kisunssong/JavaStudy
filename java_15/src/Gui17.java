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
		this.setSize(300,200); //this. ������ ���ڽ��� ����. ����������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�̺�Ʈ ����"); //���� ������������ ������ ����

		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� Ŭ�� �ȵǾ�����.");
		button.addActionListener(this); //��ư �̺�Ʈ ���
		panel.add(button);
		panel.add(label);

		add(panel); //�гο� ������������ �߰�
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			//getSource() �޼���� �̺�Ʈ �߻���ü�� ����.
			label.setText("��ħ�� ��ư�� Ŭ���Ǿ����ϴ�.");//������ ���ڿ��� ����

		}
	}
}
public class Gui17 {
	public static void main(String[] args) {
		new Frame17();
	}
}
