import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeExample {

	public static void main(String[] args) {
		DateTimeExample hw = new DateTimeExample();
//		 hw.example1(); // 初始化 Date 对象
//		hw.example2(); // 格式化日期
//		hw.example3(); // 计算时间间隔
	}
	
	// 初始化 Date 对象
	private void example1() {
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
	
	private void example2() {
	      Date dNow = new Date( );
	      System.out.println("当前时间为: " + dNow);
	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy/MM/dd");
	      System.out.println("当前时间为: " + ft.format(dNow));
	}
	
	private void example3() {
	      try {
	          long start = System.currentTimeMillis( );
	          System.out.println(new Date( ) + "\n");
	          Thread.sleep(5*60*10);
	          System.out.println(new Date( ) + "\n");
	          long end = System.currentTimeMillis( );
	          long diff = end - start;
	          System.out.println("Difference is : " + diff);
	       } catch (Exception e) {
	          System.out.println("Got an exception!");
	       }
	}
}
