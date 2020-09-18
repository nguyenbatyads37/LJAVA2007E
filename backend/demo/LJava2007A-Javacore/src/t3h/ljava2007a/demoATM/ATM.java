package t3h.ljava2007a.demoATM;

public class ATM {
	public long soTien;
	
	public void traTien(int value, TheATM theATM) {
		if (this.soTien >= value) {
			System.out.println("Rut tien thanh cong!");
			soTien = soTien - value;
			theATM.truTien(value);
			System.out.println("So tien con lai trong may ATM: " + this.soTien);
			System.out.println("So tien con lai trong the ATM: " + theATM.soDu);
		} else {
			System.out.println("So du trong cay ATM khong du!");
		}
	}
	
	public String toString() {
		return "So tien con lai trong may ATM: " + this.soTien;
	}
}
