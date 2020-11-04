package final_.method;

public class Child extends Parent{
	
	public void method1() {}
	public void method2() {}
//	public void method3() {} //부모클래스에서 method3 을 final처리함.
	
	public Child() {
		method1();
		method2();
		//method3상속은(사용)은 가능하게해준다. 값을변경이안됨.
		method3();
	}

}
