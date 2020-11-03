//scanner 사용
import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		String word = scan.nextLine();
		System.out.printf("입력하신 문장 : %s\n", word);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.printf("입력하신 숫자 : %d\n", num);
		scan.close(); // Scanner타입을 사용하게되면 자원적으로 항상 물려있게되서 닫아줘야함
		
		
		
	}

}
