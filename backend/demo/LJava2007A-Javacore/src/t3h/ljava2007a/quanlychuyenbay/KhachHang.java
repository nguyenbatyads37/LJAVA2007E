package t3h.ljava2007a.quanlychuyenbay;

public class KhachHang extends ConNguoi{
	private Ve ve;
	private int soLuongVe;
	
	public void mua(Ve ve, int soLuongVe) {
		this.ve = ve;
		this.soLuongVe = soLuongVe;
	}
	
	public int tinhTien(ChuyenBay chuyenBay) {
		int result = ve.getGiaVe();
		if (ve.getLoaiVe() == LoaiVe.VE_TRUNG_CAP
				&& this.tuoi < 6) {
			result = result - (result * 20)/100;
		}
		
		int thoiGianBay = chuyenBay.getThoiGianBay();
		if ((thoiGianBay >= 20 && thoiGianBay <= 24)
				|| (thoiGianBay >= 0 && thoiGianBay <= 4)) {
			result = result - (result * 50)/100;
		}
		
		return result;
	}

	public Ve getVe() {
		return ve;
	}

	public void setVe(Ve ve) {
		this.ve = ve;
	}

	public int getSoLuongVe() {
		return soLuongVe;
	}

	public void setSoLuongVe(int soLuongVe) {
		this.soLuongVe = soLuongVe;
	}
}
