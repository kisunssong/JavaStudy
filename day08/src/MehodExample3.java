import java.util.Scanner;

/*
 * ��ȯ ����(return type)
 * 
 * 1. ��ȯ���� �޼��带 ȣ���� ������ �޼����� ���� ���� �����
 * �����ϴ� ���Դϴ�.
 * 2. �Ű������� ���� �� ������ �� ������ ��ȯ���� ���� �ϳ����� �մϴ�.
 * 3. return�̶�� Ű���带 ����Ͽ� return�ڿ� ������ ���� �����մϴ�.
 * 4. ������ ���� ������ Ÿ���� ��ȯ�����̶�� �ϸ� �޼��带 ������ ��
 * �޼��� �̸� �տ� ��ȯ������ ����ؾ� �մϴ�.
 * 5. ��ȯ���� �ִ� �޼���� ȣ�⹮�� �ϳ��� ���� �Ǳ� ������ ��ȯ�� ����
 * �ٸ������� ������ ���� �ְ�, �ٸ� �޼����� �Ű������� ����� ����
 * �ֽ��ϴ�.
 * 6. ��� �޼��尡 ��ȯ���� �ʿ��� ���� �ƴմϴ�. �޼��� ���� ���Ŀ� 
 * ��ȯ�� ���� ���ٸ� return�� ������� �ʾƵ� �˴ϴ�.
 * 7. �� ���� ��ȯ������ ����ÿ� ����θ� �ȵǰ� �ݵ�� void�� ������� �մϴ�.
 * 8. ��� �޼���� return Ű���带 ������ ������ ����˴ϴ�.
 * ���� return�� ���Ͽ� �ڵ带 �ۼ��� �� �����ϴ�.
 */

public class MehodExample3 {
	
	public static int add(int n1, int n2) {
		
		return n1 + n2;
	}
	
	public static int[] totalOperate(int n1, int n2){
		
		int[] total = {n1+n2, n1-n2, n1*n2, n1/n2};
		return total;
	}
	
	public static void callMyName(String name) {
		if(name.length() < 2) {
			System.out.println("�̸��� 2���� �̻����� �Է��ϼ���!");
			return; // �Լ��� ���� ���� ���Ѷ�!!
		}
		
		System.out.println("�� �̸��� " + name + "�Դϴ�!!");
	}

	public static void main(String[] args) {
		
		int r = add(3, 5);
		System.out.println(r);
		
		int r2 = add(add(4, 6), add(8, 7));
		
		int[] tot = totalOperate(30,5);
		System.out.println("30 + 5  =" + tot[0]);
		System.out.println("30 - 5  =" + tot[1]);
		System.out.println("30 * 5  =" + tot[2]);
		System.out.println("30 / 5  =" + tot[3]);
		
		//��ȯ���� ���� �޼���� �ݵ�� �ܵ�ȣ���ؾ� �մϴ�.
		//������ �����ϰų� �ٸ� �޼����� �Ű������� ����� �� �����ϴ�.
		callMyName("��ö��");
//		int a = callMyName("�ڿ���"); // (X) ��ȯ���̾�� �ٸ��������ȵ�
		
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		callMyName(name);
		
		sc.close();
	}

}
