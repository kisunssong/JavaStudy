package import_ex;

import java.util.Scanner;

/*
 * package�� �ҹ��ڷ� ǥ��
 * java��Ű������ ��� �ȵ�. API���� ������ �����س��
 * �ٸ� ��Ű���� �ִ� Ŭ������ ����Ϸ��� �ݵ�� package����� �Ʒ�,
 * �׸��� class����� ���� import������ ���� �ش� Ŭ������
 * ��ü ���(��Ű������� ���Ե� ���)�� ������� �մϴ�.
 */

//import fruit.Apple; //fruit(package).Apple(class)
//import fruit.Banana; //fruit(package).Banana(class)
import fruit.*; //fruit(package).*(��ü)
import hello.hi.Hi; //hello(package).hi(package).Hi(class)
import hello.bye.Bye;

public class ImportExample {
	
	public static void main(String[] args) {
		
		Apple a = new Apple();
		Banana b = new Banana();
		Test c = new Test(); // ����package�ȿ� �����Ƿ� import���ص���
		Hi d = new Hi();
		Bye e = new Bye();
		
		Scanner scan = new Scanner(System.in);
	}

}
