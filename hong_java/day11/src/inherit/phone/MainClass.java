package inherit.phone;

public class MainClass {

	public static void main(String[] args) {
		
		DmbPhone dp = new DmbPhone("햅틱", "메탈그레이", 10);
		System.out.println("모델: " + dp.model);//Phone상속
		System.out.println("색상: " + dp.color);//Phone상속
		System.out.println("채널: " + dp.channel);//DmbPhone
		dp.changechannel(10);
		System.out.println("================================");
		DmbPhone gp = new DmbPhone("안녕", "ㅎㅎㅎ", 50);
		System.out.println("모델: " + dp.model);//Phone상속
		System.out.println("색상: " + dp.color);//Phone상속
		System.out.println("채널: " + dp.channel);//DmbPhone
		gp.changechannel(50);
		System.out.println("================================");
		dp.powerOn();//Phone상속
		dp.ring();//Phone상속
		dp.hangUp();//Phone상속
		
		dp.receiveon();//DmbPhone
		dp.changechannel(5);//DmbPhone 매개변수를 주고, 메서드 호출
		dp.receiveoff();//DmbPhone
		dp.powerOff();//DmbPhone

	}

}
