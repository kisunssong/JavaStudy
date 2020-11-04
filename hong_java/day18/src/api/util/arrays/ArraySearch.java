package api.util.arrays;

import java.util.Arrays;

public class ArraySearch {
	
	public static void main(String[] args) {
		
		int[] scores = {75, 47, 23, 56, 89};
		
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		
		// �迭�� �����͸� ������������ �����ϴ� �޼��� sort()		
		Arrays.sort(scores2);
		System.out.println(Arrays.toString(scores));
		
		// ������ ���� ���ʷ� ����
		System.out.println(Arrays.toString(scores2));
		
		// �迭 ���ε������� �ε�����ȣ�� Ž���ϴ� �޼��� binarySearch()
		int index = Arrays.binarySearch(scores2, 75);
		System.out.println("75�� ����� �ε���: " + index);
		
		//�迭 �� equals(�迭1, �迭2)
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {1, 3, 5, 7, 9};
		
		// == �� �ּҸ� ���Ѵ�. �������ؾ��Ѵ�.equals��
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("�迭�� �� �׸��� ��ġ��.");
		}else {
			System.out.println("�迭�� �� �׸��� ��ġ���� ����");
		}		
	}
}
