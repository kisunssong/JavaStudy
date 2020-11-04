
public class PhoneMain {

	public static void main(String[] args) {
		
		//생성자는 객체를 생성할 때 1회 호출할 수 있습니다.
		Phone basic = new Phone();
		basic.info();

			
		Phone bluePhone = new Phone("사파이어");
		bluePhone.info();
		
		Phone galaxyS9 = new Phone("코발트블루", "갤럭시S9");
		galaxyS9.info();
		
		//3가지의 멤버변수를 초기화하는 생성자를 선언하시고
		//main메서드 내부에서 해당 객체를 만들어
		//info를 출력하세요. 객체 변수 이름은 shaomi
		
		Phone shaomi = new Phone("루비","샤오미",1000000);
		shaomi.info();
	}

}
