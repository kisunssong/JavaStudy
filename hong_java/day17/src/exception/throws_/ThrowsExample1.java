package exception.throws_;

public class ThrowsExample1 {
	
	public static String[] greetings = {"�ȳ�", "���Ͽ�", "���" };
	
	public static void main(String[] args) {
		
		
		/*
		 * throws�� �پ��ִ� �޼��峪 �����ڸ� ȣ���� ����
		 * �ݵ�� try ��� ���ο��� ȣ���Ͽ� ����ó���� �����ؾ� �մϴ�.
		 * �Ǵ� �Ǵٽ� throws�Ͽ� ����ó���� �ٽ� �ѹ� ���ѱ� �� �ֽ��ϴ�.
		 */
		try {
			greet(3);
		} catch (Exception e) {
			/*
			 * printStackTrace()�� ���ܹ߻� ��θ� �����ϴ�
			 * �޽����� ��� ���ݴϴ�.
			 * �ַ� ���߰������� ������ ������ ã�� �� �����ϰ� ����մϴ�.
			 */
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����");
	}
	
	/*
	 * ������ ������ �޼��� ����ΰ� �ƴ� ȣ��ο� ���� ���
	 * ����ó���� �޼��� ȣ���ڿ��� ���ѱ�� ����� throws��� �մϴ�.
	 * �޼��峪 ������ ȣ�� �� ����ó���� �����ϰ� ���� �� ����մϴ�.
	 */
	
	public static void greet(int index) throws Exception {
			System.out.println(greetings[index]);
	}
}
