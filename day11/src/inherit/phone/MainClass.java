package inherit.phone;

public class MainClass {

	public static void main(String[] args) {
		
		DmbPhone dp = new DmbPhone("��ƽ", "��Ż�׷���", 10);
		System.out.println("��: " + dp.model);//Phone���
		System.out.println("����: " + dp.color);//Phone���
		System.out.println("ä��: " + dp.channel);//DmbPhone
		dp.changechannel(10);
		System.out.println("================================");
		DmbPhone gp = new DmbPhone("�ȳ�", "������", 50);
		System.out.println("��: " + dp.model);//Phone���
		System.out.println("����: " + dp.color);//Phone���
		System.out.println("ä��: " + dp.channel);//DmbPhone
		gp.changechannel(50);
		System.out.println("================================");
		dp.powerOn();//Phone���
		dp.ring();//Phone���
		dp.hangUp();//Phone���
		
		dp.receiveon();//DmbPhone
		dp.changechannel(5);//DmbPhone �Ű������� �ְ�, �޼��� ȣ��
		dp.receiveoff();//DmbPhone
		dp.powerOff();//DmbPhone

	}

}
