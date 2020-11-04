package colletion.list;

import java.util.*;

public class ArraysListExample {
	
	public static void main(String[] args) {
		
		// ArrayList객체 생성.
		// 다양한 List를 사용할꺼면 클래스부를때 List로 해도된다
				
		// 제네릭(generic): 타입의 안정화(동족모임)을 위해 객체 내부에
		// 저장되는 타입을 일치시키는 방법.
		// ArrayList list = new ArrayList();
		// List list = new ArrayList();
		// 자바1.8 은 생성자에 없어도되는데, 그이하버전은 생성자에<String>추가
		List<String> list = new ArrayList<String>();
		
		String str1 = "Java";
		String str2 = "JSP";
		
		System.out.println(list); //아무것도읍음.
		// []
		
		//list에 객체를 저장하는 메서드 add(); 데이터를 맨 끝에 추가
		list.add(str1);
		list.add(str2); // JSP중복 저장 됨.
		list.add("DataBase");
		list.add("JDBC"); 
		list.add("JSP"); // JSP중복 저장 됨.
		System.out.println(list); //추가후
		// [Java, JSP, DataBase, JDBC, JSP]
		
		// list에  저장된 총 객체 수 얻기 size()
		// .size(); 는 length와 같다. 객체는 몇개를 넣을가를 안해놓기때문에.
		int size = list.size(); 
		System.out.println("list에 저장된 총 객체 수: " + size);
		
		//list에 객체 삽입 add(index, 객체); 데이터를 해당 인덱스에 삽입.
		//2번 인덱스에 "Oracle"를 추가해라
		list.add(2, "Oracle");
		System.out.println(list);
		
		//list 데이터 수정 set(index, 객체)
		//3번 인덱스에 "MySQL"로 교체해라 
		list.set(3,  "MySQL");
		System.out.println(list);
		
		//list 내부 객체 가져오기 get(index)
		//리턴값이 String이라 String변수에 담음
		String a = list.get(2);
		System.out.println("2번 인덱스 객체: " + a);
		
		//list에 저장된 객체의 인덱스번호 확인하기 indexOf(객체)
		int b = list.indexOf("MySQL");
		System.out.println("MySQL 인덱스 번호: " + b);
		
		//indexOf는 객체를 검색하지 못했을 경우 -1을 리턴 합니다.
		int c = list.indexOf("ㅋㅋ");
		System.out.println(c);
		
		//list에서 객체데이터 삭제 remove(index), remove(obj)
		//5번 인덱스 삭제
		list.remove(5);
		System.out.println(list);
		
		//값을 삭제도 된다. "Oracle" 이런것도 가능
		list.remove(str1);
		System.out.println(list);
		
		//list내부에 저장된 객체의 유뮤확인.
		//contains()
		System.out.println(list.contains("JSP")); //true
		System.out.println(list.contains("Oracle")); //true
		System.out.println(list.contains("ㅋㅋㅋ")); //false
		
		//list의 반복문 처리
		//i초기값을 인덱스로 잡고, list.size 1번부터 시작이니, < 아래로잡는다
		System.out.println("==========================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("==========================");
		
		//싹~~지워짐
		list.clear();
		System.out.println(list);
		
		//list내부 데이터가 전부 비어있는지 확인하는 메서드 isEmpty()
		if(list.isEmpty()) {
			System.out.println("list가 비어있음.");
		}else { 
			System.out.println("list가 있음");
		}
	}
}
