package poly.promotion;

public class MainClass {
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.method1();
		p1.method2();
//		p1.method3(); // �θ�� �ڽ��� ��ü�� �θ�������
		
		System.out.println("-------------------");
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		
		System.out.println("==========������ ����=========");
		Parent p2 = c1; //Child -> Parent : Promotion
		System.out.println(c1 == p2);
		System.out.println(c1);
		System.out.println(p2);
		
		p2.method1();
		p2.method2();
//		p2.method3();
		
		
		/*
		 * �������� �����Ͽ� �ڽ� ��ü�� �θ� Ÿ������
		 * �� ��ȯ���� �ÿ� �ڽ��� ������ �ִ� ������ ���
		 * (�������, �޼���)�� ������ �� ���� ������ �߻��մϴ�.
		 * �ٸ�, �����ǵ� �޼���� ���������� ȣ���� �� �ֽ��ϴ�.
		 */
		
		
	}
		
}
