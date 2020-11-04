package this_.person;



public class Student extends Person{
	
	String stuID;
	
	String info() {
		return "이름: " + name + ", 나이: " + age + ", 학번: " + stuID;
	}
}
