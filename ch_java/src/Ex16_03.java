class Parent21 {
	protected int a,b,c;
	
	public Parent21() {
		// super(); 가 생략됨. 최고 조상 object클래스의 기본생성자를 호출	
		System.out.println("Parent21 클래스의 기본생성자 호출");
	}
	public Parent21(int a, int b, int c) {
		// super(); 가 생략됨
		System.out.println("Parent21 전달인자 3개짜리 생성자 호출");
		this.a=a; this.b=b; this.c=c;
	}// 생성자 오버로딩
}

public class Ex16_03 {
	public static void main(String[] args) {
		
	}
}
