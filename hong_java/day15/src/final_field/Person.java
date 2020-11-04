package final_field;

public class Person {
	
	/*
	 * final변수는 한 번 값이 대입되면 값을 변경할 수 없는
	 * 특징이 있기 때문에 선언시에 직접 초기화하거나 생성자를 통한
	 * 초기화 로직을 작성하여 데이터가 반드시 한번 저장될 수 있게 
	 * 해야 합니다.
	 */
	
	public final String nation = "대한민국";
	public final String name;
	public int age;
	
	public Person(String name) {
//		this.nation = "중국"; // final 이라서 값 변경 안됨.
		this.name = name;
	}

}
