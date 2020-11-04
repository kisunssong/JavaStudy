package exception_trycatch2;

public class TryCatchExample2 {
	
	public static void main(String[] args) {
		
		String[] greetings = {"안녕", "헬로", "니하오"};
		
		int i = 0;
		while(i < 4) {
			try {
			System.out.println(greetings[i]);
			} catch (Exception e) {
				System.out.println("배열의 참조 벙위를 벗어남!");
			} finally { //try를 한번식 4까지 확인하는데!!에러가안나도 출력함
				System.out.println("이 문장은 항상 실행됨!");
			}
			i++;
		}
		System.out.println("프로그램 정상 종료");
	}
}
