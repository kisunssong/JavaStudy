class Document {
	
	static int count=0;//정적변수
	String name;//인스턴스변수
	
//	Document() {
//		this("제목없음"+ ++count);//같은 클래스내의 다른 생성자 호출
//	}
//	Document(String name) {
//		this.name=name;
//		System.out.println("문서"+ this.name+"가 생성됨.");
//	}
	
	 Document() {
	 this("no title " + ++count);
	 }
	 Document(String name) {
	 count++;
	 this.name = name;
	 System.out.println("doc" + " \"" + this.name +" " + count + "\"" + "is made.");
	 }
	
}


public class Static08 {
	
	public static void main(String[] args) {
		
		new Document(); // 기본 생성자 호출
		new Document("자바.txt"); //오버로딩 된 생성자 호출
		new Document(); 
	}
}
