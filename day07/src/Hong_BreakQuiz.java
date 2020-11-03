import java.util.Scanner;

public class Hong_BreakQuiz {

	public static void main(String[] args) {

		/*
		 * 1. 두 수의 더하기를 맞추는 문제를 지속적으로
		 * 출제하는 프로그램입니다.
		 * 2. 2가지의 정수를 1~100사이의 난수를 발생시켜
		 * 지속적으로 문제를 출제한 후 정답을 맞추면
		 * 3. 27 + 84 =?
		 * [문제를 그만 푸시려면 0을 입력하세요.]
		 */

			Scanner sc = new Scanner(System.in);
		int count1 = 0; //반복문 안에 있으면 값이 계속 초기화됨 // 그래서밖으로뺌
		int count2 = 0; //반복문 안에 있으면 값이 계속 초기화됨// 그래서밖으로뺌

		while(true) {
			int a = (int)(Math.random() * 100+1); //먼저작성
			int b = (int)(Math.random() * 100+1); //먼저작성
			System.out.println("------------------");
			System.out.printf("%d + %d = ?\n",a,b);
			System.out.printf("[문제를 그만 푸시려면 0을 입력하세요.]\n");
			System.out.printf("> ");
			int num = sc.nextInt(); //문장 다쓰고 맨밑에 작성
			
			if (num==0) { //탈출문은 위에있어야한다.else밑에 있으면 else출력문까지나옴
				System.out.println("프로그램을 종료합니다.");
				System.out.println("==========================");
				System.out.printf("정답 횟수: %d 회\n", count1); //반복문밖에 수 가져옴
				System.out.printf("틀린 횟수: %d 회\n", count2); //반복문밖에 수 가져옴
				break;
			}			
			if (num==a+b) {
				count1++; //ture면 +1
				System.out.println("정답입니다!!");
			}else {
				count2++; //false면 +1
				System.out.println("틀렸는데요??");
			}
		}
		sc.close();
	}
}



