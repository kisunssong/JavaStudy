package overriding.person;

/*
 * �����͸� �ٸ� Ŭ�������� �����ִ� Ŭ������ �θ�Ŭ������� �մϴ�.
 * ����� ����� �� �����͸� �����޴� Ŭ�������� �θ�Ŭ������ �������,
 * �޼��尡 ��ӵ˴ϴ�.
 * ��. �����ڴ� ��ӵ��� �ʽ��ϴ�.
 */

public class Person {
	
	String name;
	int age;
	String gender; //������ �߰����ָ� �� �������� ���� ������ �޾ƿ´�.
	
	String info() {
		return "�̸�: " + name + ", ����: " + age;
	}
//	void info() {
//		System.out.println("�̸�: " + name + ", ����: " + age);
//	}

}
