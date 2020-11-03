package day03_test;

public class ArrayReferenceExample {
	public static void main(String[] args) {
		
		int[] array1 = { 2, 3, 5, 7, 11, 13, 17, 19 }; //2->0, 5->2
		int[] array2;
		
		printArray (array1);
		array2 = array1;
		array2[0] = 0;
		array2[2] = 2;
		printArray (array1);		
	}
	
	public static void printArray(int[] array) {
		System.out.print('<');
		for ( int i = 0; i < array.length; i++ ) {
			System.out.print(array[i]);
			if( i + 1 < array.length) {
				System.out.print(", ");
			}
		}
		System.out.println('>');
		
	}

}
