class Animal {
	String name;
	int age;
	
	public void show() {
		System.out.println(name+"�� "+age+"�� �Դϴ�.");
	}
	Animal(String name, int age) {
		this.name=name; this.age=age;
	}
}

public class Ex13_01 {
	public static void main(String[] args) {
		
		Animal a1=new Animal("������",26);
		a1.show();
	}
}
