import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
java.util 패키지의 컬렉션 인터페이스 Set을 구현한 컬렉션 클래스 HashSet특징)
1. 중복 원소값 허용하지 않고, 순서 없이 저장된다.
*/
public class ColGeneric02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(12); 
		set.add("홍길동"); 
		set.add("홍길동"); //중복저장안됨
		set.add(10.3);
		set.add(true);
		System.out.println("컬렉션 크기: "+set.size());
		//[홍길동, 12, 10.3, true] 무작위저장
		System.out.println(set); //컬렉션 원소값 출력
		
/*
java.util패키지의 컬렉션 인터페이스 List를 구현한 컬렉션 클래스 ArrayList특징)
1. jdk1.2에서 추가, 순서있게 저장, 중복원소값 허용
2. 가변적 크기
*/
		List list = new ArrayList();
		list.add(100);
		list.add("홍길동");
		list.add("홍길동");
		list.add(10.3);
		list.add(false);
		System.out.println("원소개수(컬렉션크기): "+list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(" "+list.get(i));
		}
	}
}
