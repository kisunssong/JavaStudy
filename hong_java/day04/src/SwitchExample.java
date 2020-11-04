import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		switch (score/10) {
		case 10 :
			System.out.println("만점 입니다.");
			break;
		
		case 9 :
			System.out.println("A학점 입니다.");
			break;
			
		case 8 :
			System.out.println("B학점 입니다.");
			break;
			
		case 7 : 
			System.out.println("C학점 입니다.");
			break;
		
		default : 
			System.out.println("재수강 대상 입니다.");

		scan.close();
		}
	}

}
