package day04;

public class Hong_Test {
	
	public static void main(String[] args) {
		
		//-4 ~ 5 ������ ���� �������� �߻�.
		// Math.random: 0.0 - 1.0 ���� ��������
		// �⺻ Ÿ����: double
		// ()��������ϰ� *���ϱ� 10, int������ ������ 0 - 9���, 5 - �ϸ��
		int r = 5 - (int)(Math.random()*10);
		System.out.println("������: " + r);
		
		// ()���� ���, r�������� <= 0, ? r(true) : -r(false)�϶� abs�� ����
		int abs = (r >= 0) ? r : -r;
		System.out.println( r + "�� ���밪��: " + abs);
	}

}
