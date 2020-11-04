package overriding.person;

/*
 * 데이터를 다른 클래스에게 물려주는 클래스를 부모클래스라고 합니다.
 * 상속을 사용할 시 데이터를 물려받는 클래스에게 부모클래스의 멤버변수,
 * 메서드가 상속됩니다.
 * 단. 생성자는 상속되지 않습니다.
 */

public class Person {
	
	String name;
	int age;
	String gender; //성별을 추가해주면 그 하위단은 전부 성별을 받아온다.
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
//	void info() {
//		System.out.println("이름: " + name + ", 나이: " + age);
//	}

}
