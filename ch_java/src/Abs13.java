import net.abc.model02.Circ;
import net.abc.model02.Rect;
import net.abc.model02.Tria;
import net.abc.model01.AbsRef;

public class Abs13 {
	static void goodsIn(Circ c) { //개인
		c.draw();
	}
	static void goodsIn(Rect r) { //개인
		r.draw();
	}
	static void goodsIn(Tria t) { //개인
		t.draw();
	}
	static void goodsIn2(AbsRef abs) { //업캐스팅
		abs.draw();
	}
	public static void main(String[] args) {
		Abs13.goodsIn(new Circ());//같은 클래스내에서는 정적메서드를
		//호출할 때 해당 클래스명을 생략해도 된다.
		goodsIn(new Rect());
		goodsIn(new Tria());
		
		System.out.println("======================");
		//부모메서드는 자식이 오버라이딩!!해야 자식메서드가 호출됨
		goodsIn2(new Circ()); //AbsRef abs = new Circ(); 똑같음
		goodsIn2(new Rect()); //AbsRef abs = new Rect(); 똑같음
		goodsIn2(new Tria()); //AbsRef abs = new Tria(); 똑같음				
	}
}
