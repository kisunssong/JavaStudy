import java.util.Scanner;

public class Hong_DoWhileExample {
	
	public static void main(String[] args) {
		
		//������ �Է¹޾� 1���� �Է¹��� ���ڱ����� �������� ���ϴ� ����
		//do�� ������ ���� 1ȸ ���� ��
		//while�� ���ǰ˻� �� false�� ������ ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("����: ");
		int target = scan.nextInt(); // target�� ����ںη� ����
		int sum = 0; // ���� ��� - 0����
		int n = 1; // ���� - ���� ����
				
		do {
			sum += n; // n�������κ��� sum�� +��
			n++; // step ������
		} while (n <= target); // ���� ���� , �� - �ݺ� ����
		
//		while(n <= target) {
//			sum += n;
//			n++;
//		}
		System.out.println("1���� " + target + "������ ���� " + sum);
		
	
	scan.close();
	}

}
