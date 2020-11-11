package net.abc.model02;

import net.abc.model01.AbsRef;

public class Circ extends AbsRef {

	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}
/*
문제) 이클립스 메뉴를 사용해서 AbsRef상속받은 두번째 자손클래스 Rect, 세번째
자손 클래스 Tria를 만들고 draw()추상메서드를 오버라이딩을 한다음 실행문장
으로 사각형을 그린다 삼각형을 그린다 가 출력하는 코드를 완성하자
*/
}
