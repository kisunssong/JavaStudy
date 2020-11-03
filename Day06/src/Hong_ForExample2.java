
public class Hong_ForExample2 {
	
	public static void main(String[] args) {
		
		//7~100까지의 정수 중 7의 배수를 모두 가로로 출력
		for(int i=7; i < 101; i+=7) {
			System.out.printf(i + " ");			
		}
		
		System.out.println("\n------------------------");
		
		//1~100까지의 정수 중 6의 배수를 모두 가로로 출력
		//밑에 i변수를 또 사용할수있는 이유는 위에 for문 {} 밖으로 가면 메모리에서 삭제됨.
		for (int i=1; i<=100; i++) {
			if (i % 6 == 0) {
				System.out.printf(i + " ");
			}
		}
		System.out.println("\n-------------------------");
		
		//1 - 100 까지의 정수 중 8의 배수 이면서 동시에 
		//16의 배수가 아닌 수를 모두 가로로 출력
		for (int i=1; i<100; i++) {
			if ( i%8==0 && i%16!=0 ) {
				System.out.printf(i + " ");
			}			
		}
		System.out.println("\n-------------------------");
		
		//1~850까지의 정수 중 9의 배수의 개수를 출력하세요.
		
		int sum = 0;
		int n = 0;
		for (int i=1; i<850; i++) {
			if ( i%9 == 0 ) {
				sum += n++;
			}
		}
		System.out.println(n);
		
		//hong답변		
		int count = 0; //선언은 꼭 밖에서해야됨.. for문안에있으면 0으로 만듬 ㅋㅋ
		for (int i=1; i<=850; i++) {
			if (i % 9 == 0) {
				count++;
			}
		}
		System.out.println("9의 배수의 개수: " + count + "개");
	}	
}
