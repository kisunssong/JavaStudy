import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int score = scan.nextInt();
		switch (score/10) {
		case 10 :
			System.out.println("���� �Դϴ�.");
			break;
		
		case 9 :
			System.out.println("A���� �Դϴ�.");
			break;
			
		case 8 :
			System.out.println("B���� �Դϴ�.");
			break;
			
		case 7 : 
			System.out.println("C���� �Դϴ�.");
			break;
		
		default : 
			System.out.println("����� ��� �Դϴ�.");

		scan.close();
		}
	}

}
