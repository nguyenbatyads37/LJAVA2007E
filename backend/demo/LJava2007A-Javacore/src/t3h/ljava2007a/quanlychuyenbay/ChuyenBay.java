package t3h.ljava2007a.quanlychuyenbay;

import java.util.List;

public class ChuyenBay {
	private String tenChuyenBay;
	private int thoiGianBay;
	private List<KhachHang> danhSachKhachHang;
	
	public int tinhTongTien() {
		
	}
	
	public void inThongTinKhach() {
		for (int i = 0; i < this.danhSachKhachHang.size(); i++) {
			KhachHang khachHang = danhSachKhachHang.get(i);
			System.out.println("Khach hang: " + khachHang.getTen());
			System.out.println("Gioi tinh: " + khachHang.gioiTinh);
			System.out.println("Tuoi: " + khachHang.tuoi);
			System.out.println("Thoi gian bay: " + this.thoiGianBay);
			System.out.println("So luong ve khach mua: " + khachHang.getSoLuongVe());
			System.out.println("Tien khach phai tra: " + khachHang.tinhTien(this));
		}
	}
	
	public String getTenChuyenBay() {
		return tenChuyenBay;
	}
	public void setTenChuyenBay(String tenChuyenBay) {
		this.tenChuyenBay = tenChuyenBay;
	}
	public int getThoiGianBay() {
		return thoiGianBay;
	}
	public void setThoiGianBay(int thoiGianBay) {
		this.thoiGianBay = thoiGianBay;
	}
	public List<KhachHang> getDanhSachKhachHang() {
		return danhSachKhachHang;
	}
	public void setDanhSachKhachHang(List<KhachHang> danhSachKhachHang) {
		this.danhSachKhachHang = danhSachKhachHang;
	}
	
	
}
