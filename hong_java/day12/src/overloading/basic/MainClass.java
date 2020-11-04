package overloading.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic a = new Basic();
		a.input("안녕",5.5);
		a.input("ㅎㅎ");
		a.input(5.5,"안녕");
		
//		System.out.println // println 역시 오버로딩 int,String,char등 전부 중복
	}

}
