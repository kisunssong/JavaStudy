import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame03 extends Frame {
	public Frame03() {
		setLayout(new BorderLayout());
/*
���� ���̾ƿ� ��ġ�����ڴ� �� ������Ʈ ��ġ�� ��,��,��,��,�߾� �����ؼ� ��ġ�� �� �ִ�.
*/
		add(new Button("Button 01"), "North"); //������ ���ʿ� ��ġ
		add(new Button("Button 02"), "West"); //������ ���ʿ� ��ġ
		add(new Button("Button 03"), "Center"); //������ �߾ӿ� ��ġ
		add(new Button("Button 04"), "East"); //������ ������ ��ġ
		add(new Button("Button 05"), "South"); //������ ����, �Ʒ��� ��ġ
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}			
		});
	}
}
public class Gui03 {
	public static void main(String[] args) {
		new Frame03();
	}
}
