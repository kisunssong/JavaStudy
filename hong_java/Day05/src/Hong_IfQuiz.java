import java.util.Scanner;


//���� ������ �Է¹޾Ƽ� �� ���� Ȧ�����..
//x�� Ȧ���Դϴ�.
//���� ������ �Է¹޾Ƽ� �� ���� ¦�����..
//x�� ¦���Դϴ�.
//0�� �߸��� ���� �Դϴ�.
//����ϼ���!!
public class Hong_IfQuiz {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		int a = scan.nextInt();
		if ( a==0 ) { //true�� �Ǿ������ �Ʒ���� �� �ٷ� �� elifȮ�ξ���
			System.out.println("0�� �߸� �� ���� �Դϴ�."); 
		} else if ( a%2==0 ) {
			System.out.println(a + "�� ¦���Դϴ�.");
		} else {
			System.out.println(a + "�� Ȧ���Դϴ�.");
		}
		scan.close();
	}

}
