class Father06 {
	void f06() {
		System.out.println("����Ŭ���� �޼��� f06()");
	}
}
class Son01 extends Father06 {
	void s01() {
		System.out.println("ù��° �ڼ�Ŭ���� s01");
	}
}
class Son02 extends Father06 {
	void s02() {
		System.out.println("�ι�° �ڼ�Ŭ���� s02");
	}
}
public class WeekEx06 {
	public static void main(String[] args) {
		
		print(new Son01());
		print(new Son02());
		
		Father06 f = new Son01();
// f�� Son02Ÿ������ �ٿ�ĳ���� ����ȯ�� ����ϳ�? ���Ǹ� ��.
// instanceof�� ����ȯ ���� �Ǵ� ������ Ű����
// Son01 > Son02�� ����ȯ �ǳĴ� ��� ����..Son01�� Son02�� �ƹ� ���谡����!!
		if(f instanceof Son02) {
			Son02 s02 = (Son02)f;
		}else {
			System.out.println("�Ұ���");
		}
	}
	
	static void print(Father06 f) {
		//Son01,Son02 �� Father06���� ����ȯ ��������..(����̵Ǿ������� ���)
		if(f instanceof Father06) {
			System.out.println(f+"�� �ȴ�");
		}else {
			System.out.println(f+"�� �ȵȴ�");
		}
	}
}
