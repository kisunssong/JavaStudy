import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui13 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame(); //JFrameŬ������ ���� ������ ������
		JPanel panel = new JPanel(); //JPanel�� �� ������Ʈ �׸���ü�� �׷�ȭ
		//��Ű�� �����̳� ���̾ƿ�. ������ �����쿡 �гα������� ��ġ
		
		f.add(panel); //�����ӿ� �г� �߰�
		
		JLabel label01 = new JLabel("ȭ�� �µ�");
		//JLabel�� ������ �����϶� ����ϴ� ������Ʈ
		
		JLabel label02 = new JLabel("���� �µ�");
		
		JTextField field01 = new JTextField(15);	
		//JTextField�� ���� �Է¹ڽ��� �����
		
		JTextField field02 = new JTextField(15);	
		JButton button = new JButton("��ȯ");
		
		panel.add(label01);
		panel.add(field01);
		panel.add(label02);
		panel.add(field02);
		panel.add(button);
		
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("�µ� ��ȯ��"); //������ ������ ������
		f.setVisible(true); //������ ������ �׻� ���̰� ����
				
	}
}
