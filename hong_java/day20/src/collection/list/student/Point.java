package collection.list.student;

import java.util.*;

public class Point extends Student{
	static final String Name = "����";
	final String  abc = "����";
	static double totavg;
	static int a = 2;
	public static Scanner sc = new Scanner(System.in);
	
	public static void showPointUI() {
		System.out.println("               *** ����ǥ ***");
		System.out.println("================================================");
		System.out.println("�й�        �̸�     ����     ����      ����   ����     ���        ����");
		System.out.println("================================================");
	}
	
	// �л��� ���������� �Է��� �޼���
	// 1.�л��� ��ü�� 1�� ����
	// 2.�л��� ��ü�� �Ӽ����� �����ϴ� �޼������ ȣ��
	// 3.���������� �Ϸ�� ��ü�� ����Ʈ�� �߰�
	// 4.����Ϸ� �޼����� ���
	public static void inputPoints(List<Student> students) {
		Student stu = new Student();			
		stu.inputStuInfo();
		stu.calcTotAvgGrade();
		students.add(stu);
		System.out.println(stu.getName() + "�� ������ �Ϸ�Ǿ����ϴ�.");
		totavg += stu.getTot();
		}	

	// ��ü �л����� ���������� ����� �޼���
	// ����Ʈ �ȿ� ����ִ� �л���ü���� ������ �ݺ����� ���� ��ü ���
	// �츮���� ��ü����� ���� �Ʒ��κп� ���
	public static void showAllPoints(List<Student> students) {
		showPointUI();
		for(int i = 0; i < students.size(); i++) {
			Student n = students.get(i);
				n.outputStuInfo();
			
		}
		System.out.printf("�츮�� ��ü ����� %.2f �� �Դϴ�.",totavg/students.size());
	}
	// �ش� �й��� ��ġ�ϴ� �л���ü�� ����Ʈ���� ã�Ƴ��� �� �л��� ������ ���
	// ã�� �й��� ������ �˻����� ���ߴٴ� �޼����� ���
	public static void searchPoints(List<Student> students) {
		System.out.printf("�й��� �Է��ϼ���: ");
		String search = sc.nextLine();
		boolean check = false;
		for(int i = 0; i < students.size(); i++) {
			Student n = students.get(i);				
			if(n.getStuId().equals(search)) {
				Point.showPointUI();
				n.outputStuInfo();
				check = false;
				break;
				
			}
			check = true;
		}
		if(check) {
			System.out.println(search + " �й� �� �����ϴ�.");
		}
	}
	
