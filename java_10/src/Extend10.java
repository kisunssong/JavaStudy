class Parent10 {
	int x = 10;
}
class Child10 extends Parent10 {
	int x = 20;
	
	void method() {
		System.out.println("x:"+x);
		System.out.println("this.x:"+this.x);
		System.out.println("super.x:"+super.x);
	}
}

public class Extend10 {
	public static void main(String[] args) {
		Child10 ch = new Child10();
		ch.method();
	}
}
