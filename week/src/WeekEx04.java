class Father04 {
	protected int a;
	protected int b;
	
	Father04 (int a, int b) {
		//super(); Object�� �⺻�����ڸ� ȣ��, �Ͻ�������.
		this.a = a;
		this.b = b;
	}
}
class Child04 extends Father04{
	protected int c;
	
	Child04 () {
		super(100,200); //�����ε� �� ������ ȣ��
	}
	Child04 (int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
	void print() {
		System.out.printf("a��:%d b��:%d c��:%d\n",a,b,c);
	}
}
public class WeekEx04 {
	public static void main(String[] args) {
//		�⺻������ ȣ��� super(100,200)�� �θ������(a,b)�Ű������� �޾� �� �Է�
		Child04 ch = new Child04();
		ch.print();
		//a��:100 b��:200 c��:0
		
//		���ڰ������� ȣ��� 10,20�� �θ������(a,b)�Ű������� ����, 30�� �ڽ��� �Է�
		Child04 ch1 = new Child04(10,20,30);
		ch1.print();
		//a��:10 b��:20 c��:30
	}
}
