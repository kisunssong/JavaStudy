package exception.runtime;

public class NumberFormat {

	public static void main(String[] args) {
		
		//���ڿ��� ��ġ��ȯ
		String a = "15";
		String b = "13";
		
		System.out.println(a + b);
		
		//Str -> int��ȯ
		//Integer.parseInt(���ڿ�)
		int i = Integer.parseInt(a); // ���ڿ��� ������ ��ȯ
		int j = Integer.parseInt(b); // ���ڿ��� ������ ��ȯ
		System.out.println(i + j);
		
		//parseInt�� ���ڿ����ο� ������ ������ ����־�߸�
		//��ȯ�� �����ϸ� �������� �ƴ� ��� NumberFormatException �� �߻�
		String str = "test";
		System.out.println(Integer.parseInt(str));
	}
}
