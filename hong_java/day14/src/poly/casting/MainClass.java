package poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		//Promotion�� ����Ǹ� �ڽ�Ŭ������ ��������� ������ �� ����.
		Parent p = new Child();
		p.method1();
		p.method2();
//		p.method3(); // Child�� ������ �ִ� ���� �޼���
		System.out.println("-----------------------");
		Child c = (Child)p;
		c.method3();
		c.method1();
		c.method2();
		Child cc = new Child();
		cc.method3();
		
		/*
		 * �ѹ� Promotion�� �Ͼ ��ü�� ������θ� ����Ÿ�Ժ�ȯ��
		 * ����� �� �ֽ��ϴ�. 
		 */
//		child ccc = (Child)new Parent();

	}

}
