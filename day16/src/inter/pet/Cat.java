package inter.pet;

public class Cat extends Animal implements IPet{

	@Override
	public void play() {
		System.out.println("����̴� �濡�� ��ƿ�~");
		
	}

	@Override
	public void eat() {
		System.out.println("����̴� ������ �Ծ��~");
		
	}
	
}
