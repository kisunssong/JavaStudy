package poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		//Promotion이 적용되면 자식클래스의 본래멤버를 참조할 수 없음.
		Parent p = new Child();
		p.method1();
		p.method2();
//		p.method3(); // Child가 가지고 있는 본래 메서드
		System.out.println("-----------------------");
		Child c = (Child)p;
		c.method3();
		c.method1();
		c.method2();
		Child cc = new Child();
		cc.method3();
		
		/*
		 * 한번 Promotion이 일어난 객체를 대상으로만 강제타입변환을
		 * 사용할 수 있습니다. 
		 */
//		child ccc = (Child)new Parent();

	}

}
