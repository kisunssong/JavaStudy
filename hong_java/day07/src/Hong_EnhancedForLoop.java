
public class Hong_EnhancedForLoop {
	
	public static void main(String[] args) {
		
		String[] weekDay = {"일","월","화","수","목","금","토"};
		
//		for(int i=0; i<weekDay.length; i++) {
//			System.out.println(weekDay[i]);
		
		for (String chose : weekDay) { //0인덱스 돌고, 아래 출력, 1번인덱스---
			System.out.println(chose + "요일");			
		}
		System.out.println("---------------------");
		
		int[] scores = {98,71,85,67,100,96};
		
		//향상된 for문을 사용하여 총점과 평균을 출력하세요.
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.printf("총 점수는 : "+sum+"입니다.");
		
		System.out.println("---------------------");
		
		//소수점까지 표현
		//%8 칸 보유 .2 소수점2자리까지 표현 f실수
		double age = (double)sum;
		System.out.printf("평균은:%8.2f ",age/scores.length);
		
	}	
}

