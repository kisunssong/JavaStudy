import java.util.Scanner;


//양의 정수를 입력받아서 그 수가 홀수라면..
//x는 홀수입니다.
//양의 정수를 입력받아서 그 수가 짝수라면..
//x는 짝수입니다.
//0은 잘못된 숫자 입니다.
//출력하세요!!
public class Hong_IfQuiz {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int a = scan.nextInt();
		if ( a==0 ) { //true가 되어버리면 아래출력 후 바로 끝 elif확인안함
			System.out.println("0은 잘못 된 숫자 입니다."); 
		} else if ( a%2==0 ) {
			System.out.println(a + "은 짝수입니다.");
		} else {
			System.out.println(a + "은 홀수입니다.");
		}
		scan.close();
	}

}
