import java.util.Scanner;

public class Hong_SwitchExample1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����: ");
		int point = scan.nextInt();
		
		/*
		 * switchŰ���� �ڿ� ������ ������ �������
		 * ������� �ݵ�� ���ڳ� ����Ÿ���̾�� �մϴ�.
		 */
		
		switch(point/10) {
		
		//case�ڿ��� �ݵ�� ����� ����� �մϴ�.
		case 10:
		case 9:
			if(point > 100) {
				System.out.println("������ �߸� �Է��߽��ϴ�.");
			}else {
				System.out.println("����� ������ A�Դϴ�.");
			}
			break; //switch����� ������
		case 8:
			System.out.println("����� ������ B�Դϴ�.");
			break; //switch����� ������
		case 7:
			System.out.println("����� ������ C�Դϴ�.");
			break; //switch����� ������
		case 6:
			System.out.println("����� ������ D�Դϴ�.");
			break; //switch����� ������
		default:
			System.out.println("����� ������ F�Դϴ�.");
		}
		scan.close();
	}

}
