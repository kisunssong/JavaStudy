package inherit.goodcase;

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
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person() {
		
	}
	
	String info() {
		return "�̸�: " + name + ", ����: " + age;
	}
//	void info() {
//		System.out.println("�̸�: " + name + ", ����: " + age);
//	}

}
