package encap.goodcase;

public class MyBirth {
	
	
	/*
	 * ����(ĸ��ȭ)�� ����Ϸ��� ������ ������ ������ ���������
	 * �տ� private���Ѵٸ� ���Դϴ�.
	 */
	
	private int year;
	private int month;
	private int day;
	
	/*
	 - ������ ��������� �����ϱ� ���ؼ���
	 Ŭ���� �����ڰ� �̸� ����� ���� setter/getter�޼��带 
	 ����Ͽ� �����Ϳ� �����ؾ� �մϴ�.
	 
	 - setter�޼��� ����.
	 1. setter�޼���� ���к����� ���� �����Ű�� ���� �޼����Դϴ�.
	 2. �޼����� ���������ڸ� public���� �����Ͽ� �̸��� �Ϲ�������
	 set + ��������̸����� �����մϴ�.
	 */
	
	
	/*
	 - getter �޼��� ����.
	 1. getter�޼���� ���к����� ���� �� �� ����ϴ� �޼����Դϴ�.
	 2. setter�� ���������� public�������� �ܺο� �޼��带 �����ϰ�
	 �̸��� �Ϲ������� get + ��������̸����� �����մϴ�.
	 */
	
	public void setYear(int year) {
		if(year < 0 || year > 3000) {  
			System.out.println("�߸��� �⵵ �Դϴ�.");
		}else { 
			this.year = year;
		}		
	}
	
	public int getYear() {
		return this.year;
	}
		
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("�߸��� �� �Դϴ�");
		}else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setDay(int day) {
		if (day < 1 || day > 31) { 
			System.out.println("�߸��� �ϼ� �Է��Դϴ�.");
		}else {
			this.day = day;
		}
	}
	
		public int getDay() {
			return this.day;
		}	
		
	public void info() {
		System.out.printf("%d�⵵ %d�� %d�� �Դϴ�.", getYear(),getMonth(),getDay());
	}
		

}




