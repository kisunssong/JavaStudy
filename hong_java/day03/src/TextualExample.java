
public class TextualExample {

	public static void main(String[] args) {
		
		//단일 문자는 char형 2byte 로  0 ~ 2^16 까지 숫자를 사용하여 유니코드 문자를 표현
		//char형 값은 홑 따옴표 (' ')안에 넣어야 함 (단일문자 는 홑 따옴표)
		char c1 = 'A';
		char c2 = 66; //char타입이기 때문에  66(B)로 표기됨 
		/*
		 * 한글 '가' 에 해당하는 유니코드 AC00
		 * 직접 16진수형태로 저장하려면 탈출문자 \\u 를 적용해야함
		 */
		char c3 = '\uAC00'; //유니코드의 16진수작성
		System.out.printf("%c %c %c\n", c1, c2, c3); //%c는 문자형태
		
		//문자열을 저장할 수 있는 데이터 타입 String
		String s1 = "my dream";
		String s2 = "is a scientist";
		System.out.println("---------------");
		System.out.println(s1);
		System.out.println(s2);
		
		//자바에서는 문자열의 + 연산을 진행할 수 있습니다.
		//연산결과로 문자열을 이어붙인 결과를 도출합니다.
		System.out.println(s1 + s2);
		System.out.println("--------------");
		
		//문자와 다른 데이터타입과의 + 연산
		System.out.println(100 + 200);
		System.out.println(100 + "200"); //""문자열로봐서 200을 붙여버림
		System.out.println(10 + 20 + "hello"); //왼쪽순위 정수+ 후에 문자열을 더함
		System.out.println("hello" + 10 + 20); //문자열+정수 했더니 둘다 문자열로표현
		System.out.println("hello" + 10 * 20); //우선순위 * 후 문자열로 +함
		System.out.println("hello" + (10 + 20)); //()가 연산우선순위
		
		//기본데이터타입의 연산시 바이트가 큰쪽에 맞추어 연산.
		System.out.println('A' + 10);
		//char=2byte('A'), int=4byte(10), int가 커서 'A'를 int로 바꿔버림
		//'A'는 숫자 = 65(유니코드) + 10 = 75가 나옴

		}

	
}