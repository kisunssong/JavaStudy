import java.awt.List;
import java.util.ArrayList;

/*java.util ��Ű���� �÷��ǰ� �迭�� �������� Ư¡)
�迭�� Ư¡)
1. �迭�� ������ ũ���̰� �������� ���Ұ��� �Ѳ����� ���尡���ϴ�.
2. �迭�� �� �Ѱ��� �ڷ����� ���尡���ϴ�.

�÷��� Ư¡)
1. �÷����� ������ ũ���̰�, �������� ���Ұ��� ������ �� �ִ�.
2. �÷����� �������� �ڷ����� ������ �� �ִ�.
*/

public class ColGeneric01 {
	public static void main(String[] args) {
//		int[] arr = {10,20,"a"}; // ������ ������... �Ѱ���Ÿ�Ը� ���� (�Ϲݹ迭)
		
		ArrayList list = new ArrayList(); // ��ĳ�����ϸ鼭 �÷��� list����
		list.add(10); 
		list.add(10,3); 
		list.add("ȫ�浿");
		System.out.println("�÷���ũ��: "+list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(" "+list.get(i));
		}
	}
}
