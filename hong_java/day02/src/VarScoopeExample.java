//int a = 10; (x) 중괄호안에서 변수 생성
public class VarScoopeExample {

	public static void main(String[] args) {
		
		//같은 타입의 변수를 선언할 때는 콤마(,)로 나열 가능.
		int num1 = 10, num2 = 20;
		
		if(num1 > 15) {
			int num3 = num1 + num2;
		}
//		int num4 = num1 + num3; //10줄 괄호밖에 있으니 num3이라는 변수를 모른다 (메모리밖에)
//		int num1; //7줄 괄호안에 num1 변수가 있어서 못만든다 (메모리안에)
		int num3 = 30; //10줄 괄호밖에 있으니 num3 변수를 만들수있다 (메모라밖에)
		System.out.println(num3);


	}
}
