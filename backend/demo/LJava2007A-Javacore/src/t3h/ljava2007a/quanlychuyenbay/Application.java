package t3h.ljava2007a.quanlychuyenbay;

import java.util.ArrayList;

public class Application {
	
	public static Ve veCaoCap = new Ve(10000, LoaiVe.VE_CAO_CAP);
	public static Ve veThuongGia = new Ve(5000, LoaiVe.VE_THUONG_GIA);
	public static Ve veTrungCap = new Ve(2000, LoaiVe.VE_TRUNG_CAP);

	public static void main(String[] args) {
		ChuyenBay chuyenBay = 
				new ChuyenBay("Chuyen 1", 20, new ArrayList<KhachHang>());
		KhachHang khach1 = new KhachHang();
		khach1.setTen("Nguyen Van A");
		khach1.setGioiTinh("Nam");
		khach1.setTuoi(5);
		khach1.mua(veCaoCap, 1);
		
		KhachHang khach2 = new KhachHang();
		khach2.setTen("Nguyen Van B");
		khach2.setGioiTinh("Nu");
		khach2.setTuoi(5);
		khach2.mua(veTrungCap, 1);
		chuyenBay.themKhachHang(khach1);
		chuyenBay.themKhachHang(khach2);
		
		chuyenBay.inThongTinKhach();
	}
}
