package final_field;

public class MainClass {
	
	public static void main(String[] args) {
		//�̸� ���� final�̱⶧���� �����س�� ���ٲ�
		Person kim = new Person("���ѱ�");
		
//		kim.nation = "�̱�"; // Ŭ������ final�� ���� �߱⶧���� ���� �ȵ�.
//		kim.name = "�踶��Ŭ"; // Ŭ������ final�� ���� �߱⶧���� ���� �ȵ�.
		kim.age = 17;
		kim.age = 27;
		System.out.println("����: " + kim.nation);
		System.out.println("�̸�: " + kim.name);
		System.out.println("����: " + kim.age);
		
		//�̸� ���� final�̱⶧���� �����س�� ���ٲ�
		Person park = new Person("���߱�"); 
		park.age = 30;
		System.out.println("����: " + park.nation);
		System.out.println("�̸�: " + park.name);
		System.out.println("����: " + park.age);
	}

}
