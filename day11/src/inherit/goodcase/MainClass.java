package inherit.goodcase;

public class MainClass {

	public static void main(String[] args) {
		
//		Person song = new Person();
//		song.name = "ȫ�浿";
//		song.age = 45;
//		System.out.println(song.info());
		
		Person song = new Person("�۱⼱", 34);
		System.out.println(song.info());
		
		
		Student lee = new Student();
		lee.stuID = "2018110033";
		lee.name = "�̼���";
		lee.age = 23;
		lee.gender = "����";
		System.out.println(lee.info());
		
		Teacher kim = new Teacher();
		kim.subject = "����";
		kim.name = "������";
		kim.age = 40;
		kim.gender = "����";
//		System.out.println(kim.info());
		
		Employee shin = new Employee();
		shin.department = "���ź�";
		shin.name = "�Ż��Ӵ�";
		shin.age = 48;
		shin.gender = "����";
//		System.out.println(shin.info());
	}

}
