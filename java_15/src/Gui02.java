import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
��ġ������: �����̳� ���̾ƿ� �ȿ� �׸���ü �� ������Ʈ�� ��� ��ġ�� ���ΰ��� ����
�ϴ� �����ڸ� ���Ѵ�.
setLayout() ��ġ������ �޼���� ��ġ�����ڸ� �����Ѵ�.
FlowLayout ��ġ������ Ŭ������ ���̾ƿ��ȿ� ��ġ�Ǵ� ������Ʈ�� ���帣�� ���ʿ�������
���������� ������ �Ʒ��� ���帣�� ��ġ�Ѵ�.
*/
class Frame02 extends Frame {
	public Frame02() {
		setLayout(new FlowLayout());
// this.��������, add()�޼���� ������������ �ȿ� ��ư�� �߰�
		this.add(new Button("Button 01")); 
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));
		
		setSize(300,200); // ������ ��:300 ����:200
		setVisible(true); // �׻� ���̰� ��
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}// ������������ �ݱ����� �� ȣ��
		}); //������ �̺�Ʈ(���,��) ���
	}
}
public class Gui02 {
	public static void main(String[] args) {
		new Frame02();
		
	}
}
