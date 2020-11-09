class Parent04 {
	void p04() {
		System.out.println("조상 클래스 메서드 p04()");
	}
}

class Child04 extends Parent04 {
/*
메서드 오버라이딩 이란?
1. 오버라이딩을 할려면 사전에 상속관계를 꼭 만들어야 한다.
2. 메서드 오버라이딩이란 부모클래스의 메서드명,매개변수 개수(타입,순서),메서드 반환타입
메서드 선언부와 일치한 것을 그대로 자손으로 상속받은 상태에서 자손에 맞는{} 내의 몸체문
장을 변경 수정하는 것을 말한다.
*/
	void p04() {
		System.out.println("오버라이딩 한 메서드");
	}
	void ch04() {
		System.out.println("자손클래스 메서드 ch04()");
	}
}

public class Extend04 {
	public static void main(String[] args) {
		Child04 c = new Child04();
		c.p04(); //오버라이딩된 메서드
		c.ch04(); //본인 메서드
		
		Parent04 p = new Parent04();
		p.p04(); //조상클래스 메서드
	}
}
