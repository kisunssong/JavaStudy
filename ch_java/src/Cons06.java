class Member06 {
	private String id;
	private String name;
	
	public Member06() {}
	
	public Member06(String new_id, String new_name) {
		id=new_id; name=new_name;
	}
	public void setYear(int year) {
		
	}
	public void setId(String id) {
		id=id;//왼쪽 클래스 소속의 멤버변수중 인스턴스변수 id와 오른쪽 메서드
		//소속의 매개변수(전달인자)명이 같은때는 어느것이 인스턴스변수이고, 
		//매개변수인지 자바 컴파일러가 구분못해서 오른쪽에서 왼쪽으로 저장안됨
	}
	public void setName(String new_name) {
		name=new_name;
	}
	public void print() {
		System.out.println("회원 아이디: "+id+", 회원이름: "+name);
	}
	
}


public class Cons06 {
	public static void main(String[] args) {
		Member06 m=new Member06("aaaaa", "이순신");
		m.print();
		m.setId("cccc");
		m.print();
		m.setName("홍길동");
		m.print();
		
	}
}
