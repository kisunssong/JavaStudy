class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id; //���� ���ؼ� ������ ��
		}else {
			return false;
		}
	}	
}
public class ObjEx15 {
	public static void main(String[] args) {
		
		Person p1 = new Person(901025L);
		Person p2 = new Person(901025L);
		
		if(p1 == p2) { //�ּҰ� ��
			System.out.println("p1�� p2�� ���� ����̴�.");
		}else {
			System.out.println("p1�� p2�� �ٸ� ����̴�.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����̴�.");
		}else {
			System.out.println("p1�� p2�� �ٸ� ����̴�.");
		}
	}
}
