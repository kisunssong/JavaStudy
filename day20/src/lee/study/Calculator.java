package lee.study;

public class Calculator {
	public int div(int n1, int n2) {
		int ret = 0;
		if(n2 == 0) {
			throw new MyRuntimeException("0Àº ¾ÈµÊ");
		}
		ret = n1 / n2;
		return ret;
	}
}
