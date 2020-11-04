package exception.throws_;

public class ThrowsExample2 {
	
	public void aaa(int n) throws Exception {
		System.out.println("aaa 호출!");
		int i = 10 / n;
		System.out.println("계산결과: " + i);
		System.out.println("aaa실행 종료!");
	}	
	public void bbb() {
		System.out.println("bbb 호출");
		try {
			aaa(1);
		} catch (Exception e) {
			System.out.println("0을 입력하시면 안됩니다.");
		}
		System.out.println("bbb실행 종료");
	}	
	public void ccc() {
		System.out.println("ccc 호출");
		bbb();
		System.out.println("ccc실행 종료");
	}
	public ThrowsExample2() {
		System.out.println("생성자 호출");
		ccc();
		System.out.println("생성자 실행 종료");
	}
	
	public static void main(String[] args) {				
		ThrowsExample2 te = new ThrowsExample2();
	}
	
}