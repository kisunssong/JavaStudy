import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class Frame12 extends JFrame {
	
	JCheckBox ch01; //����üũ�ڽ��� �׸� ��ư�� �����, �ϳ��̻� �������� ����
	JCheckBox ch02; 
	JCheckBox ch03; 
	
	JRadioButton rb01; //JRadioButton�� ��ư �׷�ȭ ��Ű��, ��1���� ����
	JRadioButton rb02;
	JRadioButton rb03;
	JRadioButton rb04;
	JRadioButton rb05;
	
	Panel p01; // awt �г�
	Panel p02;
	Panel p03;
	
	public Frame12() {
		p01 = new Panel();
		ch01 = new JCheckBox("Java",true); //�ι�° ���ڰ� true�� �����ϸ� �̸� ���õ�
		ch02 = new JCheckBox("C",false);
		ch03 = new JCheckBox("C++",false);
		
		p01.add(ch01); //3���� üũ�ڽ��� �гο� �߰�
		p01.add(ch02);
		p01.add(ch03);
		
		getContentPane().add(p01,"North"); //������ ���ʿ� ��ġ
		
		p02 = new Panel();
		rb01 = new JRadioButton("����",true);
		rb02 = new JRadioButton("����",false);
		ButtonGroup gr01 = new ButtonGroup();
		gr01.add(rb01);
		gr01.add(rb02);
		p02.add(rb01);
		p02.add(rb02);
		getContentPane().add(p02,"Center");
		//�ι�° �г��� ������ �߾ӿ� �������̾ƿ� ��ġ
		
		p03 = new Panel();
		rb03 = new JRadioButton("����",true);
		rb04 = new JRadioButton("����",false);
		rb05 = new JRadioButton("����",false);
		ButtonGroup gr02 = new ButtonGroup();
		gr02.add(rb03);
		gr02.add(rb04);
		gr02.add(rb05);
		p03.add(rb03);
		p03.add(rb04);
		p03.add(rb05);
		getContentPane().add(p03,"South");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
}
public class Gui12 {
	public static void main(String[] args) {
		new Frame12();
	}
}
