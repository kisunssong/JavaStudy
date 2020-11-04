import java.util.Arrays;
import java.util.Scanner;

public class Hong_SwhtichQuiz {
	public static void main(String[] args) {
		
//직급을 입력하세요.
//[사원,대리,과장,차장,부장]
//사워은(는) 없는 직급입니다.
//사원 : 월급은 200만원입니다.
//대리 : 월급은 300만원입니다.
//과장 : 월급은 400만원입니다.
//차장 : 월급은 500만원입니다.
//부장 : 월급은 600만원입니다.
		

		Scanner scan = new Scanner(System.in);
		System.out.println("직급을 입력하세요: ");
		String[] name1 = {"사원", "대리", "과장", "차장", "부장"};
		System.out.println(Arrays.toString(name1));
		System.out.printf("> ");
		String name = scan.nextLine();
				
//		int point = (int)(Math.random() * 6);
		
		switch(name) { //내가 입력한 name 과 switch들어간 name이 및에 case값
		//과 동일하면 출력된다
		
		case "사원":
			System.out.println("사원의 월급은 200만원 입니다.");
			break;
		case "대리":
			System.out.println("대리의 월급은 300만원 입니다.");
			break;
		case "과장":
			System.out.println("과장의 월급은 400만원 입니다.");
			break;
		case "차장":
			System.out.println("차장의 월급은 500만원 입니다.");
			break;
		case "부장":
			System.out.println("부장의 월급은 600만원 입니다.");
			break;
		default:
			System.out.println("없는 직원 입니다..");
		}
		scan.close();
		
		
		
	}

}
