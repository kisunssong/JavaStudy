
public class Static04 {
	public static void main(String[] args) {
		
		int a=40, b=30, c=10;
		
		int re;
		re=Math.max(a, b);
		System.out.println(a+"��"+b+"�� �ִ밪: "+re);
		re=Math.min(a, b);
		System.out.println(a+"��"+b+"�� �ּҰ�: "+re);
		
		System.out.println("������ ��: "+Math.PI);
		int r=5;
		double area=r*r*Math.PI;//������*������*������=���� ����
//		int*int*double �ڵ�������� ���ؼ� double*double*double �Ǿ ��������
//		doubleŸ��
		System.out.println("��������"+r+"�� ���� ����: "+area);
		
		int[][] arr= {
				{10,20}
		};//�ڹ� ���α׷� ���߿����� Ÿ�Եڿ� ���ȣ ���̴� ����� ��ȣ
		int[] arr2[] = {
				{30,40}
		};
		int arr3[][] = {
				{50,60}
		};
	}
}
