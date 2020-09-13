package t3h.ljava2007a.cuahangdienmay.objects;

// POJO class
public class DienThoaiThongMinh extends SanPham {
	private String manHinh;
	private String heDieuHanh;
	private String camera;
	
	public String getManHinh() {
		return manHinh;
	}
	
	//Overloading method 1
	public void setManHinh(String manHinh) {
		this.manHinh = manHinh;
	}
	//Overloading method 2
	public void setManHinh(String hang, String ma) {
		this.manHinh = hang + "-" + ma;
	}
	//Overloading method 3
	public void setManHinh(int hang) {
	}
	
	public String getHeDieuHanh() {
		return heDieuHanh;
	}
	public void setHeDieuHanh(String heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}
	
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	// Overriding
	@Override
	public String toString() {
		return "Hang san xuat: " + this.hangSanXuat + "\n" +
				"Ten san pham: " + this.tenSanPham + "\n" +
				"Gia ban: " + this.giaBan + "\n" +
				"Man hinh: " + this.manHinh + "\n" +
				"He dieu hanh: " + this.heDieuHanh + "\n" +
				"Camera: " + this.camera;
	}
	
	// Default constructor
	public DienThoaiThongMinh() {
		super("");
	}
	
	// Customize constructor
	public DienThoaiThongMinh(String manHinh) {
		super("");
		this.manHinh = manHinh;
	}
}
