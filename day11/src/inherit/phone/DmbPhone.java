package inherit.phone;

public class DmbPhone extends Phone{
	
	
	int channel;
	
	DmbPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void receiveon() {
		System.out.println("��� ������ �����մϴ�.");
	}	
	void receiveoff() {
		System.out.println("��� ������ �����մϴ�.");		
	}
	void changechannel(int DPchannel) {
		channel = DPchannel;
		System.out.println("ä�� " + channel + "������ �����մϴ�.");
	}

}
