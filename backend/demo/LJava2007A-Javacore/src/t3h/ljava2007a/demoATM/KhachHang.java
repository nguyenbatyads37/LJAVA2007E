package t3h.ljava2007a.demoATM;

public class KhachHang {
	public TheATM theATM;
	
	public void rutTien(TheATM theATM, ATM atm, int value) {
		// Kiem tra ma the
		if (theATM.maThe.equals("123456")
				&& theATM.matKhau.equals("123456")) {
			if (theATM.soDu >= value) {
				atm.traTien(value, theATM);
			} else {
				System.out.println("So du trong the khong hop le!");
			}
		} else {
			System.out.println("Sai thong tin the!");
		}
	}
}
