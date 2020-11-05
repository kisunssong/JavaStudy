class Member05 {
	private String id;
	private String name;
	
	public Member05(String new_id, String new_name) {
		id=new_id; name=new_name;
	}
	
	public void pr() {
		System.out.println("id: "+id+", 이름: "+name);
	}
}

public class Cons05 {
	public static void main(String[] args) {
		
		Member05 create1=new Member05("sin123", "이순신");
		create1.pr();
		
//		Member05 create1=new Member05();
		//생성자 오버로딩 되면 기본생성자를 더이상 묵시적으로 제공하지않기때문에
		//컴파일 에러가 난다. 명시적으로 기본생성자를 만들어줘야함.
	}
}
