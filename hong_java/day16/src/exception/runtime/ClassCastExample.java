package exception.runtime;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExample {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Animal da = d;
		d = (Dog)da;
		System.out.println("Ÿ�� ��ȯ ����!Animal -> Dog");
		
		// Cat -> Animal (c������)Ÿ�� ��ȯ
		Animal c = new Cat(); 
		// Cat -> Dog Ÿ�� ��ȯ ������ �ȳ����µ� (c������ Animal����Ἥ)�̰� ������
		Dog d2 = (Dog)c; 
		System.out.println("Ÿ�Ժ�ȯ ����!Cat -> Dog");		
	}
}
