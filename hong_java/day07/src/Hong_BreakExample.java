

public class Hong_BreakExample {
	
	public static void main(String[] args) {
		
		/*
		 * ���� ��Ʈ
		 * - ���ѷ����z �ݺ����� �ݺ�Ƚ���� ��Ȯ�� �� ��
		 * 	�ַ� ����ϸ� Ư�� �����Ͽ��� 
		 * 	�ݺ����� �����Ű�� ���·� �����մϴ�.
		 * - �ڹٿ��� ���ѷ����z �ַ� while�� ����ϸ�
		 * 	while�� ���ǽ� �ڸ��� true�� ���� ���ѷ�����
		 * 	�����˴ϴ�.
		 */
		int i = 0;
		
		while(true) {
			if(i==15) {
				break;	//�ݺ����� break�� ������ ����������		
			}
			System.out.println(i);
			i++;	
		}
	}
}