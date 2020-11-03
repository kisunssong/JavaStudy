
public class Hong_Example3 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				//// 동일한 숫자가 걸리면, 내부만탈출 후 출력 , 외부for문은 다시 돈다
				if(i==j) break; 
				System.out.println(i + " " + j);
			}
		}
		
	}

}
