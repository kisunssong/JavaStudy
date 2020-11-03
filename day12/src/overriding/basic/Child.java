package overriding.basic;

public class Child extends Parent{
	
	/*
	 * 메서드 재정의(overriding)
	 * 부모클래스가 물려준 메서드를 자식 클래스에서
	 * 블록 내부만 바꿔서 사용하는 것.
	 * 
	 * 1.오버라이딩은 반환값이 동일해야함
	 * 2.오버라이딩은 매개변수가 동일해야함 
	 */
	
	void method3() {
		System.out.println("자식의 3번 메서드 호출!");
	}
	
	void method2() {
		System.out.println("재정의된 자식의 2번 메서드");
	}
	
}
