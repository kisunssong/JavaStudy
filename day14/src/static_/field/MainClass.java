package static_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c1 = new Count();
		
		c1.a++;
		c1.b++;
		
		System.out.println("�Ϲ� ������� a: " + c1.a);
		System.out.println("�Ϲ� ������� b: " + c1.b);
		
		Count c2 = new Count();
		
		c2.a++;
		c2.b++;
		System.out.println("�Ϲ� ������� a: " + c2.a);
		System.out.println("�Ϲ� ������� b: " + c2.b);
		
		/*
		 * static����� ��ü�� �����ϱ� ������ Ŭ���� �̸�������
		 * �����Ͽ� ����մϴ�.
		 * static�� ���� ������ �׳� �ϳ��� ����ؼ� �����ȴٶ�� �����ϸ��
		 * static ��ü ���� �ƴ�.  ���� ���� ��
		 */
		Count.b++;
		Count.b++;
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(Count.b);
	}

}
