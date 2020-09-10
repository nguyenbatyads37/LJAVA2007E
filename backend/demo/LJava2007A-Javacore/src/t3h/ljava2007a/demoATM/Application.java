package t3h.ljava2007a.demoATM;

public class Application {

	public static void main(String[] args) {
		KhachHang khachHang = new KhachHang();
		TheATM theATM = new TheATM();
		ATM atm = new ATM();
		
		khachHang.rutTien(theATM, atm);
		
		// Demo class Object
		atm.soTien = 100;
		String mayATMStr = atm.toString();
		System.out.println(mayATMStr);
		
		khachHang.equals(new Object());
		Object myObject = new Object();
	}
}
