import java.util.Arrays;
import java.util.List;

class MyList {
	public static void printList(List<?> list) {
	//List<?> ���׸�Ÿ�� ���ϵ� ī�� Ư¡)
    //<?>�� ��� ��üŸ���� ��ġ������
		for(Object obj : list) {
			System.out.println(" "+obj);
		}
		System.out.println("==================================");
	}
}


public class ColGeneric19 {
	public static void main(String[] args) {
		
		List<Integer> li  = Arrays.asList(10,20,30);
		//asList()���׸� �޼���� �迭�� �÷���List�� ����
		
		List<String> li2 = Arrays.asList("kiki","haha");
		
		MyList.printList(li);
		MyList.printList(li2);
	}
}
