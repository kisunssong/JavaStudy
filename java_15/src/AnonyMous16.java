interface Remote{
	void turnOn();
	void turnOff();//public abstract이 생략된 추상메서드
}
public class AnonyMous16 {
	public static void main(String[] args) {
      //이벤트 처리를 위한 익명클래스(무명클래스) 문법->외부클래스명$번호.class
	 //AnonyMous16$번호.class
	 Remote rt=new Remote() {
		@Override
		public void turnOn() {
		  System.out.println("TV를 켬 이벤트가 발생");
		}
		@Override
		public void turnOff() {
		  System.out.println("TV를 껌 이벤트 발생");	
		}		 
	 };//익명클래스
	 rt.turnOn(); rt.turnOff();
	}
}
