package collection.list;

import java.util.*;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
// ArrayList객체 생성.
// java1.5버전 이후 제네릭 구성이 됨. 1.5아래버전은 꺽세 없음
// 제네릭 : 타입의 안정화를 위해 객체 내부에 저장되는 타입을 일치 시키는 방법
		// 데이터타입 앞에 <String>을 넣으면 List타입에! String만을! 저장하겠다 선언
		// 생성자에도 <String>을 써야하는데 1.7 ~ 생략가능
		// int를 하고 싶으면 객체타입 <Integer>
		List<String> list = new ArrayList<>();
		
		String str1 = "Java";
		String str2 = "JSP";
		
		System.out.println(list);
		
// list에 객체를 저장하는 메서드 add(): 데이터를 맨 끝에 추가
		list.add(str1); 
		list.add(str2);
		list.add("DataBase");
		list.add("JDBC");
		list.add("JSP");
		System.out.println(list);
		// []
		// [Java, JSP, DataBase, JDBC, JSP]
		// List타입 특징1: 순서대로 저장된다.
		// List타입 특징2: 중복데이터 저장가능.
		
// list에 저장된 총 객체 수 얻기 size()
		int size = list.size();
		System.out.println("list에 저장된 총 객체 수: " + size);
		// list에 저장된 총 객체 수: 5
		// .size();메서드는 int형으로 반환 한다.

// list에 객체 삽입 add(index, 객체): 데이터를 해당 인덱스에 추가.
		list.add(2, "Oracle");
		System.out.println(list);
		// [Java, JSP, 오라클, DataBase, JDBC, JSP]
		// 2번인덱스에 오라클을 추가 (자동으로 배열크기가 늘어남)

// list[3] = "MySQL"; 이거는 배열수정할때.. 이거는 객체다. 배열이아니다. 메서드사용해야함
// list에 데이터 수정 set(index, 객체): 인덱스에 값을 수정.
		list.set(3, "MySQL");
		System.out.println(list);
		// [Java, JSP, Oracle, MySQL, JDBC, JSP]
		// 3번인덱스 값이 MySQL로 수정됨.
		
// list 내부 객체 가져오기 get(index)
		String s = list.get(2);
		System.out.println("2번 인덱스 객체: " + s);
		// 2번 인덱스 객체: Oracle = 객체를 가져오는거니깐! 타입(String)을 맞게 해야한다.
		
// list에 저장된 객체의 인덱스번호 확인하기 indexOf(객체)
		int idx = list.indexOf("MySQL");
		System.out.println("MySQL 의 인덱스 번호: " + idx);
		// MySQL 의 인덱스 번호: 3 = 인덱스 번호가 int형이기때문에 int타입으로 대입!!
		
		idx = list.indexOf("안녕");
		System.out.println(idx);
		// indexOf는 객체를 검색하지 못했을 경우 -1을 리턴함.!
		// -1
		
// list에서 객체데이터 삭제 remove(index), remove(obj)
		list.remove(5);
		System.out.println(list);
		// [Java, JSP, Oracle, MySQL, JDBC]
		// 5번 인덱스가 삭제됨. (알아서 배열 크기를 줄인다)
		
		list.remove(str1);
		System.out.println(list);
		// [JSP, Oracle, MySQL, JDBC]
		// Java 객체가 삭제됨. (알아서 배열 크기를 줄인다)
		
// list 내부에 저장된 데이터 유무 확인 참조변수.contains
		System.out.println(list.contains("JSP"));
		// true
		System.out.println(list.contains("안녕"));
		// false
		
// list 반복문 처리
		System.out.println("-------------------------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			// JSP
			// Oracle
			// MySQL
			// JDBC
		}
		System.out.println("-------------------------");
		for(String str : list) {
			System.out.println(str);
			// JSP
			// Oracle
			// MySQL
			// JDBC
		}
		
// list 전체 삭제
		list.clear();
		System.out.println(list);
		// []

// list내부 데이터가 전부 비어있는지 확인하는 메서드 isEmpty(): 없으면 true, 있으면 false
		System.out.println(list.isEmpty());
		// true
		
		if(list.isEmpty()) {
			System.out.println("list가 비어있음");
		}else {
			System.out.println("list가 비어있지 않음");
		}
		// list가 비어있음		
	}
}
