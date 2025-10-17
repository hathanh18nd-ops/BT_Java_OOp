package java_opp_baitap.oop_bai1.nhan_vien;

public class NhanVien {
    static String company_name = "Cty NoDo";
    int id;
    String hoTen;
    int tuoi;

    public void thongTinNV(int id, String hoTen, int tuoi) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }
    public void displayInformation(){
        System.out.println(company_name+" "+id+" "+hoTen+" "+tuoi);
    }
    public void thongTinNV1(int id, String hoTen, int tuoi) {
        System.out.println(company_name+"--"+id+"--"+hoTen+"--"+tuoi);
    }
}
