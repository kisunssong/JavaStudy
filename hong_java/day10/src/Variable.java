
public class Variable {
	
	//필드 (멤버변수) 선언.
	int a; //초기화하지 않으면 기본값으로 자동 초기화
	
	//메서드 선언.
	void printNumber(int c) {
		//지역변수 b와 매개변수 c를 선언.
		int b = 1; //지역변수는 반드시 값을 초기화해야 합니다.
		
		System.out.println("멤버변수: " + a);
		System.out.println("지역변수: " + b);
		System.out.println("매개변수: " + c);
	}
	
	public static void main(String[] args) {
		
		Variable v = new Variable();
		v.printNumber(5);
	}
}
