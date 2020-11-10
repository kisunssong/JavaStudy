class A2 {
	A2() {
		super();
	}
	@Override
	public String toString() {
		return "4";
	}
}
class B2 extends A2 {
	B2() {
		super();
	}
	@Override
	public String toString() {
		return super.toString()+"3";
	}
}

public class SubEx09 {
	public static void main(String[] args) {
		System.out.println(new B2().toString());
		System.out.println(new B2());
	}
}
