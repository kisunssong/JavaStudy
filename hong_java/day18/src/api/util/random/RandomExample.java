package api.util.random;

import java.util.Random;

public class RandomExample {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		// 0.0�̻� 1.0�̸��� �Ǽ� ������ ����.
		double d = r.nextDouble();
		System.out.println("�Ǽ� ������: " + d);
		
		// �� �������� �����ϴ� nextBoolean()
		boolean b = r.nextBoolean();
		System.out.println("�� ������: " + b);
		
		// ���� �������� �����ϴ� nextInt()
		// ���� int�� ������ �� �ִ� ��� �������� ������ �߻�.
		int i = r.nextInt();
		System.out.println("���� ������: " + i);
		
		// ���� 0�̻� 10�̸��� ������ �߻�.
		i = r.nextInt(10);
		System.out.println("0�̻� 10�̸� ������: " + i);
		
		i = r.nextInt(10) + 1;
		System.out.println("1�̻� 10�̸� ������: " + i);
		
				
		
	}

}
