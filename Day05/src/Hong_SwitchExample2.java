
public class Hong_SwitchExample2 {
	public static void main(String[] args) {
		
		String[] foods = {"비빔밥", "사시미", "북경오리", "카레", "똠얌꿍"};
		
		//index범위의 난수 발생시키기
		//foods에  5개의 문자열이 들어간다.
		//idx를 정수 랜덤 5를 줘서,, 0 - 4 까지 무작위로 굴림
		//즉 foods의 인덱스 0,1,2,3,4 가 idx에서 불러온다
		int idx = (int)(Math.random() * 5);
		System.out.println("선택된 음식: " + foods[idx]);
		
		switch(foods[idx]) { //foods의[idx]<<번호와 case의 값이 일치하면 출력
		
		case "비빔밥":
			System.out.println("한식입니다.");
			break;
		case "사시미":
			System.out.println("일식입니다.");
			break;
		case "북경오리":
			System.out.println("중식입니다.");
			break;
		case "카레":
			System.out.println("맛있는 요리 입니다.");
			break;
		default:
			System.out.println("기타 음식 입니다.");

		}
		
	}

}
