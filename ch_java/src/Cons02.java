class MyDate02 {
	private int year;
	private int month;
	private int day;
	
	MyDate02() {
		year=2020; month=11; day=5;
/*
�������� �ֵȱ��)
1. Ŭ���� �Ҽ��� ������� ������ ��ü�� �����ؼ� ������ �� �ִ� ������ 
�ν��Ͻ� ��������Ѵ�. �ٷ� �� �ν��Ͻ� ���� ������� �ʱ�ȭ ����� �����ڰ�����.
*/
	}
	
	void p() {
		System.out.println(year+"��"+month+"��"+day+"��");
	}
}

public class Cons02 {
	public static void main(String[] args) {
		
		MyDate02 d=new MyDate02();
		d.p();
	}
}
