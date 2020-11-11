class A {
	public void methodA(B b) {
		b.methodB();
	}
}
class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class Inter08 {
	public static void main(String[] args) {
//문제) A클래스 객체 a를 생성하고 이 객체 하위의 methodA()를 호출해서
// 출력결과물이 "methodB()"가 나오게하자.
		A a  = new A();
		a.methodA(new B());
	}
}
