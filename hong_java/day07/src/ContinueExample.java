
public class ContinueExample {
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			//continue�� 5�� ��¾��ϰ� i++�ؼ� ��� �����Ѵ�
			if(i==5) {
				continue;
			}
			System.out.printf(i + " ");
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			//�� ¦���� ���� ����... Ȧ���� ���
			if(i % 2 == 0) continue;
			System.out.printf(i + " ");
		}
	}

}
