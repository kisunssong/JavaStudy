package day04;
import java.util.Scanner;

public class Hong_ScannerExample {
	public static void main(String[] args) {
		
		//1.스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		//2.스캐너 클래스가 가지고 있는 입력 메서드 사용하여 데이터를 입력받음
		System.out.println("이름을 입력하세요: ");
		System.out.print("> ");
		
		String name = scan.next();		
		System.out.println("나이를 입력하세요: ");
		System.out.print("> ");
		
		int age = scan.nextInt();		
		System.out.println("당신의 이름은" + name);
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		
		scan.close();
	}
}
