import java.util.Arrays;
import java.util.Scanner;

public class Hong_SwhtichQuiz {
	public static void main(String[] args) {
		
//������ �Է��ϼ���.
//[���,�븮,����,����,����]
//�����(��) ���� �����Դϴ�.
//��� : ������ 200�����Դϴ�.
//�븮 : ������ 300�����Դϴ�.
//���� : ������ 400�����Դϴ�.
//���� : ������ 500�����Դϴ�.
//���� : ������ 600�����Դϴ�.
		

		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		String[] name1 = {"���", "�븮", "����", "����", "����"};
		System.out.println(Arrays.toString(name1));
		System.out.printf("> ");
		String name = scan.nextLine();
				
//		int point = (int)(Math.random() * 6);
		
		switch(name) { //���� �Է��� name �� switch�� name�� �׿� case��
		//�� �����ϸ� ��µȴ�
		
		case "���":
			System.out.println("����� ������ 200���� �Դϴ�.");
			break;
		case "�븮":
			System.out.println("�븮�� ������ 300���� �Դϴ�.");
			break;
		case "����":
			System.out.println("������ ������ 400���� �Դϴ�.");
			break;
		case "����":
			System.out.println("������ ������ 500���� �Դϴ�.");
			break;
		case "����":
			System.out.println("������ ������ 600���� �Դϴ�.");
			break;
		default:
			System.out.println("���� ���� �Դϴ�..");
		}
		scan.close();
		
		
		
	}

}
