package poly.instanceof_;


public class Person {
	
	String name;
	int age;
	String gender; //성별을 추가해주면 그 하위단은 전부 성별을 받아온다.
	
	//생성자 선언
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
		this("이름없음", 1);
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
//	void info() {
//		System.out.println("이름: " + name + ", 나이: " + age);
//	}

}
