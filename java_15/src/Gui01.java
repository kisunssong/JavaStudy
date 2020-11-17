/*
java.awt ��Ű������ apiŬ������ ����Ʈ �ϸ� �ڹپ��� �׸��� �׸� �� �ִ�.
*/

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame01 extends Frame { //awt�� Frame�����츦 ��ӹ޾Ƽ� ������â�� �����.
	public Frame01() {
		super("awt window"); //����Ŭ���� �����ε��� ������ ȣ���ؼ� ������������
		//������ ����
		this.setSize(300,200); //������������ ��:300 ����:200
		setVisible(true); //�����������츦 �׻󳪿��� �Ѵ�.
		
		//WindowAdapter: ����� �߻�Ŭ������ ������������ �̺�Ʈ ó�� ����Ѵ�.	
		addWindowListener (new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose(); //�ڿ�����, ������������ �ݱ�
				System.exit(0);
			}
		
			
		}//���� ����Ŭ������ �ݱ� �̺�Ʈ ó��: �ܺ�Ŭ������$��ȣ.class�� �����ϵȴ�
		//Frame02$1.class(�̸����� �͸�Ŭ���� �������� �ַ� �ڹ�GUI���� �̺�Ʈ
		//��� ó�� �������� ����
		);//�̺�Ʈ ��ϸ޼���
	}
}

public class Gui01 {
	public static void main(String[] args) {
		new Frame01();
	}
}
