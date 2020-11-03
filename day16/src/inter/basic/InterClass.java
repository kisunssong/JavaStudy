package inter.basic;
/*
 * 1. 인터페이스를 사용하려면 클래스에서 해당 인터페이스를 구현해야 합니다.
 * 2. 인터페이스를 구현하는 키워드는 implements입니다.
 * 3. 인터페이스를 상속과 달리 여러 인터페이스들을 동시에 다중구현할 수 
 * 있습니다.
 * 4. 인터페이스를 구현할 때 인터페이스 내부에 선언된 추상메서드들을
 * 반드시 전부 재정의해야 합니다.
 */
public class InterClass implements Inter1, Inter2{ // 2개동시 가져옴
	
	public void method1() { // 인터페이스는 자동 abstract붙어서 구체화해줘야함
		System.out.println("Inter1의 메서드 구현");
	}
	public void method2() { // 인터페이스는 자동 abstract붙어서 구체화해줘야함
		System.out.println("Inter2의 메서드 구현");
	}
	
	public void method3() { 
		System.out.println("클래스의 메서드 호출");
	}
	
	
}
