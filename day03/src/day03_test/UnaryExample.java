package day03_test;

public class UnaryExample {

	public static void main (String[] args) {
		
		int i = 1;
		int j = i++; //i를 j에 대입 후 j에 +1
		
		System.out.println("후의 연산자");
		System.out.println("i의 값은 : " + i); //1
		System.out.println("j의 값은 : " + j); //2
		
		int x = 1; 
		int y = ++x; //x에 +1 을 한후에 y에 대입 
		
		System.out.println();
		System.out.println("전위 연산자");
		System.out.println("x의 값은 : " + x); //2
		System.out.println("y의 값은 : " + y); //2

		}
	}
