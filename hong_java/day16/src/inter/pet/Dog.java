package inter.pet;

public class Dog extends Animal implements IPet {

	@Override
	public void play() {
		System.out.println("�������� �ۿ��� ��ƿ�~");
	}

	@Override
	public void eat() {
		System.out.println("�������� ��Ḧ �Ծ��~");
	}

}
