package static_.method;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * static이 붙은 멤버는 객체 생성없이 클래스 이름으로
		 * 직접 참조가 가능합니다.
		 */
		System.out.println(Count.method2());
		Count.b += 50;
		System.out.println(Count.method2());
		Count.b -= 20;
		System.out.println(Count.method2());
		
//		System.out.println(Count.method1()); // (X)a가 static안붙음
		Count c1 = new Count();
		c1.a += 30;
		System.out.println(c1.method1());
		
		Math.random();
		System.out.println(Math.PI);
	}

}
