import java.util.Scanner;

public class Test {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է��ϼ���: ");
		int score = scan.nextInt();
		
		if (score > 100) {
			System.out.println("�߸��� ���� �Դϴ�.");
		}else if (score == 100) {
			System.out.println("100�� ���� �Դϴ�.");
		}else if (score >= 95) {
			System.out.println("A+ ���� �Դϴ�.");
		}else if (score >= 90) {
			System.out.println("A ���� �Դϴ�.");
		}else if (score >= 85) {
			System.out.println("B+ ���� �Դϴ�.");
		}else if (score >= 80) {
			System.out.println("B ���� �Դϴ�.");
		}else if (score >= 75) {
			System.out.println("C+ ���� �Դϴ�.");
		}else if (score >= 70) {
			System.out.println("C ���� �Դϴ�.");
		}else {
			System.out.println("����� �ϼž� �մϴ�.");
		}
		scan.close();
	}
	
	
		

}
/*
��������
100�� �ʰ� : �߸��� ���� �Դϴ�.
100�� : �����Դϴ�.
~ 95�� : A+ �����Դϴ�.
~ 90 �� : A�����Դϴ�.
~ 85 �� : B+�����Դϴ�.
~ 80 �� : B�����Դϴ�.
~ 75 �� : C+�����Դϴ�.
~ 70 �� : C�����Դϴ�.
~ 0 �� : ����� ��� �Դϴ�.
*/







//public static void main(String[] args) {
//
//Scanner scan = new Scanner(System.in);
//System.out.println("������ �Է��ϼ��� : ");
//int num = scan.nextInt();
//if (num>100) {
//	System.out.println("100�� �����Դϴ�.");
//}else if (num>95) { 
//	System.out.println("A+ ���� �Դϴ�.");
//}else if (num%90==95) {
//	System.out.println("A ���� �Դϴ�.");
//}else if (num%85==90) {
//	System.out.println("B+ ���� �Դϴ�.");
//}else if (num%80==85) {
//	System.out.println("B ���� �Դϴ�.");
//}else if (num%75==80) {
//	System.out.println("C+ ���� �Դϴ�.");
//}else if (num%70==75) {
//	System.out.println("C ���� �Դϴ�.");
//}else {
//	System.out.println("����� ��� �Դϴ�.");
//}
//}