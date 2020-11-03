
public class IdentfierExample {

	public static void main(String[] args) {
		
		//자바의 식별자 이름을 대/소문자를 구분함.
		int age = 20;
		int aGe = 21;
		int aGE = 22;
		
		System.out.println(age);
		System.out.println(aGe);
		System.out.println(aGE);
		
		//식별자 이름을 숫자로 시작하게 만들지 마세요.
		int number4 = 4;
		int num4ber = 4;
//		int 4number = 4; (X)
		
		//식별자 이름에 공백을 포함하지 마세요.
//		int birth day = 020111; (X)
		int birthDay = 020111;
		
		//키워드는 식별자 이름으로 지정 불가.
//		int class = 12; (X)
//		int if = 33; (X)
		int cLASS = 33;

	}

}
