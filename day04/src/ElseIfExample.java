import java.util.Scanner;

public class ElseIfExample {
	public static void main(String[] args) {
		//else if (���ǽ�) - ���� �б�(����) ���� ����.
		//Ƚ���� ���� ����, ���� �������� �� else�� �پ�� ������		
		//������ �ۼ����� �ʾƵ� ��
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = scan.nextInt();
		if(num%2 == 0) {
			System.out.println("2�� ��� �Դϴ�.");
		}else if(num%3 == 0) {
			System.out.println("3�� ��� �Դϴ�.");
		}else if(num%5 == 0) {
			System.out.println("5�� ��� �Դϴ�.");
		}
		scan.close();
	}
}
