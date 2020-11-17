import java.util.Arrays;
import java.util.List;

class MyList {
	public static void printList(List<?> list) {
	//List<?> 제네릭타입 와일드 카드 특징)
    //<?>는 모든 객체타입을 배치가능함
		for(Object obj : list) {
			System.out.println(" "+obj);
		}
		System.out.println("==================================");
	}
}


public class ColGeneric19 {
	public static void main(String[] args) {
		
		List<Integer> li  = Arrays.asList(10,20,30);
		//asList()제네릭 메서드는 배열을 컬렉션List로 변경
		
		List<String> li2 = Arrays.asList("kiki","haha");
		
		MyList.printList(li);
		MyList.printList(li2);
	}
}
