abstract class Abstract11 {
	abstract void m01();
	
	void m02() {
		System.out.println("일반 메서드 m02()");
	}
}
abstract class MiddleClass extends Abstract11 {
	//추상클래스를 상속받은 자손이 조상의 추상메서드를 오버라이딩을 하지않으면 자손도
	//추상클래스이어야 한다
	
	void m03() {
		System.out.println("일반메서드 m03()");
	}
}
abstract class SubClass11 extends MiddleClass{
	void m01() {
		System.out.println("일반 메서드 오버라이딩");
	}
}

public class Abs11 {
	public static void main(String[] args) {
		SubClass11 sub = new SubClass11();
		sub.m01();
		sub.m02();
		
	}
}
