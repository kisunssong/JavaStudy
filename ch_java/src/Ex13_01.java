class Animal {
	String name;
	int age;
	
	public void show() {
		System.out.println(name+"는 "+age+"살 입니다.");
	}
	Animal(String name, int age) {
		this.name=name; this.age=age;
	}
}

public class Ex13_01 {
	public static void main(String[] args) {
		
		Animal a1=new Animal("원숭이",26);
		a1.show();
	}
}
