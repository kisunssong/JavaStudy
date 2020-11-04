package poly.basic;

/*
 - �ϳ��� Ŭ���� ���Ͼȿ� ���� Ŭ�������� ������ �� �ֽ��ϴ�.
 ��, ���ϸ�� ������ �̸��� ���� Ŭ������ �ݵ�� �����ؾ� �ϸ�
 �ش� Ŭ������ public�����ڸ� ���� �� �ֽ��ϴ�.
 */

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
	
	/*
	 - �������̶� �ڽİ�ü�� �θ��� Ÿ���� ���� �� �ִ� Ư���� �ǹ��մϴ�.
	 ��, �θ� Ÿ�� ������ �ڽ� ��ü�� �ּҰ��� �������� �����ų �� 
	 �ִٴ� ���Դϴ�.
	 */
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b; //BŸ�� -> AŸ�� �ڵ� �� ��ȯ(promotion)
	A a2 = new B();
	A a3 = c;
	A a4 = d;
	B b1 = new D();
	A a5 = e;
	C c1 = new E();
	
//	B b2 = new E(); //��Ӱ��谡 ���ٸ� ������ ������ �Ұ���.
//	C c2 = new D();
	
	Object o1 = new A(); // ������Ʈ�� ����� ����Ÿ��
	Object o2 = "�ȳ�";
	Object o3 = new E();
	

}
