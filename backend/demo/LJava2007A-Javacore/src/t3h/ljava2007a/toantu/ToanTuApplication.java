package t3h.ljava2007a.toantu;

import t3h.ljava2007a.cuahangdienmay.objects.DienThoaiThongMinh;

public class ToanTuApplication {

	public static void main(String[] args) {
		int chiaLayDu = 3%2;
		System.out.println("Chia lay du: 3%2 = "+ chiaLayDu);
		int num1 = 10;
		int num2 = 5;
		System.out.println("Phep cong: 10 + 5 = " + (num1 + num2));
		System.out.println("Phep chu: 10 - 5 = " + (num1 - num2));
		System.out.println("Phep nhan: 10 x 5 = " + (num1 * num2));
		System.out.println("Phep chia: 10 / 5 = " + (num1 / num2));
		
		System.out.println("Phep ++: 10++ = " + num1++);
		System.out.println("Sau 10++ = " + num1);
		System.out.println("Phep ++: ++10 = " + ++num1);
		System.out.println("Sau ++10 = " + num1);
		
		String dienThoai1 = new String("abc");
		String dienThoai2 = new String("abc");
		System.out.println("So sanh 2 object bang == " + (dienThoai1 == dienThoai2));
		System.out.println("So sanh 2 object bang equals " + (dienThoai1.equals(dienThoai2)));
		
		System.out.println(10 == 10 && num1 != num2);
		System.out.println(!(10 == 11 || num1 != num2));
	}

}
