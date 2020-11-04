package modi.contructor.pac1;

public class A {
	
	//멤버 변수 선언
	A a1 = new A(true); //public 생성자 호출
	A a2 = new A(3); //p.f 생성자 호출
	A a3 = new A("hi"); //private 생성자 호출
	
	//생성자 선언.
	public A(boolean b) {} //public제한
	
	A(int i) {} //package friendly 제한
	
	private A(String s) {} //private제한
}
