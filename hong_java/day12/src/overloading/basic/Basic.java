package overloading.basic;

/*
 * 오버로딩(중복) - 하나의 클래스 내부에 같은 이름을 가진 메서드를
 * 여러 개 선언할 수 있게 하는 문법
 * 
 * 1. 매개 변수의 데이터 타입이 달라야 합니다.
 * 2. 매개 변수의 순서가 달라야 함.
 * 3. 매개 변수의 개수가 달라야 함.
 * 
 */


public class Basic {
	
	//input(int)
	void input(int a) {
		System.out.println("정수 1개가 입력됨.");
	}
	
	//input(int)
//	void input(int i) { //매개변수 타입이 같아서 사용불가
//		System.out.println("정수 1개가 입력됨.");
//	}
	
//	String input(int x) { //매개변수 타입이 같아서 사용불가
//		
//	}
	
	void input(String s) { 
		System.out.println("문자열 1개가 입력됨");
	}
	
	void input(int a, int b) {
		System.out.println("정수 2개가 입력됨.");
	}
	
	void input(String s, double d) {
		System.out.println("문자열 1개와 실수 1개가 입력됨.");
	}
	
	void input(double x, String y) {
		System.out.println("실수 1개와 문자열 1개가 입력됨.");
	}
	
	
	

}
