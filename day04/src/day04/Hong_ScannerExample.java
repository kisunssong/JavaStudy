package day04;
import java.util.Scanner;

public class Hong_ScannerExample {
	public static void main(String[] args) {
		
		//1.��ĳ�� ��ü ����
		Scanner scan = new Scanner(System.in);
		//2.��ĳ�� Ŭ������ ������ �ִ� �Է� �޼��� ����Ͽ� �����͸� �Է¹���
		System.out.println("�̸��� �Է��ϼ���: ");
		System.out.print("> ");
		
		String name = scan.next();		
		System.out.println("���̸� �Է��ϼ���: ");
		System.out.print("> ");
		
		int age = scan.nextInt();		
		System.out.println("����� �̸���" + name);
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		
		scan.close();
	}
}
