package collection.list.student;

import java.math.BigDecimal;
import java.util.*;
public class test {
	public static void main(String[] args) {
		
		
		
		BigDecimal n1 = new BigDecimal("1000000000000000000000.2222222");
		BigDecimal n2 = new BigDecimal(24);
		
		
		
		System.out.println("���ϱ� add: " + n1.add(n2));
		System.out.println("���� subtract: " + n1.subtract(n2));
		System.out.println("���ϱ� multiply: " + n1.multiply(n2));
		System.out.println("������(.4���� 5�ڸ� �ݿø�): " + n1.divide(n2, 4, BigDecimal.ROUND_HALF_UP));
		System.out.println("������(.4���� 5�ڸ� �ݳ���): " + n1.divide(n2, 4, BigDecimal.ROUND_HALF_DOWN));
		
/* ���
���ϱ� add: 1000000000000000000024.2222222
���� subtract: 999999999999999999976.2222222
���ϱ� multiply: 24000000000000000000005.3333328
������(.4���� 5�ڸ� �ݿø�): 41666666666666666666.6759
������(.4���� 5�ڸ� �ݳ���): 41666666666666666666.6759
*/		
	}
}





