import java.util.HashMap;
import java.util.Map;

public class ColGeneric12 {
	public static void main(String[] args) {
/*
java.util�� map�÷��� �������̸� ������ �÷��� Ŭ���� HashMapd�� Ư¡)
1. jdk1.2���� �߰���
2. Ű,�� ������ ����ǰ� �ߺ�Ű�� ���ȵ�, �ߺ����� ������ �ִ�.
3. Ű,�� ������ ����Ǵ� �������� �ڷᱸ���̴�. Ű�� ���� �˻��ϱ� ������
�˻��ӵ��� ������
*/

// �޺κ� <> ���׸� Ÿ���� �����ϸ� �պκθ� ���� � Ÿ������ �����Ҽ� �ִ�.
//�� ������ jdk1.7���� �߰���.
		
		Map<String, Integer> m  = new HashMap<>();
		String[] sample = {"to","be","or","not","to","be","is","a","problem"};
			for(String a : sample) {
				Integer freq = m.get(a); //���� Ű�� ���� ���� ���� ������ null�̴�
				m.put(a, (freq == null) ? 1 : freq+1); //Ű,�� ������ ����.
// ������ �ܾ� �󵵼��� �����.
				//to,be�� ó������ 1 ����, �� to�� ������ ���� �ֱ⶧����.. freq+1�ؼ�:2
				
			}
			System.out.println(m.size()+"�ܾ �ִ�.");
			System.out.println(m);
		}
	}
/*
7�ܾ �ִ�.
{a=1, not=1, be=2, or=1, problem=1, is=1, to=2}
*/

