import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui13 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame(); //JFrame클래스는 스읭 프레임 윈도우
		JPanel panel = new JPanel(); //JPanel은 각 컴포넌트 그림객체를 그룹화
		//시키는 컨테이너 레이아웃. 프레임 윈도우에 패널기준으로 배치
		
		f.add(panel); //프레임에 패널 추가
		
		JLabel label01 = new JLabel("화씨 온도");
		//JLabel은 설명을 덧붙일때 사용하는 컴포넌트
		
		JLabel label02 = new JLabel("설씨 온도");
		
		JTextField field01 = new JTextField(15);	
		//JTextField는 한줄 입력박스를 만든다
		
		JTextField field02 = new JTextField(15);	
		JButton button = new JButton("변환");
		
		panel.add(label01);
		panel.add(field01);
		panel.add(label02);
		panel.add(field02);
		panel.add(button);
		
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도 변환기"); //프레임 윈도우 제목설정
		f.setVisible(true); //프레임 윈도우 항상 보이게 설정
				
	}
}
