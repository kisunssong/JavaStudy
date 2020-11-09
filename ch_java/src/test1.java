import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		
		int[][] arr= new int[3][];
		arr[0] = new int [3];
		arr[1] = new int [3];
		arr[2] = new int [3];
		arr[0][0] = 15;
		System.out.println(Arrays.toString(arr[0]));
	}// Ãâ·Â : [15, 0, 0]
}
