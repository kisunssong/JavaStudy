class St01 {
	static int a=10; //static Ű����� ���ǵ� a�� ��������(Ŭ���� ����)��� �Ѵ�.
// ���������� �ش�Ŭ������ ���� �����Ѵ�. St01.a
	int b=20; //b�� �ν��Ͻ� ����. �ν��Ͻ��� ��ü�� ���� �ǹ��̴�. ������ �� ��ü
// �� ���ؼ� �޸� �ּҸ� ���� �����ؼ� ���� ���� �����Ѵ�.
/*
Ŭ���� �Ҽ��� ������� ����)
1. ��������(Ŭ���� ����)
2. �ν��Ͻ�����
*/
}


public class Static01 {
	public static void main(String[] args) {
		System.out.println("St01 ��������a: "+St01.a);
		
		St01 s01=new St01();
		St01 s02=new St01();
		
		System.out.println("s01 �ν��Ͻ� ����b: "+s01.b);
		System.out.println("s02 �ν��Ͻ� ����b: "+s02.b);
		System.out.printf("s01 �ν��Ͻ� ����b: %d, St01 ��������a: %d\n",s01.b,St01.a);
		System.out.printf("s02 �ν��Ͻ� ����b: %d, St02 ��������a: %d\n",s01.b,St01.a);
	}
}
