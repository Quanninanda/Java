public class NhanVien {
    public double getThuNhap() {
        return 0;
    }
}

public class TruongPhong extends NhanVien {
    public double getThuNhap() {
        return 0;
    }
}
    NhanVien nv1 = new NhanVien();
    NhanVien nv2 = new TruongPhong();
    TruongPhong nv3 = new TruongPhong();