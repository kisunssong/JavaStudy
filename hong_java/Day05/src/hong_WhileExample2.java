import java.util.Scanner;

public class hong_WhileExample2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		
		int n = scan.nextInt();
		
		int i = 2;
		while(n % i != 0) {
			i++;
		}
		
		if(n==i) {
			System.out.println(n + "��(��) �Ҽ� �Դϴ�.");
		}else {
			System.out.println(n + "��(��) �Ҽ��� �ƴմϴ�.");
		}
		scan.close();
	}

}
