class Computer {
/*
����) �ڹ� 5�������� �߰��� �������� ������ ����Ͽ� �Ű����� ����, ���ڰ� ������
�ٸ� �޼��尡 �����ε� �� ��� �Ѱ��� �޼���� �������ڷ� �޾� �迭�� ó���ؼ� �Ϲ�
for �ݺ������� ������ �迭���� �������� ���ؼ� �����Ѵ�.
*/
	
//	public int sum(int[] arr) {
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		return sum;
//	}
	
	int sum(int... arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

public class Week18 {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		int[] values = {1,2,3};
		int result = com.sum(values);
		System.out.println("������: "+result);
		
		result = com.sum(new int[] {1,2,3,4,5});
		System.out.println("������: "+result);
		
		result = com.sum(10,20,30);
		System.out.println("����: "+result);
	}
}
