/*
클래스 상송 형식)
class 자손 클래스 extends 조상클래스{
}
클래스 상속은 단일상속만 가능하다. 즉 하나의 조상으로부터만 상속가능하다.
*/
//자바의 모든 클래스는 명시적인 상속을 받지 않으면 자바 최상위 조상클래스 object으로 부터
//묵시적인 상속을 받는다.

class Parent01 {
	public void p01() {
		System.out.println("조상 클래스 p01()");
	}
}
class Child01 extends Parent01 {	
	public void ch01() {
		System.out.println("자손 클래스 ch01()");
	}
}
	
public class Extend01 {
	public static void main(String[] args) {
		Child01 ch = new Child01();
		ch.p01(); // 상속받아서 해당 메서드 호출
		ch.ch01(); // 자손클래스 자신 메서드를 호출
		Parent01 p = new Parent01();
		p.p01();
//		p.ch01(); 조상클래스에서 자손클래스 메서드 호출못함.
	}
}
