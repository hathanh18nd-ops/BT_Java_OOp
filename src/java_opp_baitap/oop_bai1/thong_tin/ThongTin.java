package java_opp_baitap.oop_bai1.thong_tin;

import java_opp_baitap.oop_bai1.nhan_vien.NhanVien;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        nv.thongTinNV(1001, "Nguyễn Văn A", 19);
        nv1.thongTinNV(1002, "Nguyễn Văn B", 29);
        nv2.thongTinNV(1003, "Nguyễn Văn C", 20);
        nv.displayInformation();
        nv1.displayInformation();
        nv2.displayInformation();
        nv.thongTinNV1(1004, "Hapt", 26);
    }
}
