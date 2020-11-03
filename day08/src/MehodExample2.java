/*
 * �Ű� ����(parameter)
 * 
 * 1. �Ű� ������ �޼��带 ȣ���� �� ���࿡ �ʿ��� ������ �޼��� ���η�
 * �����ϱ� ���� �Ű�ü�Դϴ�.
 * 2. �޼��� ȣ��ο��� � �Ű����� �����ϴ��Ŀ� ���� �޼����� ����
 * ����� �޶����ϴ�.
 * 3. �Ű������� �� �� ���޹��� ���� �޼��带 ������ �� ����ο��� �����ؾ�
 * �մϴ�.
 * 4. �Ű������� �ϳ��� �������� ���� �� ������ �� ���� �޼��� �������
 * ()�� ����Ӵϴ�. �׸��� ȣ��ÿ��� ()�� ����� ȣ���մϴ�.
 */


public class MehodExample2 {
	
	public static void main(String[] args) {
		
		System.out.println(calcSum());
		System.out.println("�̹��� ȹ���� ����: " + randomWeapon());
		
	}
	
	public static int calcSum() {
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static String randomWeapon() {
		double d = Math.random();
		
		if(d > 0.66)
			return "�ܰ�";
		else if (d > 0.33)
			return "���";
		else
			return "������";
	}

}
