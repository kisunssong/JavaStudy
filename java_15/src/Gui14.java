import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Frame14 extends JFrame {
	public Frame14 () {
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����������������");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label01 = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�."+
				 "������ ������ �����Ͻð�.");
		panelA.add(label01);
		
		JButton button01 = new JButton("�޺�����");
		JButton button02 = new JButton("������������");
		JButton button03 = new JButton("�Ұ������");
		panelB.add(button01);
		panelB.add(button02);
		panelB.add(button03);
		
		JLabel label02 = new JLabel("����");
		JTextField field01 = new JTextField(10);
		panelB.add(label02);
		panelB.add(field01);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);//�����������쿡 �г��߰�
		setVisible(true);
	}
}
public class Gui14 {
	public static void main(String[] args) {
		new Frame14();
		
	}
}
