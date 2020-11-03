
public class Hong_IfExample1 {
	public static void main(String[] args ) {
		
		//0 ~ 100까지의 정수형 난수를 발생.
		int point = (int)(Math.random() * 101);
		System.out.println("점수: " + point);
		
		//정수 랜덤중 point가 60이상이거나 같으면 아래 print문이 출력됨
		if(point >= 60) {
			System.out.println("시험에 합격했습니다.");
			System.out.println("60점 이상 입니다.");
		} else	{
			System.out.println("60점 미만 입니다.");
			System.out.println("시험에 불합격하셨습니다.");
		}
		System.out.println("수고하셨습니다.");
		
	}//end main

}//end class
