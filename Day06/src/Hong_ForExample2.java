
public class Hong_ForExample2 {
	
	public static void main(String[] args) {
		
		//7~100������ ���� �� 7�� ����� ��� ���η� ���
		for(int i=7; i < 101; i+=7) {
			System.out.printf(i + " ");			
		}
		
		System.out.println("\n------------------------");
		
		//1~100������ ���� �� 6�� ����� ��� ���η� ���
		//�ؿ� i������ �� ����Ҽ��ִ� ������ ���� for�� {} ������ ���� �޸𸮿��� ������.
		for (int i=1; i<=100; i++) {
			if (i % 6 == 0) {
				System.out.printf(i + " ");
			}
		}
		System.out.println("\n-------------------------");
		
		//1 - 100 ������ ���� �� 8�� ��� �̸鼭 ���ÿ� 
		//16�� ����� �ƴ� ���� ��� ���η� ���
		for (int i=1; i<100; i++) {
			if ( i%8==0 && i%16!=0 ) {
				System.out.printf(i + " ");
			}			
		}
		System.out.println("\n-------------------------");
		
		//1~850������ ���� �� 9�� ����� ������ ����ϼ���.
		
		int sum = 0;
		int n = 0;
		for (int i=1; i<850; i++) {
			if ( i%9 == 0 ) {
				sum += n++;
			}
		}
		System.out.println(n);
		
		//hong�亯		
		int count = 0; //������ �� �ۿ����ؾߵ�.. for���ȿ������� 0���� ���� ����
		for (int i=1; i<=850; i++) {
			if (i % 9 == 0) {
				count++;
			}
		}
		System.out.println("9�� ����� ����: " + count + "��");
	}	
}
