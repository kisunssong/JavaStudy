package str_equals;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * ���� Ŭ���� �ȿ��� ������ ���ڿ��� ���� �����ϴ� ��������
		 * String��ü�� ������ �� ���� �ּҰ��� �����ϰ� �˴ϴ�.
		 */
		
		String s1 = "ȫ�浿";
		String s2 = "ȫ�浿";
		System.out.println(s1 == s2);
		
		
		Scanner scan = new Scanner(System.in);
		User u = new User("abc1234");
		System.out.printf("��й�ȣ�� �Է�: ");
		String password = scan.next();

		
//		if(password == u.pw) { // ==�� �ּҸ��� ���Ѵ�.
		if(password.equals(u.pw)) { // equals(�񱳴��)�� �ؾ� ���� ��Ȯ�� ��	
			System.out.println("��й�ȣ�� ��ġ �մϴ�.");
		}else {
			System.out.println("��й�ȣ�� ��ġ ���� �ʽ��ϴ�.");
		}
		scan.close();
	}

}
