
public class FunctionExample {

	public static void main(String[] args) {
//		 int i = 5;
//		 int j = 2;
//		 int k = max(i, j);
//		 System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);

//		 printGrade(78.5);

//		 double i = 5.11;
//		 double j = 2.22;
//		 double k = max(i, j);
//		 System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);

		functionTest();// 构造方法
	}

	public static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	/** 返回两个整数变量较大的值 */
	public static int max(int num1, int num2) {
		int result;
		if (num1 > num2)
			result = num1;
		else
			result = num2;

		return result;
	}

	public static void printGrade(double score) {
		if (score >= 90.0) {
			System.out.println('A');
		} else if (score >= 80.0) {
			System.out.println('B');
		} else if (score >= 70.0) {
			System.out.println('C');
		} else if (score >= 60.0) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}

	public static void functionTest() {
		FuncTest f1 = new FuncTest(10);
		FuncTest f2 = new FuncTest(20);
		System.out.println(f1.x + " " + f2.x);
	}
}
