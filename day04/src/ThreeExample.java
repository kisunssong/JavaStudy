//삼항단항식

public class ThreeExample {
	
	public static void main(String[] args) {
		//조건식 ? true일 때 값 : false일 때 값
		// - Math.random() - 0.00 ~ 0.99... 까지의 난수 생성
		int ran = (int)(Math.random() * 10+1);
		//ran 정수 타입 , 무작위로 들어간 숫자 %2 를해서 0이 되면 "짝수"(true) : "홀수"(false);
		String word = ran%2 == 0 ? "짝수" : "홀수";
		System.out.printf("입력하신 숫자는 %d, 이수는 %s입니다.",ran,word);
	}
}


//	public static void main(String[] args) {
//		Scanner a = new Scanner(System.in);
//		System.out.println("이름을 입력하세요: ");
//		String c = a.nextLine();
//		System.out.printf("입력하신 이름은 : %s", c);
//		System.out.println();
//		String[] name = {"aaa","bbb","ccc","ddd"};
//		name [0] ="aaa";
//		name [1] ="bbb";
//		name [2] ="ccc";
//		name [3] ="ddd";
//		for (int search = 0; search < name.length; search++) {
//			String name1 = name[search];
//			System.out.println(c);
//		}

//		if ( ) {
//			System.out.printf("%s님의 번호는 : %s입니다.", c, name[0]);
//		}else if ( c == name[1] ) {
//			System.out.printf("%s님의 번호는 : %s입니다.", c, name[1]);
//		}else if ( c == name[2] ) {
//			System.out.printf("%s님의 번호는 : %s입니다.", c, name[2]);
//		}else if ( c == name[3] ) {
//			System.out.printf("%s님의 번호는 : %s입니다.", c, name[3]);
//			System.out.println();
//		}else {
//			System.out.printf("%s님은 여기에 없습니다.", c);
//		}
//		
//		a.close();	
//		}
//	}

