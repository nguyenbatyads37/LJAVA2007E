package t3h.ljava2007a.quanlychuyenbay;

import java.util.List;

public class ChuyenBay {
	private String tenChuyenBay;
	private int thoiGianBay;
	private List<KhachHang> danhSachKhachHang;
	
	public void inThongTinKhach() {
		int tongTien = 0;
		for (int i = 0; i < this.danhSachKhachHang.size(); i++) {
			KhachHang khachHang = danhSachKhachHang.get(i);
			System.out.println("Khach hang: " + khachHang.getTen());
			System.out.println("Gioi tinh: " + khachHang.gioiTinh);
			System.out.println("Tuoi: " + khachHang.tuoi);
			System.out.println("Thoi gian bay: " + this.thoiGianBay);
			System.out.println("So luong ve khach mua: " + khachHang.getSoLuongVe());
			int tienKhachTra = khachHang.tinhTien(this);
			System.out.println("Tien khach phai tra: " + tienKhachTra);
			tongTien += tienKhachTra;
		}
		System.out.println("Tong tien khach phai tra: " + tongTien);
	}
	
	public void themKhachHang(KhachHang khachHang) {
		this.danhSachKhachHang.add(khachHang);
	}
	
	public ChuyenBay(String tenChuyenBay, int thoiGianBay, List<KhachHang> danhSachKhachHang) {
		super();
		this.tenChuyenBay = tenChuyenBay;
		this.thoiGianBay = thoiGianBay;
		this.danhSachKhachHang = danhSachKhachHang;
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
