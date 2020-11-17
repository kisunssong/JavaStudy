import java.util.Arrays;
import java.util.List;

public class ColGeneric18 {
	public static void addNumber(List<? super Integer> list) {
		//super Integer로 해버리면 Integer 상위 클래스를 받겠다는거임
/*
<? super Integer> 제네릭 와일드 카드 문법 특징)
Integer타입 조상으로만 제네릭 타입 형 변환을 허용		
*/		
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf(" "+list.get(i));
		}
		System.out.println("=======================================");
	}
	public static void main(String[] args) {
		
		Number[] arr = {10,20,30};
		Object[] arr2 = {1,2,3};
		List<Number> li = Arrays.asList(arr);//Arrays.asList는 일반배열을 ArrayList변경
		addNumber(li);
		
		List<Object> li2 = Arrays.asList(arr2);//Arrays.asList는 일반배열을 ArrayList변경
		addNumber(li2);
	}
}
