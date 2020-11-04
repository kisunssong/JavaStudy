package final_field;

public class MainClass {
	
	public static void main(String[] args) {
		//이름 역시 final이기때문에 지정해노면 못바꿈
		Person kim = new Person("김한국");
		
//		kim.nation = "미국"; // 클래스에 final로 선언 했기때문에 변경 안됨.
//		kim.name = "김마이클"; // 클래스에 final로 선언 했기때문에 변경 안됨.
		kim.age = 17;
		kim.age = 27;
		System.out.println("국적: " + kim.nation);
		System.out.println("이름: " + kim.name);
		System.out.println("나이: " + kim.age);
		
		//이름 역시 final이기때문에 지정해노면 못바꿈
		Person park = new Person("박중국"); 
		park.age = 30;
		System.out.println("국적: " + park.nation);
		System.out.println("이름: " + park.name);
		System.out.println("나이: " + park.age);
	}

}
