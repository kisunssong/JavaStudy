import java.util.Scanner;

public class Hong_IfExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		System.out.printf("> ");
		int point = sc.nextInt();
		
		if(point >= 90) {   //ù��° �˻�.. false�� elif���ǹ� ���� �˻�
			if(point > 100) {   //ù��° �˻� ture�� ������, ���⼭ false�� elifȮ��
				System.out.println("������ �߸� �Է��߽��ϴ�.");
			} else if (point >= 95) {
				System.out.println("����� ������ A+�Դϴ�..");				
			} else {
				System.out.println("����� ������ A�Դϴ�.");
			}
		} else if (point >= 80) {
			System.out.println("����� ������ B�Դϴ�.");
			
		} else if (point >= 70) {
			System.out.println("����� ������ C�Դϴ�.");
			
		} else if (point >= 60) {
			System.out.println("����� ������ D�Դϴ�.");
			System.out.println("����� ����� ����Դϴ�.");
			
		} else {
			System.out.println("����� ������ F�Դϴ�.");
			System.out.println("����� ����� ����Դϴ�.");
			
		}
		sc.close();
	}

}
