import java.util.Scanner;

public class Hong_IfExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		System.out.printf("> ");
		int point = sc.nextInt();
		
		if(point >= 90) {   //첫번째 검사.. false면 elif조건문 전부 검사
			if(point > 100) {   //첫번째 검사 ture시 내려옴, 여기서 false면 elif확인
				System.out.println("점수를 잘못 입력했습니다.");
			} else if (point >= 95) {
				System.out.println("당신의 학점은 A+입니다..");				
			} else {
				System.out.println("당신의 학점은 A입니다.");
			}
		} else if (point >= 80) {
			System.out.println("당신의 학점은 B입니다.");
			
		} else if (point >= 70) {
			System.out.println("당신의 학점은 C입니다.");
			
		} else if (point >= 60) {
			System.out.println("당신의 학점은 D입니다.");
			System.out.println("당신은 재수강 대상입니다.");
			
		} else {
			System.out.println("당신은 학점은 F입니다.");
			System.out.println("당신은 재수강 대상입니다.");
			
		}
		sc.close();
	}

}
