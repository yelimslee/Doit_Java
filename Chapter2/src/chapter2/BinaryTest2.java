package chapter2;

public class BinaryTest2 {

	public static void main(String[] args) {
		int num = 0B000000000000000000000000000000101;  // 32비트  // 5
		int num2 = 0B11111111111111111111111111111011;  // -5
		
		int sum = num + num2;
		System.out.println(sum);
	}
}
