package t3h.ljava2007a.cuahangdienmay;

import t3h.ljava2007a.cuahangdienmay.objects.DienThoaiThongMinh;

public class Application {

	public static void main(String[] args) {
		DienThoaiThongMinh dienThoai = new DienThoaiThongMinh();
		dienThoai.setTenSanPham("Samsung galaxy");
		dienThoai.setHangSanXuat("Samsung");
		dienThoai.setGiaBan("1000");
		dienThoai.setCamera("30px");
		dienThoai.setHeDieuHanh("Android");
		dienThoai.setManHinh("DELL", "abcd");
		System.out.println(dienThoai.toString());
	}

}
