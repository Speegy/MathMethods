
public class Runner {

	public static void main(String[] args) {
		
		int number;
		number = 12;
		int number1 = 2;
		float change = 5.5f;
		String hwStr = "Hello World";		
		
//		Println
		System.out.println(hwStr);
		System.out.println(number);
		System.out.println(change);
		
//		Print
		System.out.print(hwStr);
		System.out.print(number);
		System.out.print(change);
		System.out.println();
		
		System.out.println(add(number, number1+5));
		System.out.println(sub(number, number1+5));
		System.out.println(mult(number, number1+5));
		System.out.println(div(number, number1+5));
	}

	public static int add(int a, int b) {
		return a + b;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
	public static int mult(int a, int b) {
		return a * b;
	}
	public static double div(double a, double b) {
		return a / b;
	}
}
