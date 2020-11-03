import java.util.Scanner;

public class Hong_SwitchExample1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수: ");
		int point = scan.nextInt();
		
		/*
		 * switch키워드 뒤에 나오는 변수나 연산식은
		 * 결과값이 반드시 문자나 정수타입이어야 합니다.
		 */
		
		switch(point/10) {
		
		//case뒤에는 반드시 상수를 적어야 합니다.
		case 10:
		case 9:
			if(point > 100) {
				System.out.println("점수를 잘못 입력했습니다.");
			}else {
				System.out.println("당신의 학점은 A입니다.");
			}
			break; //switch블록을 나가라
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break; //switch블록을 나가라
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break; //switch블록을 나가라
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break; //switch블록을 나가라
		default:
			System.out.println("당신의 학점은 F입니다.");
		}
		scan.close();
	}

}
