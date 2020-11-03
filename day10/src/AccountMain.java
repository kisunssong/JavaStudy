import java.util.Scanner;

/*
	 * 1. ��������� �������̸�(name : String),
	 * ��й�ȣ(password: int), �ܾ�(balance: int)
	 * �� �����ϼ���
	 * 2. �����ڴ� 3���� ��������� ��� �Ű������� �޾�
	 * �ʱ�ȭ�ϴ� �����ڸ� �����ϼ���.
	 * 3.�޼���� �Աݱ�� �޼���(deposit : void)
	 * ��ݱ�� �޼���(withDraw : void),
	 * �ܾ� ��ȸ��� �޼���(getBalance: int)
	 * 3������ �����ϼ���.
	 */


public class AccountMain {
	

		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���¸� ����մϴ�.");
		
		System.out.printf("�̸�: ");
		String name = scan.next();
		
		System.out.printf("��й�ȣ: ");
		int password = scan.nextInt();
		
		System.out.printf("�Աݾ�: ");
		int deposit = scan.nextInt();
		Account list = new Account(name, password, deposit);
		
		
		while(true) {

			System.out.println("�޴��� �Է��ϼ���.");		
			System.out.println("1. ���� / 2. ��� / 3. �ܾ���ȸ / 4. ����");
			System.out.printf("> ");
			
			int number = scan.nextInt();
			
			switch(number) {
			
			case(1):
				System.out.println("���� ��й�ȣ�� �Է��ϼ���");
				System.out.printf("> ");
				int p1review = scan.nextInt();
				if (p1review == list.password) {
					System.out.println("�Աݾ��� �Է��ϼ���.");
					System.out.printf("> ");
					int depositmoney = scan.nextInt();
					list.deposit (depositmoney);
					System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					break;
				}
				
			case(2):
				System.out.println("���� ��й�ȣ�� �Է��ϼ���");
				System.out.printf("> ");
				int p2review = scan.nextInt();
				if (p2review == list.password) {
					System.out.println("��ݾ��� �Է��ϼ���.");
					System.out.printf("> ");
					int withDraw = scan.nextInt();
					if(withDraw > list.getBalance()) {
						System.out.println("�ܾ��� �����մϴ�.");
						break;
					}else {
						list.withDraw(withDraw);
						System.out.printf("%d�� ����� �Ϸ�Ǿ����ϴ�.%n", withDraw);
						System.out.printf("���� �ܾ��� %d�� �Դϴ�.", list.getBalance());
						break;
					}
					
			}else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				break;
			}
			
			case(3):
				System.out.println("���� ��й�ȣ�� �Է��ϼ���");
				System.out.printf("> ");
				int p3review = scan.nextInt();
				if (p3review == list.password) {
					System.out.printf("%s���� ���� �ܾ��� %d�� �Դϴ�.%n", list.name, list.getBalance());
					break;
				}else {
					
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					break;
				}
				
			case(4):		
				scan.close();
				System.exit(0);
				break;
			}
		}
		
	}
	
}

