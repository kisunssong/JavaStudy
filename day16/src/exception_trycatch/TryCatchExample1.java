package exception_trycatch;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println(i * j);
		try {
			System.out.println(i / j);
			System.out.println("���� �߻��� �� �ؽ�Ʈ�� ��µ��� ����.");
		}catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}		
		System.out.println(i + j);
		System.out.println(i - j);
	}
}
