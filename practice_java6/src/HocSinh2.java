

public class HocSinh2 extends ConNguoi{
private String tenLop, tenTruong;

    public HocSinh2(String ten, int namSinh, String tenLop, String tenTruong) {
        super("Quanny", 2023);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    public void lamBaiTap() {
        System.out.println("làm làm");
    }
}
