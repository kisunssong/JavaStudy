package overriding.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method1();
		p.method2();
		
		System.out.println("================");
		Child c = new Child();
		c.method3();
		c.method1();// extends (Parent ���)
		c.method2();// extends (Parent ��ӿ� overriding)
	}

}
