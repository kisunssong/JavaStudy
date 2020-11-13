//오버라이딩 규칙
//상속관계에선 부모클래스 메서드이름,반환타입,매개변수타입 개수 모두 동일해야함
class Father02 {
	void f02() {
		System.out.println("부모클래스 f02() 메서드");
	}
}
class Child02 extends Father02 {
	void f02() {
		System.out.println("자식클래스 f02() 메서드");
	}
}

public class WeekEx02 {
	public static void main(String[] args) {
		Child02 ch = new Child02();
		System.out.printf("자식이 호출: ");
		ch.f02();
		
		Father02 fa = new Father02();
		System.out.printf("부모가 호출: ");
		fa.f02();
		
	}
}
