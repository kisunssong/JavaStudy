class Member08 {
	
	private String id;
	private String name;
	
	Member08() {
		this("aaaaa","홍길동");
	}
	Member08(String id) {
		this(id,"이순신");
	}
	public Member08(String id, String name) {
		this.id=id; this.name=name;
	}
	public void print() {
		System.out.println("아이디: "+id+", 이름: "+name);
	}
}



public class Cons08 {
	public static void main(String[] args) {
		
		Member08 n1=new Member08();
		n1.print();
		
		Member08 n2=new Member08("bbbbb");
		n2.print();
		
		Member08 n3=new Member08("ccccc","감강찬");
		n3.print();
	}
}
