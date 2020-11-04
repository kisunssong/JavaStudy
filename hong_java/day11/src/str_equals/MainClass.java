package str_equals;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		 * String객체를 생성할 시 같은 주소값을 공유하게 됩니다.
		 */
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1 == s2);
		
		
		Scanner scan = new Scanner(System.in);
		User u = new User("abc1234");
		System.out.printf("비밀번호를 입력: ");
		String password = scan.next();

		
//		if(password == u.pw) { // ==는 주소만을 비교한다.
		if(password.equals(u.pw)) { // equals(비교대상)을 해야 값을 정확히 비교	
			System.out.println("비밀번호가 일치 합니다.");
		}else {
			System.out.println("비밀번호가 일치 하지 않습니다.");
		}
		scan.close();
	}

}
