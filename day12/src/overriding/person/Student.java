package overriding.person;

/*
 * �ٸ� Ŭ�������� ��������� �޼��带 �����޴� Ŭ������
 * �ڽ� Ŭ������� �θ��ϴ�.
 * �ڽ� Ŭ������ �̸� �ڿ� extends��� Ű���带 ����
 * �������� Ŭ������ �̸��� ���ݴϴ�.
 */

public class Student extends Person{
	
	String stuID;
	
	String info() {
		return "�̸�: " + name + ", ����: " + age + ", �й�: " + stuID;
	}
}
