interface MyInter11 {
	default void m01() {
		System.out.println("����Ʈ �޼��嵵 �ü� �ֵ�.");
	}
	static void m02() {
		System.out.println("static �޼��嵵 �ü� �ֵ�.");
	}
}
class Child11 implements MyInter11 {
	public void m01() {
		System.out.println("�������̵��� �޼���");
	}
}

public class Inter11 {
	public static void main(String[] args) {
		Child11 ch = new Child11();
		ch.m01();
		MyInter11.m02();
		
	}
}
