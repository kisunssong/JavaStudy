import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Frame15 extends JFrame {
	JButton b1;
	private JButton b2;
	private JButton b3;
	
	public Frame15() {
		setTitle("���� ��ġ�� �����ڰ� ���Ƿ� ������Ʈ ��ġ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		
		JPanel p = new JPanel();
		p.setLayout(null); // �гο� ��ġ������ ��������. ���� ��ġ�� ���Ƿ� ��ġ�Ϸ���
//		p.setLayout(new FlowLayout()); // �帧��� �ڵ���ġ
		
		b1 = new JButton("Button #1");
		b2 = new JButton("Button #2");
		b3 = new JButton("Button #3");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		b1.setBounds(20,5,95,30); //x,y��ġ�� 95�ʺ�, 30���� ��ŭ ��ư�� ��ġ
		//setSize(20,5) �޼���+setLocation(x:95,y:30)=> setBounds()
		b2.setBounds(55,45,105,90);
		b3.setBounds(180,15,105,90);
		add(p); //�г��� �����������쿡 �߰�
		setVisible(true);
	}
	
}

public class Gui15 {
	public static void main(String[] args) {
		new Frame15();
	}
}
