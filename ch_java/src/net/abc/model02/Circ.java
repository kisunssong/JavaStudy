package net.abc.model02;

import net.abc.model01.AbsRef;

public class Circ extends AbsRef {

	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
/*
����) ��Ŭ���� �޴��� ����ؼ� AbsRef��ӹ��� �ι�° �ڼ�Ŭ���� Rect, ����°
�ڼ� Ŭ���� Tria�� ����� draw()�߻�޼��带 �������̵��� �Ѵ��� ���๮��
���� �簢���� �׸��� �ﰢ���� �׸��� �� ����ϴ� �ڵ带 �ϼ�����
*/
}
