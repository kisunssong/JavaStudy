package poly.person;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person hong = new Student("ȫ�浿", 15, "32");
		Person lee = new Student("�̼���", 17, "21");
		Person park = new Student("����ȣ", 13, "61");
		
		Person kim = new Teacher("��ö��", 26, "����");
		Person song = new Teacher("�ۿ���", 29, "����");
		
		Person lim = new Employee("�Ӳ���", 45, "����");
		
//		System.out.println(hong.info());
//		System.out.println(lee.info());
//		System.out.println(park.info());
//		System.out.println(kim.info());
//		System.out.println(song.info());
//		System.out.println(lim.info());
		
		/*
		 * Student[] students = {hong, lee, park}; 
		 * Teacher[] teachers = {kim, song};
		 * Employee[] employees = {lim};
		 * 
		 * for (int i=0; i < students.length; i++) {
		 * System.out.println(students[i].info()); }
		 * 
		 * System.out.println(hong); System.out.println(students[0]);
		 * System.out.println(hong.equals(students[0]));
		 */
		
		Person[] people = {hong, lee, park, kim, song, lim};
		for (Person p: people) {
			System.out.println(p.info());
		}
	}

}
