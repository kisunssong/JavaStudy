package poly.promotion;

public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("재정의된 2번 메서드 호출!");
	}
	
	public void method3() {
		System.out.println("자식의 3번 메서드 호출!");
	}
	
	

}
