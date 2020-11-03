package api.lang.system;

public class SystemTime {

	public static void main(String[] args) {
		
		/*
		 * currentTimeMillis()�� nanoTime() �޼����
		 * 1970�� 1�� 1�� �������� ��������� �ð��� �ʷ� ��ȯ��
		 * �����ð��� ���� longŸ���� �и���(1/1000)
		 * ������(1/10^9)�� �����մϴ�.
		 */
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(long i=1; i<=10000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("��꿡 �ҿ�� �ð�: " + (end-start) * 0.001 + "��");

	}
}
