
import java.util.*;

// List<데이터타입> 변수 = new ArrayList<>();
// - 중간 번호 삭제할때 한 인덱스씩 쭉쭉쭉 땡겨야되서 시간이 오래걸림
// List<데이터타입> 변수 = new LinkedList<>();
// 인덱스 사이 사이에 링크로 연결해놔서, 삭제할때 삭제 인덱스 앞뒤 연결고리만 끊어내어, 삭제가빠름

// set - 중복 저장 을 안한다. 
// set - 막 저장 한다.
// set - 데이터 찾는데 오래걸린다.



// 번호 관리(List), 이름 관리(Set), 별명 관리(Map) 이렇게 생각?
public class SetListMapList {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		// set에 객체를 추가 add()
		set.add("닭강정");
		set.add("김밥");
		set.add("김말이");
		set.add("단무지");
		set.add("김밥");
		
		// set에 저장된 객체의 수를 알아보는 메서드 Size()		
		System.out.println("set에 저장된 객체 수: " + set.size());
		System.out.println(set);
		// set에 저장된 객체 수: 4 //
		// [김밥, 김말이, 단무지, 닭강정] //
		// set특징1 : 김밥<< 중복되서 허용을 안함. 
		// set특징2 : 순서 저장이 안됨.
		
		// set의 객체 데이터를 사용하려면 반복자(Iterator)를 통해 모든 객체를
		// 대상으로 한번씩 반복해서 꺼내야 합니다.
		
		Iterator<String> iter = set.iterator();
		// 타입에 맞게 대입함
		String s = iter.next();
		System.out.println(s);		
		// 김밥 //
		
		s = iter.next();
		System.out.println(s);
		// 김말이 //
		
		s = iter.next();
		System.out.println(s);
		// 단무지 //
		
		s = iter.next();
		System.out.println(s);
		// 닭강정 //
//		s = iter.next(); // 이제 꺼낼 값이 없으면 에러발생한다.
		System.out.println("=====================");
		
		
		
		// hasNext는 전부 찾은뒤 없으면.. false를 내보냄
		// 반복자 객체가 next()메서드를 통해 set 내부의 데이터를
		// 반복소진할 때 더이상 조회할 데이터가 없으면 예외를 발생시키기 때문에
		// hasnext()를 통해 더 이상 소모할 데이터가 있는지의 유무를 체크
//		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			
//			if(s.equals("닭강정"))
			System.out.println(iter + "은 맛있어");
			break;
		}
		
		//set의 데이터 삭제 기능 remove(), clear()
		set.remove("단무지");
		System.out.println(set);
		// [김밥, 김말이, 닭강정]
		
		set.clear();
		//전체 클리어
		// set - 은 다수의 데이터를 빨리 저장할때 좋다
		if(set.isEmpty()) {
			System.out.println("set이 비어있음.");
		}else {
			System.out.println("set이 비어있지 않음.");
		}

		

		
		
	}

}
