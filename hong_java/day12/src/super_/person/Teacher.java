package super_.person;

public class Teacher extends Person {
	
	String subject;
	
	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	String info() {
		return super.info() + ", subject";
	}
}
