package final_field;

public class Person {
	
	/*
	 * final������ �� �� ���� ���ԵǸ� ���� ������ �� ����
	 * Ư¡�� �ֱ� ������ ����ÿ� ���� �ʱ�ȭ�ϰų� �����ڸ� ����
	 * �ʱ�ȭ ������ �ۼ��Ͽ� �����Ͱ� �ݵ�� �ѹ� ����� �� �ְ� 
	 * �ؾ� �մϴ�.
	 */
	
	public final String nation = "���ѹα�";
	public final String name;
	public int age;
	
	public Person(String name) {
//		this.nation = "�߱�"; // final �̶� �� ���� �ȵ�.
		this.name = name;
	}

}
