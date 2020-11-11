/*
문제) net.abc.model01패키지에 추상클래스를 각각 만들고, 그 자손클래스는
net.abc.model02패키지에 만든다. pt에 나와있는 에러가 발생하지 않게 코드
*/
import net.abc.model01.Abs1;
import net.abc.model02.Abs2;
import net.abc.model02.AbsMain;

public class Ex18_01 {
	public static void main(String[] args) {
		
		AbsMain am = new AbsMain();
		System.out.println(am.getA());
		System.out.println(am.getB());
	}
}
