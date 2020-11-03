package collection.list.student;

import java.math.BigDecimal;
import java.util.*;
public class test {
	public static void main(String[] args) {
		
		
		
		BigDecimal n1 = new BigDecimal("1000000000000000000000.2222222");
		BigDecimal n2 = new BigDecimal(24);
		
		
		
		System.out.println("더하기 add: " + n1.add(n2));
		System.out.println("빼기 subtract: " + n1.subtract(n2));
		System.out.println("곱하기 multiply: " + n1.multiply(n2));
		System.out.println("나누기(.4까지 5자리 반올림): " + n1.divide(n2, 4, BigDecimal.ROUND_HALF_UP));
		System.out.println("나누기(.4까지 5자리 반내림): " + n1.divide(n2, 4, BigDecimal.ROUND_HALF_DOWN));
		
/* 출력
더하기 add: 1000000000000000000024.2222222
빼기 subtract: 999999999999999999976.2222222
곱하기 multiply: 24000000000000000000005.3333328
나누기(.4까지 5자리 반올림): 41666666666666666666.6759
나누기(.4까지 5자리 반내림): 41666666666666666666.6759
*/		
	}
}





