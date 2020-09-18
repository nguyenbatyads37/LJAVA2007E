package t3h.ljava2007a.cuahangdienmay.objects;

// POJO class
public class Laptop extends SanPham{
	
	public Laptop(String hangSanXuat) {
		super(hangSanXuat);
	}

	private String chipXuLy;
	private String chipDoHoa;
	private String oCung;
	
	public String getChipXuLy() {
		return chipXuLy;
	}
	public void setChipXuLy(String chipXuLy) {
		this.chipXuLy = chipXuLy;
	}
	
	public String getChipDoHoa() {
		return chipDoHoa;
	}
	public void setChipDoHoa(String chipDoHoa) {
		this.chipDoHoa = chipDoHoa;
	}
	
	public String getoCung() {
		return oCung;
	}
	public void setoCung(String oCung) {
		this.oCung = oCung;
	}
	
	public String toString() {
		return "Hang san xuat: " + this.hangSanXuat + "\n" +
				"Ten san pham: " + this.tenSanPham + "\n" +
				"Gia ban: " + this.giaBan + "\n" +
				"Chip xu ly: " + this.chipXuLy + "\n" +
				"Chip do hoa: " + this.chipDoHoa + "\n" +
				"O cung: " + this.oCung;
	}
}
