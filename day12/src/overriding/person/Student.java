package overriding.person;

/*
 * 다른 클래스부터 멤버변수와 메서드를 물려받는 클래스를
 * 자식 클래스라고 부릅니다.
 * 자식 클래스의 이름 뒤에 extends라는 키워드를 쓰고
 * 물려받을 클래스의 이름을 써줍니다.
 */

public class Student extends Person{
	
	String stuID;
	
	String info() {
		return "이름: " + name + ", 나이: " + age + ", 학번: " + stuID;
	}
}
