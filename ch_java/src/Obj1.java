class Data15 {
	int x;
	
//	public String toString() {
//		return  "��: "+x;
//	}
}
public class Obj1 {
	
	static Data15 copy(Data15 d) {
		Data15 tmp=new Data15();
		tmp.x=d.x;//���� ����=>tmp�� d��ü�ּҴ� �ٸ���
		return tmp;//����ȯ�Ǵ� ���� tmp��ü�ּҰ� ��ȯ
	}

	
	public static void main(String[] args) {
		Data15 d=new Data15();
		d.x=10;
		
		Data15 d2=copy(d);//copy()�޼��� ȣ���ϸ鼭 d��ü�ּҸ� ����.
		System.out.println("d.x="+d.x); //10
		System.out.println("d2.x="+d2.x); //10
		System.out.println(d2.toString());
	}
}
