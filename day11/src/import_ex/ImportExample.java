package import_ex;

import java.util.Scanner;

/*
 * package는 소문자로 표현
 * java패키지명은 사용 안됨. API들의 모음을 구성해논것
 * 다른 패키지에 있는 클래스를 사용하려면 반드시 package선언부 아래,
 * 그리고 class선언부 위에 import선언을 통해 해당 클래스의
 * 전체 경로(패키지명까지 포함된 경로)를 적어줘야 합니다.
 */

//import fruit.Apple; //fruit(package).Apple(class)
//import fruit.Banana; //fruit(package).Banana(class)
import fruit.*; //fruit(package).*(전체)
import hello.hi.Hi; //hello(package).hi(package).Hi(class)
import hello.bye.Bye;

public class ImportExample {
	
	public static void main(String[] args) {
		
		Apple a = new Apple();
		Banana b = new Banana();
		Test c = new Test(); // 같은package안에 있으므로 import안해도됨
		Hi d = new Hi();
		Bye e = new Bye();
		
		Scanner scan = new Scanner(System.in);
	}

}
