
public class Static06 {
	static int[] arr = new int[10];//�迭ũ�� 10�� �����迭arr����
	
	static {
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
			//0.0�̻� 1.0�̸�->*10�ϸ� 0.0�̻� 10.0�̸�->+1�ϸ� 1.0�̻� 11.0�̸�
		}
	}
	
	public static void main(String[] args) {
		for(int i:arr) {
			System.out.printf(" "+i);
		}
	}
}
