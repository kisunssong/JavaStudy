import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		//if(조건식){ }else{ }
		//true면 if 블록 안, false면 else 블록 안의 내용 실행
		//if만 적는것도 이제는 가능.
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("2의 배수 입니다.");
		}else {
			System.out.println("2의 배수가 아닙니다.");
		}
		scan.close();
	}

}
