/*
 * 1. �޼���� ����(����)�ϴ� ������ ȣ���ϴ� ������ �ֽ��ϴ�.
 * 2. �޼��� ������ �޼��� ���ο����� �� �� �����ϴ�. �ݵ�� �޼��� ���
 * �ܺο����� ������ �����մϴ�. Ŭ���� ���ζ�� � ��ġ�� ������ �����մϴ�.
 * 3. �޼��� ���ο����� �ٸ� �޼����� ȣ�⸸ �����մϴ�.
 * 4. ȣ���ϴ� ������ �޼��带 ����ϴ� �����̸� �ش� �޼��尡 �ʿ�� �ϴ�
 * ������(�Ű���)�� �޼��� ���η� �����ϸ鼭 �ش� �޼���� �Ű����� ���� 
 * ó���� ������� ȣ��η� �ٽ� ��ȯ���ݴϴ�.
 */


public class MehodExample1 {
	
	public static int calcSum(int x) {
		
		int sum = 0;
		for (int i=1; i<=x; i++) {
			sum += i;		
	}
	return sum;
}
	public static int calcSum2(int begin, int end) {
		
		int sum = 0;
		for (int i=begin; i<=end; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("1~10���� ������: " + calcSum(10));
		System.out.println("1~20���� ������: " + calcSum(20));
		
		int result = calcSum(50); //�Լ��� ȣ��!
		System.out.println(result);
		System.out.println("4~7���� ������: " + calcSum2(4, 7));
		}
}
