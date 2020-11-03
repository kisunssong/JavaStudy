package exception.multi;

import java.util.Scanner;
// 생성자 내부
// 메서드 내부에서만 사용가능 
// 클래스 내부에서 직접적으로 사용 불가능
public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.printf("1번째 데이터: ");
			String data1 = scan.next();
			System.out.printf("2번째 데이터: ");
			String data2 = scan.next();
			
			//NumberFormat 발생 가능!
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			
			//Arithmetic 발생 가능!
			int result = val1 / val2;
			System.out.println(val1 + "/" + val2 + "=" + result);
			
			//어떤 오류인지 모르니 Exception처리로 catch 맨 밑자리에 배치
			String str = null;
			str.charAt(0);
			
			//Exception클래스는 모든 예외를 일괄처리할 수 있습니다.
		} catch (NumberFormatException e) {			
			System.out.println("숫자만 넣어주세요.");
		} catch (ArithmeticException e) {			
			System.out.println("0으로  나눌 수 없습니다.");
			 //Exception클래스는 모든처리를 받기때문에 catch윗자리에 있으면 안된다.
		} catch (Exception e) { 
			System.out.println("알 수 없는 예외 발생!");
			System.out.println("확인 후 신속히 처리하겠습니다.");
		} finally {
			scan.close();
		}
		System.out.println("프로그램 정상 종료!");
	}
}
