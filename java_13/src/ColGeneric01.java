import java.awt.List;
import java.util.ArrayList;

/*java.util 패키지의 컬렉션과 배열의 차이점과 특징)
배열의 특징)
1. 배열은 고정된 크기이고 복수개의 원소값을 한꺼번에 저장가능하다.
2. 배열은 단 한개의 자료형만 저장가능하다.

컬렉션 특징)
1. 컬렉션은 가변적 크기이고, 복수개의 원소값을 저장할 수 있다.
2. 컬렉션은 복수개의 자료형을 저장할 수 있다.
*/

public class ColGeneric01 {
	public static void main(String[] args) {
//		int[] arr = {10,20,"a"}; // 오로지 정수만... 한가지타입만 가능 (일반배열)
		
		ArrayList list = new ArrayList(); // 업캐스팅하면서 컬렉션 list생성
		list.add(10); 
		list.add(10,3); 
		list.add("홍길동");
		System.out.println("컬렉션크기: "+list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(" "+list.get(i));
		}
	}
}
