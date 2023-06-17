package QuanlySV;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();// tự tạo 1 constructor rỗng để tạo danh sachs sinh viên
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
}
