import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		//if(���ǽ�){ }else{ }
		//true�� if ��� ��, false�� else ��� ���� ���� ����
		//if�� ���°͵� ������ ����.
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("2�� ��� �Դϴ�.");
		}else {
			System.out.println("2�� ����� �ƴմϴ�.");
		}
		scan.close();
	}

}
