interface MyInter11 {
	default void m01() {
		System.out.println("디폴트 메서드도 올수 있따.");
	}
	static void m02() {
		System.out.println("static 메서드도 올수 있따.");
	}
}
class Child11 implements MyInter11 {
	public void m01() {
		System.out.println("오버라이딩한 메서드");
	}
}

public class Inter11 {
	public static void main(String[] args) {
		Child11 ch = new Child11();
		ch.m01();
		MyInter11.m02();
		
	}
}
