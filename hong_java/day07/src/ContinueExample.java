
public class ContinueExample {
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			//continue는 5는 출력안하고 i++해서 계속 진행한다
			if(i==5) {
				continue;
			}
			System.out.printf(i + " ");
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			//즉 짝수는 전부 뺀다... 홀수만 출력
			if(i % 2 == 0) continue;
			System.out.printf(i + " ");
		}
	}

}
