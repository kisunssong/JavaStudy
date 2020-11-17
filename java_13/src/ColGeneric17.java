import java.util.Vector;

public class ColGeneric17 {
	public static void main(String[] args) {
		
		Vector<String> list = new Vector<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		Vector<? extends Object> objlist;
/*
<? extends Object>은 제네릭 와일드카드 문법 특징)
Object을 상속받은 자손으로는 제네릭 타입 형변환을 허용하겠다는 의미.
*/
		objlist = list;//String->Object타입으로 업캐스팅 가능하게해줌<? extends Object>
		for(Object obj : objlist) {
			String a = (String)obj; //다운캐스팅
			System.out.println(a.toUpperCase()); //영문대문자변경
		}
	}
}
