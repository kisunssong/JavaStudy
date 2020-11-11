/*
상수명이란?
1. final로 선언된 변수를 상수라 한다. 상수는 수정할 수 없는 변수를 뜻한다.
2. 상수명은 관례적으로 명문대문자로 한다.
3. 상수명은 선언과 동시에 반드시 초기화 과정을 거쳐야 한다.
*/
class FinalClass {
	final int NUM=10;
	
	void setNum(int num) {
		NUM = num; //상수를 수정할려다가 에러가 발생
	}
}

public class Abs14 {
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.setNum(100);
		System.out.println(fc.NUM);
	}
}
