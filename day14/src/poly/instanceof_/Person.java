package poly.instanceof_;


public class Person {
	
	String name;
	int age;
	String gender; //������ �߰����ָ� �� �������� ���� ������ �޾ƿ´�.
	
	//������ ����
	Person(String name, int age) {
		this.name = name;
		this.age = age;
//		System.out.println(this.info());
	}
	
	Person(String name) {
		this(name, 1);
//		name = aname;
//		age = 1;
	}
	
	Person(){
		this("�̸�����", 1);
	}
	
	String info() {
		return "�̸�: " + name + ", ����: " + age;
	}
//	void info() {
//		System.out.println("�̸�: " + name + ", ����: " + age);
//	}

}
