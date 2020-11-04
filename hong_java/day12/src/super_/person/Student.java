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
		this("이름없음", 1, "학번없음");
	}
	
	String info() {
		return super.info() + ", 학번: " + stuID;
	}
}
