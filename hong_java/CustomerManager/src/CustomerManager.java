import java.util.Arrays;
import java.util.Scanner;

public class CustomerManager {
	
	//���α׷� ��ü���� ����� �������� Ŭ���� ��� �ٷ� �Ʒ��� �����մϴ�.
	//static�� ���� ��Ͽ����� static������ static�޼��常 ����� �� ����.
	
	static String[] nameList = new String[100];
	static char[] genderList = new char[100];
	static String[] emailList = new String[100];
	static int[] birthList = new int[100];
	
	
	//���� �� �����Ͱ� �� �� ����Ǿ����� �˱� ���� ���� count ����
	static int count = 0;
	
	//�迭�� �ε����� �����ϱ� ���� �ε����� ����ȭ ��Ŵ.
	//�迭�� �ε����� 0������ ����ϹǷ� �ʱⰪ�� 0�ٷ� �������� -1��
	//�����Ͽ� �ʱ⿡ next�� �������� �� �ε����� 0�̵Ǿ� ù��° ����
	//��ȸ�ϱ� ����.
	static int index = -1;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("\n[INFO] �� ��: " + count
					+ ", �ε���: " + index);
			System.out.println("�޴��� �Է��ϼ���. ");
			System.out.println("(I)nsert, (P)revious, "
					+ "(N)ext, (C)urrent, (U)pdate, "
					+ "(D)elete, (Q)uit");
			System.out.printf("�޴� �Է�: ");
			String menu = scan.next(); //�Է°��� menu�� ��
			menu = menu.toLowerCase(); //��.�ҹ��� ���о��� ��������
			char m = menu.charAt(0); //0��° �ε���, �� 0��° �ε��� �ѱ���
			
			switch(m) {
			case '��': //break�� �����ʾƼ� �ٷ� �Ǽ��� ���ĵ� i�� ������
			case 'i':
				System.out.println("�� ���� �Է��� �����մϴ�.");
				insertData();
				System.out.println("�������� ���������� �ԷµǾ����ϴ�.");
				break;
			case '��':
			case 'p':
				System.out.println("\n���� ������ �����մϴ�.");
				if(index<=0) {
					System.out.println("���� �������� �������� �ʽ��ϴ�.");
				}else {
				index--;
				printData(index);
				}
				break;
			case '��':
			case 'n':
				System.out.println("\n���� ������ �����մϴ�.");
				if(index >= count-1) {
					System.out.println("���� �������� �������� �ʽ��ϴ�.");
				}else {
				index++;
				printData(index);
				}
				break;
			case '��':
			case 'c':
				System.out.println("\n���� ���� Ȯ���� �����մϴ�.");
				if(index >= 0 && index < count) {
				printData(index);
				}else {
					System.out.println("���� �������� �������� �ʽ��ϴ�.");
				}
				break;
			case '��':
			case 'u':
				System.out.println("\n���� ������ �����մϴ�.");
				if(index >= 0 && index < count) {
				updateData(index);
				}else {
					System.out.println("���� �������� �������� �ʽ��ϴ�.");
				}
				break;
			case '��':
			case 'd':
				System.out.println("\n���� ������ �����մϴ�.");
				if(index >= 0 && index < count) {
				deleteData(index);				
				}else {
					System.out.println("���� �������� �������� �ʽ��ϴ�.");
				}
				break;
			case '��':
			case 'q':
				System.out.println("\n���α׷��� ���� �մϴ�.");
				System.exit(0); // ���α׷��� ���� �����ϰ� ����� ����
				scan.close();
				break;
			default:
				System.out.println("\n�޴��� �߸� �Է��߽��ϴ�..");
			}
		}//end while
	}//end main

	
	//�� ������ �Է¹޴� �޼��� ����
	public static void insertData() {
		
		System.out.println("===========�� ���� �Է�==========");
		System.out.printf("�̸�: ");
		String name = scan.next();
		
		System.out.printf("����(M/F): ");
		String s = scan.next();
		char gender = s.charAt(0);
		
		System.out.printf("�̸���: ");
		String email = scan.next();
		
		System.out.printf("����⵵: ");
		int birth = scan.nextInt();
		System.out.println("=========================");
		
		//index�� -1 �̱⶧���� nameList[index]�� �ϸ� �ȵ� ������
		nameList[count] = name; //nameList[0���ε���] = name ����
		genderList[count] = gender;
		emailList[count] = email;
		birthList[count] = birth;		
		count++; //���� ������ ������ count�� 1�� �÷���
	
	}
	
	//�� ������ �ε����� �°� ����ϴ� �޼��� ����.
	public static void printData(int index) {
		
		
		System.out.println("======�� ����======");
		System.out.println("�̸�: " + nameList[index]);
		System.out.println("����: " + genderList[index]);
		System.out.println("�̸���: " + emailList[index]);
		System.out.println("����⵵: " + birthList[index]);
		System.out.println("=========================");
	}
	
	//�� ������ �����ϴ� �޼��� ����..
	public static void updateData(int index) {
		
		System.out.println("=========�� ���� ����==========");
		System.out.printf("�̸�(%s): ",nameList[index]);
		nameList[index] = scan.next();
		
		System.out.printf("����(M/F)(%s): ",genderList[index]);
		genderList[index] = scan.next().charAt(0);
		
		System.out.printf("�̸���(%s): ",emailList[index]);
		emailList[index] = scan.next();
		
		System.out.printf("����⵵(%d): ",birthList[index]);
		birthList[index] = scan.nextInt();
		
		
						
		//���ο� �������� �Է¹޾� ������ �迭�� ���� �ε����� �ִ� �����͸�
		//�����Ű����. �����ÿ��� �������� �������� ��µǷη� �ϼ���.
		//ex) �̸�(ȫ�浿): ----
	}
	public static void deleteData(int index) {
		
		for(int i=index; i<count-1; i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthList[i] = birthList[i+1];			
		}
		count--;
	}
	
}//end class

