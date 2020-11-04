import java.util.Scanner;

/*
 * 반환 유형(return type)
 * 
 * 1. 반환값은 메서드를 호출한 곳으로 메서드의 최종 실행 결과를
 * 전달하는 값입니다.
 * 2. 매개변수는 여러 개 존재할 수 있지만 반환값은 오직 하나여야 합니다.
 * 3. return이라는 키워드를 사용하여 return뒤에 전달할 값을 지정합니다.
 * 4. 전달할 값의 데이터 타입을 반환유형이라고 하며 메서드를 선언할 때
 * 메서드 이름 앞에 반환유형을 명시해야 합니다.
 * 5. 반환값이 있는 메서드는 호출문이 하나의 값이 되기 때문에 반환된 값을
 * 다른변수에 대입할 수도 있고, 다른 메서드의 매개값으로 사용할 수도
 * 있습니다.
 * 6. 모든 메서드가 반환값이 필요한 것은 아닙니다. 메서드 실행 이후에 
 * 반환할 값이 없다면 return을 사용하지 않아도 됩니다.
 * 7. 이 때는 반환유형을 선언시에 비워두면 안되고 반드시 void를 적어줘야 합니다.
 * 8. 모든 메서드는 return 키워드를 만나면 강제로 종료됩니다.
 * 따라서 return문 이하에 코드를 작성할 수 없습니다.
 */

public class MehodExample3 {
	
	public static int add(int n1, int n2) {
		
		return n1 + n2;
	}
	
	public static int[] totalOperate(int n1, int n2){
		
		int[] total = {n1+n2, n1-n2, n1*n2, n1/n2};
		return total;
	}
	
	public static void callMyName(String name) {
		if(name.length() < 2) {
			System.out.println("이름은 2글자 이상으로 입력하세요!");
			return; // 함수를 강제 종료 시켜라!!
		}
		
		System.out.println("내 이름은 " + name + "입니다!!");
	}

	public static void main(String[] args) {
		
		int r = add(3, 5);
		System.out.println(r);
		
		int r2 = add(add(4, 6), add(8, 7));
		
		int[] tot = totalOperate(30,5);
		System.out.println("30 + 5  =" + tot[0]);
		System.out.println("30 - 5  =" + tot[1]);
		System.out.println("30 * 5  =" + tot[2]);
		System.out.println("30 / 5  =" + tot[3]);
		
		//반환값이 없는 메서드는 반드시 단독호출해야 합니다.
		//변수에 저장하거나 다른 메서드의 매개값으로 사용할 수 없습니다.
		callMyName("김철수");
//		int a = callMyName("박영희"); // (X) 반환값이없어서 다른변수에안됨
		
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();
		callMyName(name);
		
		sc.close();
	}

}
