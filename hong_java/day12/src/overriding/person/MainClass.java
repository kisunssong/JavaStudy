package overriding.person;

public class MainClass {

	public static void main(String[] args) {
		
		Person song = new Person();
		song.name = "ȫ�浿";
		song.age = 45;
		System.out.println(song.info());
		
		
		Student lee = new Student();
		lee.stuID = "2018110033"; 
		lee.name = "�̼���"; //Person��� //�������̵�
		lee.age = 23; //Person��� //�������̵�
		lee.gender = "����";
		System.out.println(lee.info());
		
		Teacher kim = new Teacher();
		kim.subject = "����"; 
		kim.name = "������"; //Person��� //�������̵�
		kim.age = 40; //Person��� //�������̵�
		kim.gender = "����";
		System.out.println(kim.info());
		
		Employee shin = new Employee();
		shin.department = "���ź�"; 
		shin.name = "�Ż��Ӵ�"; //Person��� //�������̵�
		shin.age = 48; //Person��� //�������̵�
		shin.gender = "����";
		System.out.println(shin.info());
	}

}
