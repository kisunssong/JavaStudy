class MyDate03 {
	private int year;
	private int month;
	private int day;

/*
1. ������ �Ǵ� �޼���()���� ����� ������ �Ű����� �Ǵ� �������ڶ�� �Ѵ�.
2. �� �Ű������� ����Ǵ� ���� ���ڰ� �� parameter value�̴�.
*/
	MyDate03() {
		year=2019; month=11; day=2;
	}
	
/*
1.������ �����ε��̶� ���� �̸��� �����ڸ��� ������ �ߺ��ؼ� �����ϴ� ���� ����.
2. �����ڵ� �޼����� �����̱� ������ ������ �����ε� ������ ����ȴ�.
3. �������� �� �Ű������� ���� �����ڸ� �⺻�����ڶ�� �Ѵ�. �⺻�����ڴ�
�ڹ� �����Ϸ�(javac)�� ���ؼ� �⺻���� �����Ѵ�. (�ڵ�� ���������ϴ�)	
*/
	MyDate03(int new_year, int new_month, int new_day) {
		year=new_year; month=new_month; day=new_day;		
	}
	
	public void info() {
		System.out.println(year+"��"+month+"��"+day+"��");
	}
}

public class Cons03 {
	public static void main(String[] args) {
		
		MyDate03 n1=new MyDate03();
		n1.info();
		MyDate03 n2=new MyDate03(2022,12,25);
		n2.info();
	}
}
