import java.util.Scanner;

public class Hong_LoopQuiz {
	
	public static void main(String[] args) {
		
		/*
		 * ===================
		 * 돈을 넣어주세요: 200
		 * 돈이 부족합니다. 최소 500원을 넣어주세요.
		 * 남음 음료수의 개수는 5개 입니다.
		 * =========================
		 * 돈을 넣어주세요: 500
		 * 음료수를 받았습니다.
		 * 남은 음료수의 개수는 4개 입니다.
		 * =========================
		 * 돈을 넣어주세요: 800
		 * 음료수를 받았습니다.
		 * 거스름돈을 300원 받았습니다.
		 * 남은 음료수의 개수는 3개입니다.
		 * =========================
		 * 돈을 넣어주세요: 500
		 * 음료수를 받았습니다.
		 * 남은 음료수의 개수는 2개 입니다.
		 * =========================
		 * 돈을 넣어주세요: 500
		 * 음료수를 받았습니다.
		 * 남은 음료수의 개수는 1개 입니다.
		 * =========================
		 * 돈을 넣어주세요: 500
		 * 음료수를 받았습니다.
		 * 남은 음료수의 개수는 0개입니다.
		 * 음료수가 다 떨어졌습니다. 판매를 중지합니다.
		 * =========================
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);		
		int num = 5;
		
		while(true) {
			System.out.println("===================");
			System.out.printf("돈을 넣어주세요: ");
			int money = sc.nextInt();
			int a = 500;
			
			switch(money) {			
			
			case 500:
					num--;
					System.out.println("음료수를 받았습니다.");
					System.out.printf("남은 음료수의 개수는 %d개 입니다.\n",num);
					break;

			
			default:
				if(a>money) {
					System.out.printf("돈이 부족합니다. 최소 %d원을 넣어주세요.\n",a);
					System.out.printf("남은 은료수의 개수는 %d개 입니다.\n",num);
					break;
				}
					num--;
					System.out.println("음료수를 받았습니다.");
					System.out.printf("거스름돈을 %d원 받았습니다.\n",money-a);
					System.out.printf("남은 은료수의 개수는 %d개 입니다.\n",num);
					break;			
			}
			if(num==0) {
				System.out.println("음료수가 다 떨어졌습니다. 판매를 중지합니다.");
				System.out.println("===================");
				break;
			}
			
		}
		sc.close();
	}
	
}
