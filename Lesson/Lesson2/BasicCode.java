import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class BasicCode {
	public static void main(String[] args) throws IOException {
		// System.out.println("Hello World");
		BasicCode hw = new BasicCode();
		// hw.example1(); // Java 变量类型
		// hw.example2(); // Java 算术运算符
		// hw.example3(); // Java 关系运算符
		// hw.example4(); //逻辑运算符
		// hw.example5(); // 赋值运算符
		// hw.example6(); // 条件运算符
		// hw.example7();//while
		// hw.example8();//do-while
		// hw.example9();// for
		// hw.example10(); // for++
		// hw.example11();// break
		// hw.example12();//continue
		// hw.example13(); // switch case 语句
		// hw.example14();// switch case 语句
		// hw.example15(); // math
		// hw.example16(); // 转义字符
		// hw.example17(); // StringBuffer
		// hw.example18();// 数组
		// hw.example19(); // 初始化 Date 对象
		// hw.example20(); // 输入输出
		// hw.example21(); // 异常处理

	}

	// Java 变量类型
	private void example1() {
		int myNum = 5;
		double myFloatNum = 5;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		System.out.println("myNum:" + myNum);
		System.out.println("myFloatNum:" + myFloatNum);
		System.out.println("myLetter:" + myLetter);
		System.out.println("myBool:" + myBool);
		System.out.println("myText:" + myText);
	}

	// Java 算术运算符
	private void example2() {
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("b / a = " + (b / a));
		System.out.println("b % a = " + (b % a));
		System.out.println("c % a = " + (c % a));
		System.out.println("a++   = " + (a++));
		System.out.println("a--   = " + (a--));
		// 查看 d++ 与 ++d 的不同
		System.out.println("d++   = " + (d++));
		System.out.println("++d   = " + (++d));
	}

	// Java 关系运算符
	private void example3() {
		int a = 10;
		int b = 20;
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("b >= a = " + (b >= a));
		System.out.println("b <= a = " + (b <= a));
	}

	// 逻辑运算符
	private void example4() {
		boolean a = true;
		boolean b = false;
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("!(a && b) = " + !(a && b));
	}

	// 逻辑运算符
	private void example5() {
		int a = 10;
		int b = 20;
		int c = 0;
		c = a + b;
		System.out.println("c = a + b = " + c);
		c += a;
		System.out.println("c += a  = " + c);
		c -= a;
		System.out.println("c -= a = " + c);
		c *= a;
		System.out.println("c *= a = " + c);
		a = 10;
		c = 15;
		c /= a;
		System.out.println("c /= a = " + c);
	}

	// 条件运算符
	private void example6() {
		int a, b;
		a = 10;
		// 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
		b = (a == 1) ? 20 : 30;
		System.out.println("Value of b is : " + b);

		// 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
		b = (a == 10) ? 20 : 30;
		System.out.println("Value of b is : " + b);
	}

	// while
	private void example7() {
		int x = 10;
		while (x < 20) {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		}
	}

	// do-while
	private void example8() {
		int x = 10;

		do {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		} while (x < 20);
	}

	// for
	private void example9() {
		for (int x = 10; x < 20; x = x + 1) {
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}
	}

	// for++
	private void example10() {
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");
		String[] names = { "James", "Larry", "Tom", "Lacy" };
		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
		}
	}

	// break
	private void example11() {
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int x : numbers) {
			// x 等于 30 时跳出循环
			if (x == 30) {
				break;
			}
			System.out.print(x);
			System.out.print("\n");
		}
	}

	// continue
	private void example12() {
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int x : numbers) {
			if (x == 30) {
				continue;
			}
			System.out.print(x);
			System.out.print("\n");
		}
	}

	// if...else if...else 语句
	private void example13() {
		int x = 30;

		if (x == 10) {
			System.out.print("Value of X is 10");
		} else if (x == 20) {
			System.out.print("Value of X is 20");
		} else if (x == 30) {
			System.out.print("Value of X is 30");
		} else {
			System.out.print("这是 else 语句");
		}
	}

	// switch case 语句
	private void example14() {
		int x = 30;
		// char grade = args[0].charAt(0);
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("优秀");
			break;
		case 'B':
		case 'C':
			System.out.println("良好");
			break;
		case 'D':
			System.out.println("及格");
			break;
		case 'F':
			System.out.println("你需要再努力努力");
			break;
		default:
			System.out.println("未知等级");
		}
		System.out.println("你的等级是 " + grade);
	}

	// math
	private void example15() {
		System.out.println("90 度的正弦值：" + Math.sin(Math.PI / 2));
		System.out.println("0度的余弦值：" + Math.cos(0));
		System.out.println("60度的正切值：" + Math.tan(Math.PI / 3));
		System.out.println("1的反正切值： " + Math.atan(1));
		System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI / 2));
		System.out.println(Math.PI);
	}

	// 转义字符
	private void example16() {
		System.out.println("他说\"YYDS!\"");
	}

	// StringBuffer
	private void example17() {
		StringBuilder sb = new StringBuilder(10);
		sb.append("PSTTEC..");
		System.out.println(sb);
		sb.append("!");
		System.out.println(sb);
		sb.insert(8, "Java");
		System.out.println(sb);
		sb.delete(5, 8);
		System.out.println(sb);
	}

	// 数组
	private void example18() {
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };

		// 打印所有数组元素
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}
		// 计算所有元素的总和
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
		// 查找最大元素
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("Max is " + max);
	}

	// 初始化 Date 对象
	private void example19() {
		Date date = new Date();
		// c的使用
		System.out.printf("全部日期和时间信息：%tc%n", date);
		// f的使用
		System.out.printf("年-月-日格式：%tF%n", date);
		// d的使用
		System.out.printf("月/日/年格式：%tD%n", date);
		// r的使用
		System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
		// t的使用
		System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
		// R的使用
		System.out.printf("HH:MM格式（24时制）：%tR", date);
	}

	// 输入输出
	private void example20() throws IOException {
		char c;
		// 使用 System.in 创建 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符, 按下 'q' 键退出。");
		// 读取字符
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
	}

	// 异常处理
	private void example21() {
		int a[] = new int[2];
		try {
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		} finally {
			a[0] = 6;
			System.out.println("First element value: " + a[0]);
			System.out.println("The finally statement is executed");
		}
	}
}
