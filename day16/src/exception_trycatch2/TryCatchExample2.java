package exception_trycatch2;

public class TryCatchExample2 {
	
	public static void main(String[] args) {
		
		String[] greetings = {"�ȳ�", "���", "���Ͽ�"};
		
		int i = 0;
		while(i < 4) {
			try {
			System.out.println(greetings[i]);
			} catch (Exception e) {
				System.out.println("�迭�� ���� ������ ���!");
			} finally { //try�� �ѹ��� 4���� Ȯ���ϴµ�!!�������ȳ��� �����
				System.out.println("�� ������ �׻� �����!");
			}
			i++;
		}
		System.out.println("���α׷� ���� ����");
	}
}
