class MyDate01 {
	private int year; //�⵵: Ŭ���� �Ҽ��� �Ӽ�, �������� 
	private int month; //��: intŸ���� ������� �ʱ� �⺻������ 0�� �����
	private int day; //��
	
	public MyDate01() {
/*
������ Ư¡)
1. �����ڴ� Ŭ�����̸��� ����.
2. ������ �� �տ��� �ڷ����� �ȵ�� ����. �� ����Ÿ���� ������� �ʴ´�.
*/
		System.out.println("�⺻ ������ ȣ��");
	}
	public void print() {
		System.out.println(year+"/"+month+"/"+day);
	}
}

public class Cons01 {
	public static void main(String[] args) {
		new MyDate01();
		System.out.println("===============");
		MyDate01 m=new MyDate01();
		m.print();
		new MyDate01().print();
	}
}
