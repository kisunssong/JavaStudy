//scanner ���
import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		String word = scan.nextLine();
		System.out.printf("�Է��Ͻ� ���� : %s\n", word);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		System.out.printf("�Է��Ͻ� ���� : %d\n", num);
		scan.close(); // ScannerŸ���� ����ϰԵǸ� �ڿ������� �׻� �����ְԵǼ� �ݾ������
		
		
		
	}

}
