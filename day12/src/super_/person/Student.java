package super_.person;



public class Student extends Person{
	
	String stuID;
	
	Student(String name, int age, String stuID) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.stuID = stuID;
	}
	
	Student() {
		this("�̸�����", 1, "�й�����");
	}
	
	String info() {
		return super.info() + ", �й�: " + stuID;
	}
}
