import java.util.Scanner;

public class Hong_DoWhileExample {
	
	public static void main(String[] args) {
		
		//정수를 입력받아 1부터 입력받은 숫자까지의 누적합을 구하는 로직
		//do는 연산을 최초 1회 먼저 함
		//while은 조건검색 후 false면 연산을 안함
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("정수: ");
		int target = scan.nextInt(); // target값 사용자부로 받음
		int sum = 0; // 담을 용기 - 0시작
		int n = 1; // 시작 - 제어 변수
				
		do {
			sum += n; // n시작으로부터 sum에 +함
			n++; // step 증감식
		} while (n <= target); // 논리형 조건 , 끝 - 반복 실행
		
//		while(n <= target) {
//			sum += n;
//			n++;
//		}
		System.out.println("1부터 " + target + "까지의 합이 " + sum);
		
	
	scan.close();
	}

}
