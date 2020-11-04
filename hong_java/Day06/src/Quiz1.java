import java.util.Arrays;

/* 1.
 * 소수(PrimeNumber)구하기
 * 소수는 1과 자기 자신으로만 나누어지는 수 입니다. 
 * 조건문과 반복문을 사용해 100이하의 소수를 출력해 보세요.
 * 힌트 (for속의 for문)
 */

public class Quiz1 {

	public static void main(String[] args) {
		//난수는 1과 본인의 수 나누어 0이 2개만 나온다
		for(int i=1; i<6; i++) { // 6바퀴 돌린다.
			int a = 0; // 위에 for문이 돌면 초기화가 된다.
			for(int j=1; j<=i; j++) { //i에 맞게 똑같이 1부터 ~ 연산
				if(i%j==0) { // i나누기j 나머지 0 으로 조건마춤
					a++; // if문이 true면 a에 +1
				}
			}
			if(a == 2) // 2번째 for문이 다돌고, a가 2와 같으면 밑에 i(숫자)출력
				System.out.printf(i + " ");
		}
		System.out.println();


		/*
		 * 2.
		 * 로또 번호 추출하기
		 * 앞에서 배운 난수 발생과 반복문, 
		 * 조건문을 통해 중복되는 번호없이 1~45 까지의 숫자 중 6개의 숫자를 
		 * 랜덤추출하고 콘솔에 출력해보세요.
		 * 힌트(while문 속의 for문
		 */		
		//		int ran1 = (int)(Math.random()* 45+1);
		//		int ran2 = (int)(Math.random()* 45+1);
		//		int[] ran = new int[45];
		//		System.out.println(ran.length);
		//		for(int i=0; i<=ran.length; i++) {
		//		
		//		System.out.println();


		//lotto변수 6개 배열 선언
		int[] lotto = new int[6];
		//0번부터 체크하기위해 담을 변수 선언
		int index = 0; 
		while(true) {
			int ran = (int)(Math.random()*45+1);
			//i의 갯수체크를 위해 변수선언, for문에 쓰면 0으로 초기화됨
			int i=0; 
			//한바퀴째 0<1 true가 나온다. 
			//ran == lotto[0]인덱스 체크 후 i +1 한다.
			for(i=0; i<index; i++) { 
				if(ran==lotto[i]) {
					//이 break는 for문장 종료가 된다.while문은 다시 돌게됨
					break;
				}
			}
			//0==0 트루
			if(i==index) {
				//lotto 0번 인덱스에 ran을 추가, if문끝나면 index +1
				lotto[index++] = ran;
//				System.out.println(lotto[0]);
//				System.out.println(index);

			}
			//index가 6과 같으면 while문장 종룔{ } 위치를 꼭!!확인하자
			//while문 바로 안에서 break를 했기에 break걸면 문장종료
			if(index==6) { 
				break;
			}
		}
		System.out.println(Arrays.toString(lotto));

	}
}	