	// �л��� ���������� ������ �޼���.
	public static void modifyPoints(List<Student> students) {
		System.out.printf("������ �й��� �Է��ϼ���: ");
		String search = sc.nextLine();
		
		for(int i = 0; i < students.size(); i++) {
			Student num = students.get(i);
			if(num.getStuId().equals(search)) {
				System.out.println("[1]�й�, [2]�̸�, [3]��������, [4]��������, [5]��������, [6]���");
				System.out.printf("������ ��ȣ�� �Է����ּ���: ");				
				char c = sc.nextLine().charAt(0);
				switch(c) {
					case '1':
						while(true) {
						System.out.println("�й� ������ �����մϴ�.");
						System.out.println("���� �й�: " + num.getStuId());
						System.out.printf("���� �� �й�: ");
						try {
						String n = sc.nextLine();
						int a = Integer.parseInt(n);
						num.setStuId(n);					
						System.out.println(num.getStuId()+" �й����� ���� �Ǿ����ϴ�.");
						Point.showPointUI();
						num.outputStuInfo();
						}catch (Exception e) {
							System.out.println("�Է��� ���ڷθ� ���ּ���");
							sc.nextLine();
						}
						break;
						}
						break;
					case '2':
						while(true) {
						try {
						boolean check = false;
						System.out.println("�̸� ������ �����մϴ�.");
						System.out.println("���� �̸�: " + num.getName());
						System.out.printf("���� �� �̸�: ");
						Scanner scan = new Scanner(System.in);
						String search1 = scan.nextLine();
						num.setName(search1);
						int b = Integer.parseInt(search1);
						check = true;
							if(check) { 
								System.out.println("���� �θ� �Է����ּ���.");				
							}		
							}catch (Exception e){				
								System.out.println(num.getName() + "�̸����� ���� �Ǿ����ϴ�.");
								Point.showPointUI();
								num.outputStuInfo();
							}
							break;
						}
						break;
					case '3':
						while(true) {
						try {
						System.out.println("���� ���� ������ �����մϴ�.");
						System.out.println("���� ���� ����: " + num.getKor());
						System.out.printf("���� �� ���� ����: ");
						num.setKor(sc.nextInt());
						System.out.println(num.getKor() + "������ ���� �Ǿ����ϴ�.");
						num.calcTotAvgGrade();
						Point.showPointUI();
						num.outputStuInfo();						
							}catch (Exception e) {
								System.out.println("�Է��� ���ڷθ� ���ּ���");
							}
							break;
						}
						break;
					case '4':
						while(true) {
							try {
						System.out.println("���� ���� ������ �����մϴ�.");
						System.out.println("���� ���� ����: " + num.getEng());
						System.out.printf("���� �� ���� ����: ");
						num.setEng(sc.nextInt());
						System.out.println(num.getEng() + "������ ���� �Ǿ����ϴ�.");
						num.calcTotAvgGrade();
						num.outputStuInfo();
						Point.showPointUI();
							}catch (Exception e) {
								System.out.println("�Է��� ���ڷθ� ���ּ���");
							}
							break;
						}
						break;
					case '5':
						while(true) {
							try {
						System.out.println("���� ���� ������ �����մϴ�.");
						System.out.println("���� ���� ����: " + num.getMath());
						System.out.printf("���� �� ���� ����: ");
						num.setMath(sc.nextInt());
						System.out.println(num.getMath() + "������ ���� �Ǿ����ϴ�.");
						num.calcTotAvgGrade();
						Point.showPointUI();
						num.outputStuInfo();				
							}catch (Exception e) {
								System.out.println("�Է��� ���ڷθ� ���ּ���");
							}
							break;
						}
						break;	
					default:
						System.out.println("���� ������ ����մϴ�.");
				}					
			}
		}	
	}
	public static void deletePoint(List<Student> students) {
		System.out.printf("������ �й��� �Է��ϼ���: ");
		String del = sc.nextLine();
		boolean check = false;
		for(int i = 0; i < students.size(); i++) {
			Student n = students.get(i);
			if(n.getStuId().equals(del)) {
				System.out.println(n.getName() + " ���� ������ �����Ͻðڽ��ϱ�?[Y/N]");
				System.out.printf("=> ");
				String choose = sc.nextLine();
				choose.toLowerCase();
				char c = choose.charAt(0);
				if(c == 'Y') {
					students.remove(n);
					totavg -= n.getTot();
					System.out.println(n.getName() + " ���� ���� �Ͽ����ϴ�.");
					check = false;
					break;
				}else if(c == 'N') {
					System.out.println("������ ����մϴ�.");
					check = false;
					break;
				}				
			}
			check = true;			
		}
		if(check) {
			System.out.println(del + " �й� �л��� �����ϴ�.");
		}
		
	}
	// ���α׷� �޴������� ������ �޼���.
	public static void menuInfo() {
		System.out.println("\n*** �������� ���α׷� ***");
		System.out.println("1. �������� �Է�");
		System.out.println("2. ��ü���� ��ȸ");
		System.out.println("3. �������� ��ȸ");
		System.out.println("4. �������� ����");
		System.out.println("5. �������� ����");
		System.out.println("6. ���α׷� ����");
		System.out.println("********************");
	}
}
