
class MyDate04 {
	private int year;
	private int month;
	private int day;
/*
MyDate04(){} �Ű������� ���� ������(�⺻) �����ڸ� �ڹ� �����Ϸ��� ����������
�����Ѵ�. �׷��� �ڵ忡�� �����ص� �ȴ�.	
*/
	void pr() {
		System.out.println(year+"�� "+month+"�� "+day+"��");
	}
}

public class Cons04 {
	public static void main(String[] args) {
		MyDate04 create1=new MyDate04();
		create1.pr();
	}
}
