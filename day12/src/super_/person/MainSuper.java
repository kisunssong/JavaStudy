package super_.person;

public class MainSuper {

	public static void main(String[] args) {

		Student hong = new Student("ȫ�浿", 13, "34");
		System.out.println(hong.info());
		
		Teacher lim = new Teacher("��â��", 50, "����");
		System.out.println(lim.info());
		
		Student song = new Student();
		System.out.println(song.info());

	}

}
