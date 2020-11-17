import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame04 extends Frame {
	public Frame04() {
		setLayout(new GridLayout(3,2)); //3��,2�� ��ı��� �׸��� ���̾ƿ� ��ġ������

		add(new Button("Button 01"));
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));

		setSize(300,200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}
		});
	}
}
public class Gui04 {
	public static void main(String[] args) {
		new Frame04();
	}	
}

