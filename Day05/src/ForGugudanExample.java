
public class ForGugudanExample {
	
	public static void main(String[] args) {
		
		for (int i=2; i<=9; i++) { //초기값 2, 9보다 작거나 같은때, 1식증가
			for(int j=1; j<=9; j++) { //2번줄 for문이 끝나야 1번줄로 넘어감
				System.out.printf("%d*%d=%2d\t",i,j,i*j);
			}
			System.out.println();
			
			
		}
		//test 가로로말고 세로로 해보기
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				System.out.printf("%d*%d=%2d\t",j,i,j*i);
			}
			System.out.println(); 
		}
	}

}

