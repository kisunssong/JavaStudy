package exception.multi;

import java.util.Scanner;
// ������ ����
// �޼��� ���ο����� ��밡�� 
// Ŭ���� ���ο��� ���������� ��� �Ұ���
public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.printf("1��° ������: ");
			String data1 = scan.next();
			System.out.printf("2��° ������: ");
			String data2 = scan.next();
			
			//NumberFormat �߻� ����!
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			
			//Arithmetic �߻� ����!
			int result = val1 / val2;
			System.out.println(val1 + "/" + val2 + "=" + result);
			
			//� �������� �𸣴� Exceptionó���� catch �� ���ڸ��� ��ġ
			String str = null;
			str.charAt(0);
			
			//ExceptionŬ������ ��� ���ܸ� �ϰ�ó���� �� �ֽ��ϴ�.
		} catch (NumberFormatException e) {			
			System.out.println("���ڸ� �־��ּ���.");
		} catch (ArithmeticException e) {			
			System.out.println("0����  ���� �� �����ϴ�.");
			 //ExceptionŬ������ ���ó���� �ޱ⶧���� catch���ڸ��� ������ �ȵȴ�.
		} catch (Exception e) { 
			System.out.println("�� �� ���� ���� �߻�!");
			System.out.println("Ȯ�� �� �ż��� ó���ϰڽ��ϴ�.");
		} finally {
			scan.close();
		}
		System.out.println("���α׷� ���� ����!");
	}
}
