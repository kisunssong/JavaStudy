package super_.person;

public class MainSuper {

	public static void main(String[] args) {

		Student hong = new Student("È«±æµ¿", 13, "34");
		System.out.println(hong.info());
		
		Teacher lim = new Teacher("ÀÓÃ¢Á¤", 50, "À½¾Ç");
		System.out.println(lim.info());
		
		Student song = new Student();
		System.out.println(song.info());

	}

}
