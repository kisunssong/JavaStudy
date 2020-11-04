package inherit.phone;

public class DmbPhone extends Phone{
	
	
	int channel;
	
	DmbPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void receiveon() {
		System.out.println("방송 수신을 시작합니다.");
	}	
	void receiveoff() {
		System.out.println("방송 수신을 종료합니다.");		
	}
	void changechannel(int DPchannel) {
		channel = DPchannel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");
	}

}
