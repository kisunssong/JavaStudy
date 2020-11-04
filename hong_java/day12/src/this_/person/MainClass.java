package this_.person;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person kim = new Person("김철수",25);
		System.out.println(kim.info());
//		kim.name = "김철수"; // 생성자를 넣었기때문에 할필요 없음
//		kim.age = 25; // 생성자를 넣었기때문에 할필요 없음
		
		Person park = new Person("박영희");
		System.out.println(park.info());
		
		Person noname = new Person();
		System.out.println(noname.info());
		
	}

}
