
public class Date06 {
	public static void main(String[] args) {
		
		String animals = "dog,cat,beer";
		String[] arr = animals.split(",");
		//구분자를 기준으로 문자열을 분리해서 배열로 만듬

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			//dog
			//cat
			//beer
		}
		for(String animal : arr) {
			System.out.println(animal);
			//dog
			//cat
			//beer
		}
		String s = "java.lang.Object";
		String c = s.substring(10);
		//10번부터 출력. 첫 문자 시작 0 : Object
		
		String p = s.substring(5, 9);
		//5번부터 9아래까지 출력. 첫 문자 시작 0 : lang
		
		s = "OBJECT";
		String s1 = s.toLowerCase();
		//소문자로 바꿈 : object
	}
}
