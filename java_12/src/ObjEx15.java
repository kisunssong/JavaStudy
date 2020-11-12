class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id; //값만 비교해서 같으면 참
		}else {
			return false;
		}
	}	
}
public class ObjEx15 {
	public static void main(String[] args) {
		
		Person p1 = new Person(901025L);
		Person p2 = new Person(901025L);
		
		if(p1 == p2) { //주소값 비교
			System.out.println("p1과 p2는 같은 사람이다.");
		}else {
			System.out.println("p1과 p2는 다른 사람이다.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람이다.");
		}else {
			System.out.println("p1과 p2는 다른 사람이다.");
		}
	}
}
