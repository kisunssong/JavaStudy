import java.util.Scanner;

public class hong_WhileExample2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		
		int n = scan.nextInt();
		
		int i = 2;
		while(n % i != 0) {
			i++;
		}
		
		if(n==i) {
			System.out.println(n + "은(는) 소수 입니다.");
		}else {
			System.out.println(n + "은(는) 소수가 아닙니다.");
		}
		scan.close();
	}

}
