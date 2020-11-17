import java.util.ArrayList;
import java.util.List;

public class ColGeneric10 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("seoul"); // Object타입으로 업캐스팅하면서 저장
		list.add("busan"); // Object타입으로 업캐스팅하면서 저장
		list.add("Incheon"); // Object타입으로 업캐스팅하면서 저장
		
		String result;
		for(int i=0; i<list.size(); i++) {
			result = (String)list.get(i); //다운캐스팅함
			System.out.println(result.toUpperCase()); //문자열 대문자로 변환
		}
		System.out.println("========================");

// 컬렉션은 원래 복수개의 자료형이 동시 저장되다 보니 자료의 안정성도 떨어지고, 원하는
// 자료형 값 추출도 어렵다. 그래서 나온 문법이 제네릭이다.
// 컬렉션에 제네릭을 지정하면 지정한 자료형 타입값만 저장가능하다. 그래서 불필요한 업/다운
// 캐스팅을 할 필요가 없다.
		String a;
		List<String> list1 = new ArrayList<String>();
		list1.add("hong");
		list1.add("kim");
		list1.add("lee");
		for(int i=0; i<list1.size(); i++) {
			a = list1.get(i);
			System.out.println(a);
		}
	}
}
