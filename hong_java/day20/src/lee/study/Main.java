package lee.study;

public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int ret = cal.div(10, 0);
		System.out.println(ret);
	}
}
