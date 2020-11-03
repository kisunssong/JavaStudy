package overriding.person;

public class MainClass {

	public static void main(String[] args) {
		
		Person song = new Person();
		song.name = "홍길동";
		song.age = 45;
		System.out.println(song.info());
		
		
		Student lee = new Student();
		lee.stuID = "2018110033"; 
		lee.name = "이순신"; //Person상속 //오버라이딩
		lee.age = 23; //Person상속 //오버라이딩
		lee.gender = "남자";
		System.out.println(lee.info());
		
		Teacher kim = new Teacher();
		kim.subject = "수학"; 
		kim.name = "강감찬"; //Person상속 //오버라이딩
		kim.age = 40; //Person상속 //오버라이딩
		kim.gender = "남자";
		System.out.println(kim.info());
		
		Employee shin = new Employee();
		shin.department = "구매부"; 
		shin.name = "신사임당"; //Person상속 //오버라이딩
		shin.age = 48; //Person상속 //오버라이딩
		shin.gender = "여자";
		System.out.println(shin.info());
	}

}
