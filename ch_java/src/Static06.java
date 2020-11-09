
public class Static06 {
	static int[] arr = new int[10];//배열크기 10인 정적배열arr생성
	
	static {
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
			//0.0이상 1.0미만->*10하면 0.0이상 10.0미만->+1하면 1.0이상 11.0미만
		}
	}
	
	public static void main(String[] args) {
		for(int i:arr) {
			System.out.printf(" "+i);
		}
	}
}
