package api.lang.system;

public class SystemTime {

	public static void main(String[] args) {
		
		/*
		 * currentTimeMillis()와 nanoTime() 메서드는
		 * 1970년 1월 1일 자정부터 현재까지의 시간을 초로 변환한
		 * 에폭시간을 각각 long타입의 밀리초(1/1000)
		 * 나노초(1/10^9)로 리턴합니다.
		 */
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(long i=1; i<=10000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("계산에 소요된 시간: " + (end-start) * 0.001 + "초");

	}
}
