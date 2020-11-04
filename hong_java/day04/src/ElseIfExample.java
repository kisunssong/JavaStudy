import java.util.Scanner;

public class ElseIfExample {
	public static void main(String[] args) {
		//else if (조건식) - 여러 분기(조건) 지정 가능.
		//횟수에 제한 없음, 또한 마지막에 꼭 else가 붙어야 했지만		
		//이제는 작성하지 않아도 됨
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		if(num%2 == 0) {
			System.out.println("2의 배수 입니다.");
		}else if(num%3 == 0) {
			System.out.println("3의 배수 입니다.");
		}else if(num%5 == 0) {
			System.out.println("5의 배수 입니다.");
		}
		scan.close();
	}
}
