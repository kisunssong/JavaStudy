package exception.runtime;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExample {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Animal da = d;
		d = (Dog)da;
		System.out.println("타입 변환 성공!Animal -> Dog");
		
		// Cat -> Animal (c변수로)타입 변환
		Animal c = new Cat(); 
		// Cat -> Dog 타입 변환 에러는 안나오는데 (c변수가 Animal가면써서)이거 에러임
		Dog d2 = (Dog)c; 
		System.out.println("타입변환 성공!Cat -> Dog");		
	}
}
