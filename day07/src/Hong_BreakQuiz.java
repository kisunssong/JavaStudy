import java.util.Scanner;

public class Hong_BreakQuiz {

	public static void main(String[] args) {

		/*
		 * 1. �� ���� ���ϱ⸦ ���ߴ� ������ ����������
		 * �����ϴ� ���α׷��Դϴ�.
		 * 2. 2������ ������ 1~100������ ������ �߻�����
		 * ���������� ������ ������ �� ������ ���߸�
		 * 3. 27 + 84 =?
		 * [������ �׸� Ǫ�÷��� 0�� �Է��ϼ���.]
		 */

			Scanner sc = new Scanner(System.in);
		int count1 = 0; //�ݺ��� �ȿ� ������ ���� ��� �ʱ�ȭ�� // �׷��������λ�
		int count2 = 0; //�ݺ��� �ȿ� ������ ���� ��� �ʱ�ȭ��// �׷��������λ�

		while(true) {
			int a = (int)(Math.random() * 100+1); //�����ۼ�
			int b = (int)(Math.random() * 100+1); //�����ۼ�
			System.out.println("------------------");
			System.out.printf("%d + %d = ?\n",a,b);
			System.out.printf("[������ �׸� Ǫ�÷��� 0�� �Է��ϼ���.]\n");
			System.out.printf("> ");
			int num = sc.nextInt(); //���� �پ��� �ǹؿ� �ۼ�
			
			if (num==0) { //Ż�⹮�� �����־���Ѵ�.else�ؿ� ������ else��¹���������
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("==========================");
				System.out.printf("���� Ƚ��: %d ȸ\n", count1); //�ݺ����ۿ� �� ������
				System.out.printf("Ʋ�� Ƚ��: %d ȸ\n", count2); //�ݺ����ۿ� �� ������
				break;
			}			
			if (num==a+b) {
				count1++; //ture�� +1
				System.out.println("�����Դϴ�!!");
			}else {
				count2++; //false�� +1
				System.out.println("Ʋ�ȴµ���??");
			}
		}
		sc.close();
	}
}



