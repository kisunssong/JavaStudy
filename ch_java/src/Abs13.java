import net.abc.model02.Circ;
import net.abc.model02.Rect;
import net.abc.model02.Tria;
import net.abc.model01.AbsRef;

public class Abs13 {
	static void goodsIn(Circ c) { //����
		c.draw();
	}
	static void goodsIn(Rect r) { //����
		r.draw();
	}
	static void goodsIn(Tria t) { //����
		t.draw();
	}
	static void goodsIn2(AbsRef abs) { //��ĳ����
		abs.draw();
	}
	public static void main(String[] args) {
		Abs13.goodsIn(new Circ());//���� Ŭ������������ �����޼��带
		//ȣ���� �� �ش� Ŭ�������� �����ص� �ȴ�.
		goodsIn(new Rect());
		goodsIn(new Tria());
		
		System.out.println("======================");
		//�θ�޼���� �ڽ��� �������̵�!!�ؾ� �ڽĸ޼��尡 ȣ���
		goodsIn2(new Circ()); //AbsRef abs = new Circ(); �Ȱ���
		goodsIn2(new Rect()); //AbsRef abs = new Rect(); �Ȱ���
		goodsIn2(new Tria()); //AbsRef abs = new Tria(); �Ȱ���				
	}
}
