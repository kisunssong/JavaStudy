import javax.swing.JFrame;

//���� ������������ â �����
class Frame10 extends JFrame {
	
	public Frame10() {
		super("���� ������ ������"); //����(swing)������������ ���� ����
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���������Ӵݱ�
	}
}
public class Gui10 {
	public static void main(String[] args) {
		new Frame10();
	}
}
