package day03_test;

public class ArrayExample {
	public static void main(String[] args) {
		int arr[] = new int[8]; //정수 8개 를 넣겠다..
		int arr2[] = {1, 2, 3, 4, 5};

		for(int i = 0; i < arr.length; i++) { //arr.length주의 (0이8개)
			System.out.print(arr[i]);			
		}

		System.out.println();
		//arr2의, 0번인덱스부터, arr에, 0번인덱스부터, arr2.length(8자리복사)
		System.arraycopy(arr2, 0, arr, 0, arr2.length);

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
