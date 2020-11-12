interface I10 {
	public abstract void methodB();
	
}
class B10 implements I10 { //extends Object이 생략
	
	public void methodB() {
		System.out.println("method8() in B2 class");
	}
	
	public String toString() {
		return "class B2";
	}
}
class InstanceManager {
	public static I10 getInstance() {
		return new B10();
	}
}
class A10 {
	void methodA() {
		I10 i = InstanceManager.getInstance(); //업캐스팅->I10 i = new B10();
		i.methodB();
		System.out.println(i.toString());
	}
}

public class Inter10 {
	public static void main(String[] args) {
		A10 a = new A10();
		a.methodA();
	}
}
