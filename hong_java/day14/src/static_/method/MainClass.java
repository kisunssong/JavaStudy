package static_.method;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * static�� ���� ����� ��ü �������� Ŭ���� �̸�����
		 * ���� ������ �����մϴ�.
		 */
		System.out.println(Count.method2());
		Count.b += 50;
		System.out.println(Count.method2());
		Count.b -= 20;
		System.out.println(Count.method2());
		
//		System.out.println(Count.method1()); // (X)a�� static�Ⱥ���
		Count c1 = new Count();
		c1.a += 30;
		System.out.println(c1.method1());
		
		Math.random();
		System.out.println(Math.PI);
	}

}
