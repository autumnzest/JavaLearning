
public class TypeCast {
	public static void main(String[] args) {
		TypeCast hw = new TypeCast();
//		 hw.example1(); // 自动类型转换
//		 hw.example2(); // 强制类型转换
		 hw.example3(); // 类型提升

	}

	private void example1() {
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double
		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0
	}

	private void example2() {
		double d = 10.24;
		long ll =  (long) d;// 10
		System.out.println(ll);
	}
	
	private void example3() {
		long count = 100000000;
		int price = 1999;
		long totalPrice = price * count;
		System.out.println(totalPrice);
	}
}
