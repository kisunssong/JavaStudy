class Parent {
/* 
����) a,b,c,d ������� ���������ڸ� �ڼտ��� ����� �� �ְ� �����԰� ���ÿ�
�ܺ����� ������ ���� ���ϰ� �Ͽ� �����Ѵ�.
*/
	int a;
	int b;
	int c;
	int d;
	
}

class Child16 extends Parent {
	Child16(int a, int b, int c, int d) {
		this.a=a; 
		this.b=b; 
		this.c=c; 
		this.d=d; 
	}
	void info() {
		System.out.printf("a:%d b:%d c:%d d:%d\n",a,b,c,d);
	}	
}
public class Ex16_02 {
	
	public static void main(String[] args) {
		Child16 n1 = new Child16(1,2,3,4);
		n1.info();
/*
����) �ܺΰ�ü���� ���� ������ ȣ������ ���� ��ü����� ���ȼ��� �����ϴ� �ڵ�� ����
*/
	}
}
