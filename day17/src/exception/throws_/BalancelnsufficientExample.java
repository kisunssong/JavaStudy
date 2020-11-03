package exception.throws_;

/*
 * 사용자 정의 예외 클래스를 만드려면 Exception클래스나
 * RuntimeException 클래스를 상속받습니다.
 */


public class BalancelnsufficientExample extends Exception{
	
	/*
	 * 일반적으로 사용자 정의 예외클래스를 만들 때는 
	 * 기본생성자와 예외 원인 메시지를 매가값으로 받는 생성자를
	 * 선언합니다.
	 */

	public BalancelnsufficientExample() {}
	
	public BalancelnsufficientExample(String message) {
		super(message);
	}
}
