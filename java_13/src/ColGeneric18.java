import java.util.Arrays;
import java.util.List;

public class ColGeneric18 {
	public static void addNumber(List<? super Integer> list) {
		//super Integer�� �ع����� Integer ���� Ŭ������ �ްڴٴ°���
/*
<? super Integer> ���׸� ���ϵ� ī�� ���� Ư¡)
IntegerŸ�� �������θ� ���׸� Ÿ�� �� ��ȯ�� ���		
*/		
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf(" "+list.get(i));
		}
		System.out.println("=======================================");
	}
	public static void main(String[] args) {
		
		Number[] arr = {10,20,30};
		Object[] arr2 = {1,2,3};
		List<Number> li = Arrays.asList(arr);//Arrays.asList�� �Ϲݹ迭�� ArrayList����
		addNumber(li);
		
		List<Object> li2 = Arrays.asList(arr2);//Arrays.asList�� �Ϲݹ迭�� ArrayList����
		addNumber(li2);
	}
}
