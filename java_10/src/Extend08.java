class Point10 {
	protected int x=10;
	protected int y=20;
		
	public Point10 (int x, int y) {
		this.x=x; this.y=y;
		System.out.printf("�θ��ǻ�����: x:%d y:%d\n",x,y);
	}//�������� ������ �ٸ� �����ڰ� �����ε��Ǹ� �ڹ������Ϸ��� ���̻� �⺻�����ڸ�
//���������� �������� �ʴ´�.
}

class Point11 extends Point10 {
	protected int z = 30;	
	
	public Point11 (int x, int y) {
		super(x,y);
		System.out.println("�ڼ� Ŭ���� ȣ��!");
	}
	
}


public class Extend08 {
	public static void main(String[] args) {
		Point11 p = new Point11(4,5);
		
	}
}
