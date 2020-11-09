class Member07 {
	private String id;
	private String name;
	
/*
왼쪽 클래스 소속의 인스턴스 변수와 오른쪽 생성자 소속의 매개변수명이 같을때
왼쪽 인스턴스 변수명 앞에 this. 을 붙여야 구분되어 져서 값이 저장됨.
this는 내 자신 클래스내에 선언된 멤버변수 중 인스턴스 변수를 가리키는 참조
변수 키워드(예약어)이다.	
*/
	public Member07() {}
	public Member07(String id, String name) {
		this.id=id; this.name=name;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void print() {
		System.out.println("아이디: "+id+", 이름: "+name);
	}
}


public class Cons07 {
	public static void main(String[] args) {
		
		Member07 create1=new Member07("aaaa","홍길동");
		create1.print();
		create1.setId("abcd");
		create1.setName("이순신");
		create1.print();
	}
}
