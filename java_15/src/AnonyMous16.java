interface Remote{
	void turnOn();
	void turnOff();//public abstract�� ������ �߻�޼���
}
public class AnonyMous16 {
	public static void main(String[] args) {
      //�̺�Ʈ ó���� ���� �͸�Ŭ����(����Ŭ����) ����->�ܺ�Ŭ������$��ȣ.class
	 //AnonyMous16$��ȣ.class
	 Remote rt=new Remote() {
		@Override
		public void turnOn() {
		  System.out.println("TV�� �� �̺�Ʈ�� �߻�");
		}
		@Override
		public void turnOff() {
		  System.out.println("TV�� �� �̺�Ʈ �߻�");	
		}		 
	 };//�͸�Ŭ����
	 rt.turnOn(); rt.turnOff();
	}
}
