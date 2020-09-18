package t3h.ljava2007a.demoATM;

public class Application {

	public static void main(String[] args) {
		KhachHang khachHang = new KhachHang();
		TheATM theATM = new TheATM();
		theATM.soDu = 2000;
		theATM.maThe = "123456";
		theATM.matKhau = "123456";
		ATM atm = new ATM();
		atm.soTien = 10000;
		
		khachHang.rutTien(theATM, atm, 1000);
		
		// Demo class Object
//		atm.soTien = 100;
//		String mayATMStr = atm.toString();
//		System.out.println(mayATMStr);
//		
//		khachHang.equals(new Object());
//		Object myObject = new Object();
	}
}
