//�θ�� �ڽ��� ���Ϻ����� ���ǵ� ��� super.�������� ���
class Father03 {
	int x = 10;
	int y = 20;
	
	public Father03(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Child03 extends Father03 {
	int x = 100;
	int y = 200;
	int z = 30;
	
	public Child03(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	void print() {
		System.out.printf("�ڽ� -> x��ǥ:%d y��ǥ:%d z��ǥ:%d\n",x,y,z);
		System.out.printf("�θ� -> x��ǥ:%d y��ǥ:%d z��ǥ:%d",super.x,super.y,z);
	}
}

public class WeekEx03 {
	public static void main(String[] args) {
		Child03 ch = new Child03(10,20,30);
		ch.print();
	
	}
}
