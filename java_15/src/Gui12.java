import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class Frame12 extends JFrame {
	
	JCheckBox ch01; //스읭체크박스는 네모 버튼을 만들고, 하나이상 복수개를 선택
	JCheckBox ch02; 
	JCheckBox ch03; 
	
	JRadioButton rb01; //JRadioButton을 버튼 그룹화 시키면, 단1개만 선택
	JRadioButton rb02;
	JRadioButton rb03;
	JRadioButton rb04;
	JRadioButton rb05;
	
	Panel p01; // awt 패널
	Panel p02;
	Panel p03;
	
	public Frame12() {
		p01 = new Panel();
		ch01 = new JCheckBox("Java",true); //두번째 인자값 true로 설정하면 미리 선택됨
		ch02 = new JCheckBox("C",false);
		ch03 = new JCheckBox("C++",false);
		
		p01.add(ch01); //3개의 체크박스를 패널에 추가
		p01.add(ch02);
		p01.add(ch03);
		
		getContentPane().add(p01,"North"); //프레임 북쪽에 배치
		
		p02 = new Panel();
		rb01 = new JRadioButton("남자",true);
		rb02 = new JRadioButton("여자",false);
		ButtonGroup gr01 = new ButtonGroup();
		gr01.add(rb01);
		gr01.add(rb02);
		p02.add(rb01);
		p02.add(rb02);
		getContentPane().add(p02,"Center");
		//두번째 패널을 프레임 중앙에 보더레이아웃 배치
		
		p03 = new Panel();
		rb03 = new JRadioButton("군필",true);
		rb04 = new JRadioButton("미필",false);
		rb05 = new JRadioButton("면제",false);
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
