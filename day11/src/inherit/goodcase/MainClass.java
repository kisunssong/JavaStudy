package inherit.goodcase;

public class MainClass {

	public static void main(String[] args) {
		
//		Person song = new Person();
//		song.name = "홍길동";
//		song.age = 45;
//		System.out.println(song.info());
		
		Person song = new Person("송기선", 34);
		System.out.println(song.info());
		
		
		Student lee = new Student();
		lee.stuID = "2018110033";
		lee.name = "이순신";
		lee.age = 23;
		lee.gender = "남자";
		System.out.println(lee.info());
		
		Teacher kim = new Teacher();
		kim.subject = "수학";
		kim.name = "강감찬";
		kim.age = 40;
		kim.gender = "남자";
//		System.out.println(kim.info());
		
		Employee shin = new Employee();
		shin.department = "구매부";
		shin.name = "신사임당";
		shin.age = 48;
		shin.gender = "여자";
//		System.out.println(shin.info());
	}

}
