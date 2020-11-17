import java.util.Vector;

public class ColGeneric06 {
	public static void main(String[] args) {
		
		Vector vec = new Vector(4,3); //첫번째 인자:(4)는 벡터크기, 두번째 인자:(3)은 증가치
		System.out.println("벡터 크기: "+vec.size()); //추가 원소 개수가 없어서: 0
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		System.out.println("벡터크기: "+vec.size());
		System.out.println("벡터용량: "+vec.capacity());
		
		for(int i=1; i<=5; i++) {
			vec.add(i*10);
		}
		System.out.println("벡터크기: "+vec.size()); //벡터크기: 원소개수
		System.out.println("벡터크기: "+vec.capacity()); //벡터용량: 4+3=7
		System.out.println("벡터크기: "+vec.firstElement()); //10
		System.out.println("벡터크기: "+vec.get(1)); // 1번 인덱스: 20
		System.out.println("벡터크기: "+vec.lastElement()); //50
	}
}
