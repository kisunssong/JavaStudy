package day04;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		System.out.println("숫자만 입력하는대로 출력이 되요:  ");
		int a = test.nextInt();
		System.out.printf("출력결과는 > :%d ",a);
		test.close();
	}

}
