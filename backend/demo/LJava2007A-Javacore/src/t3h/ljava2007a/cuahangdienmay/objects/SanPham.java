package t3h.ljava2007a.cuahangdienmay.objects;

// POJO class
public class SanPham {
	protected String hangSanXuat;
	protected String tenSanPham;
	protected String giaBan;
	
	// Getter va setter
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	
	public String getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(String giaBan) {
		this.giaBan = giaBan;
	}
	
	public SanPham(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
}
