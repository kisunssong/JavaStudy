package exception.throws_;

public class ThrowsExample1 {
	
	public static String[] greetings = {"안녕", "니하오", "헬로" };
	
	public static void main(String[] args) {
		
		
		/*
		 * throws가 붙어있는 메서드나 생성자를 호출할 때는
		 * 반드시 try 블록 내부에서 호출하여 예외처리를 진행해야 합니다.
		 * 또는 또다시 throws하여 예외처리를 다시 한번 떠넘길 수 있습니다.
		 */
		try {
			greet(3);
		} catch (Exception e) {
			/*
			 * printStackTrace()는 예외발생 경로를 추적하는
			 * 메시지를 출력 해줍니다.
			 * 주로 개발과정에서 예외의 원인을 찾을 때 유용하게 사용합니다.
			 */
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
	
	/*
	 * 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
	 * 예외처리를 메서드 호출자에게 떠넘기는 방식을 throws라고 합니다.
	 * 메서드나 생성자 호출 시 예외처리를 강요하고 싶을 때 사용합니다.
	 */
	
	public static void greet(int index) throws Exception {
			System.out.println(greetings[index]);
	}
}
