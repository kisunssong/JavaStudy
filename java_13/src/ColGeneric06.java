import java.util.Vector;

public class ColGeneric06 {
	public static void main(String[] args) {
		
		Vector vec = new Vector(4,3); //ù��° ����:(4)�� ����ũ��, �ι�° ����:(3)�� ����ġ
		System.out.println("���� ũ��: "+vec.size()); //�߰� ���� ������ ���: 0
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		System.out.println("����ũ��: "+vec.size());
		System.out.println("���Ϳ뷮: "+vec.capacity());
		
		for(int i=1; i<=5; i++) {
			vec.add(i*10);
		}
		System.out.println("����ũ��: "+vec.size()); //����ũ��: ���Ұ���
		System.out.println("����ũ��: "+vec.capacity()); //���Ϳ뷮: 4+3=7
		System.out.println("����ũ��: "+vec.firstElement()); //10
		System.out.println("����ũ��: "+vec.get(1)); // 1�� �ε���: 20
		System.out.println("����ũ��: "+vec.lastElement()); //50
	}
}
