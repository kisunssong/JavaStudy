class GenericClass<T> {
	private T value;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	
	
}

public class ColGeneric15 {
	public static void main(String[] args) {
		GenericClass<Double> obj01 = new GenericClass<Double>();
		//�Ǽ����ڰ��� ���尡���� �÷��� ���׸� obj01�� ����. ���׸� Ÿ������ �⺻Ÿ����
		//�ȵǰ� ����Ÿ�Ը� �����ϴ�.
		
		obj01.setValue(10.3);
		System.out.println("��ȯ��: "+obj01.getValue());
		
		GenericClass<Integer> obj02 = new GenericClass<>();
		//�޺κ�<> ���׸�(���׸���) Ÿ���� �������� => jdk1.7���� ����
		obj02.setValue(100);
		int result = obj02.getValue();
		System.out.println("������ȯ��: "+obj02.getValue());
		
		GenericClass<String> obj03 = new GenericClass<>();
		obj03.setValue("�����");
		System.out.println("��ȯ ���ڿ�: "+obj03.getValue());
	}
}
