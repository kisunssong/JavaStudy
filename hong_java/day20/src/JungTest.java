
import java.util.*;

public class JungTest {
	
	int sum1=0;
	
	public List<Integer> integerToArray(int integer) {
		List<Integer> list = new ArrayList<>();
		
		while(integer == 0) {
			list.add(integer);
		}
		
		return list;
	}
	
	int sum(int integer) {
		List<Integer> input = this.integerToArray(integer);
		input.forEach((in) -> 
		sum1 += in);
		return sum1;
	}

	int sum(int[] integer) {
		int sum2 =0;
		int[] arr = integer;
		for(int i=0; i<arr.length; i++) {
			sum2 += arr[i];
		}
		return sum2;
	}

	//  int sum(int... arr) {
	//  int sum=0;
	//  for(int i=0; i<arr.length; i++) {
	//	     sum += arr[i];
	//  }
	//  return sum;
	//}




public static void main(String[] args) {

	JungTest api = new JungTest();
	int[] values1 = {1,2,3};
	int result = api.sum(values1);
	System.out.println("누적합: "+result);

	result = api.sum(new int[] {1,2,3,4,5});
	System.out.println("누적합: "+result);

	}
}
