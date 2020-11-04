package collection.map;
import java.util.*;
// Map - 컬렉션은 키(key)와 값(value)으로 구성된 entry객체를 저장하는 구조를 가지고있다
// Map - 같은 경우 순차적 저장보다는 key를 통해 저장할때 즉(물건)등 저장할때 좋다

public class HashMapExample{
	public static void main(String[] args) {
		
		
		// 객체만 사용가능, Int<<이런거 안됨.
		Map<String, Integer> map = new HashMap<>();
		
		// map에 객체를 저장 put(Key, value)
		map.put("치킨", 20000);
		map.put("라면", 2000);
		map.put("족발", 30000);
		map.put("라면", 3000);
		
		System.out.println(map);
		// {족발=30000, 치킨=20000, 라면=3000}
		// put을 사용하면 중복 될때 마지막 꺼를 덮어쒸움
		// key와value 쌍을 entry객체라 한다.
		
		System.out.println("map에 저장된 총 객체 수: " + map.size());
		// map에 저장된 총 객체 수: 3
		
		
		Integer a = map.get("족발");
		int b = map.get("족발");
		System.out.println(a);
		System.out.println(b);
		// Value 가 integer이니깐 당연히.. Integer로 받는다..
		// 하지만.. 자동 언박싱으롤 int를 해도된다.(포장풀기)
		// map에 저장된 Value값 얻기 get(key)
		// 30000 //
		
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		// [족발, 치킨, 라면]
		// 위에 key의 타입은 String임
		// map에서 key를 전부 추출하는 메서드 keySet()
		
		Iterator<String> kIter = kSet.iterator();
		System.out.println("-------------------------");
		
		while(kIter.hasNext()) {
			String foodName = kIter.next();
			int foodPrice = map.get(foodName);
			System.out.printf("%s의 가격은 %d원 입니다.\n", foodName, foodPrice);
			// 족발의 가격은 30000원 입니다.
			// 치킨의 가격은 20000원 입니다.
			// 라면의 가격은 3000원 입니다.
		}
		
		String food = "감자";
		if(map.containsKey(food)) {
			System.out.println(food + "의 가격은" + map.get(food));
		}else {
			System.out.println(food + "은 없는 메뉴 입니다.");
		}
		// map내부에 있는 key의 유무를 확인하는 메서드 containskey()
		// 피자은 없는 메뉴 입니다.
		// 리턴타입은 boolean
		
		
		map.remove("치킨");
		System.out.println(map);
		// map 내부 데이터 삭제 remove(key)
		// {족발=30000, 라면=3000}
		// 해당 key에 대응하는 Entry객체를 삭제. 한쌍이라 같이삭제된다
		
		map.clear();
		
		if(map.isEmpty()) {
			System.out.println("map이 비어있음");
		}else {
			System.out.println("map이 비어있지 않음");
		}
		// map이 비어있음
		
	
	}
}
