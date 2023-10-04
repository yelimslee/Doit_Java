package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		// &(AND)연산자
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 & num2;
		System.out.println(result);
		
		// |(OR)연산자
		int num3 = 5;
		int num4 = 10;
		
		int result2 = num3 | num4;
		System.out.println(result2);
		
		// ^(XOR)연산자
		int num5 = 5;
		int num6 = 10;
		
		int result3 = num3 ^ num4;
		System.out.println(result3);
		
		// ~(반전)연산자
		int num7 = 10;
		int result4 = ~num7;
		System.out.println(result4);
		
		// <<연산자
		int num8 = 5;
		System.out.println(num8 << 1);  // 결과는 x2랑 같음, ...2^2
		System.out.println(num8 << 2);  // x2^2
		System.out.println(num8 << 3);  // x2^3
		
		System.out.println(num8 >> 1);  // 00000010
		
	}

}
