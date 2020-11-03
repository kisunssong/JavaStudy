package static_.init;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Computer com = new Computer();
//		System.out.println(com.info); 
		System.out.println(Computer.info); //static초기화 하지않으면, null
		
		/*
		 * 정적 초기화자를 호출하려면 클래스를 로딩해야 합니다.
		 * 클래스 로딩방법:
		 * 1. 객체를 생성
		 * 2. 클래스 이름을 통해 정적 멤버에 접근.
		 */
//		Computer com = new Computer();
//		System.out.println(com.info);
//		System.out.println(com);
//		Computer com1 = new Computer("이건?");
//		System.out.println(com1.info);
//		System.out.println(com1);
//		System.out.println(com.info.equals(com1.info));
//		System.out.println(info);
//		System.out.println(Computer.info);
		
	}

}
