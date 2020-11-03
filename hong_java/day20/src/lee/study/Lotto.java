package lee.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {

		/*
		문제) 위의 이중 for반복문을 참조하여 다음과같이 출력되게 한다.
		실행결과
		[1,1]
			[2,2]
				 [3,3]
		참고로 이중 for안에 if else조건문을 활용하고 printf()메서드로 자리수 문자
		표현을 잘해주면 된다 25번 반복 자리수 표현을 출력형태 지시자로 활용한다.%d등
		으로 공백 처리 (5자리 문자표현과 오른쪽 정렬한다)
		 */		
		String a = "";
		int sum = 1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j > i || j <= i) {
					if(j == 1 && i == 1) {						
					}else {
						sum++;
						for(int empty=1; empty<sum; empty++) {
							System.out.printf("%5s",a);
						}	
					}			
				}
				System.out.printf("[%d,%d]",j+(i-1)*5,j+(i-1)*5);
				System.out.println();			
			}
		}
	}
}
