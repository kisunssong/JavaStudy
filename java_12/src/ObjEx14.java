class Value { //extends Object�� ���������� ����
	int value;
	
	Value(int value) {
		this.value = value;
	}
}


public class ObjEx14 {
	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		
		if(v1.equals(v2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
// �����ڿ� �����ְ� �񱳸��ϸ�, �ּҰ��� ���ϰԵȴ�
		
		v2 = v1; //���� �ּҸ� ����Ŵ
		
		if(v1.equals(v2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
	}
}
