import java.util.Arrays;

public class ArraysExample {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5}; //정수형 1-5까지 array에 담았음
		System.out.println(Arrays.toString(array)); //array에 있는거 출력
		
		int i=0; //초기값 0번 인덱스부터
		System.out.print("["); //처음 [ 출력
		while( i < array.length) { //length(5),0인덱스부터 -1 해서 4까지니깐 전부출력
			System.out.print(array[i++]+", "); //0인덱스 출력, 1인덱스출력, ----
			
		}
		System.out.print("]"); //마지막에 닫는다
	
	}
}
