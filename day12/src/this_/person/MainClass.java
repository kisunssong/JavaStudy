package this_.person;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person kim = new Person("��ö��",25);
		System.out.println(kim.info());
//		kim.name = "��ö��"; // �����ڸ� �־��⶧���� ���ʿ� ����
//		kim.age = 25; // �����ڸ� �־��⶧���� ���ʿ� ����
		
		Person park = new Person("�ڿ���");
		System.out.println(park.info());
		
		Person noname = new Person();
		System.out.println(noname.info());
		
	}

}
