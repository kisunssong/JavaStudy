package net.abc.model02;

import net.abc.model01.AbsRef;

public class Rect extends AbsRef {

	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}
