package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) {
		
		/* <로또 번호 출력하기>
		 * 1. 로또 번호 6개를 담을 배열을 생성하세요.
		 * 2. 정수 1~45 범위의 난수를 6개 발생시켜 배열에 담으세요.
		 * 3. Arrays.sort(배열이름) 메서드를 사용하여
		 * 재열을 오름차순으로 정돈하세요.
		 */
		
		Random ran = new Random();
		int[] lotto = new int[6];
		int[] mylotto = new int[6];
		int index = 0;
		int i = 0;

		while(true) {			
			
			int random = ran.nextInt(45) + 1;
			for(i = 0; i < index; i++) {
				if(lotto[i] == random) {
					break;
				}
			}
			if(i == index) {
				lotto[index++] = random;
			}
			if(index == 6) {
				break;			
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));		
	}
}

