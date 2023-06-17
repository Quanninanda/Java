

public class HocSinh {
    private String Ten;
    private int NamSinh;
    private String tenLop;
    private String tenTruong;

    public HocSinh(String ten, int namSinh, String tenLop, String tenTruong) {
        Ten = ten;
        NamSinh = namSinh;
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
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
    public void an(){
        System.out.println("măm");
    }
    public void uong() {
        System.out.println("ực");
    }
    public void ngu() {
        System.out.println("khò");
    }
    public void lamBaiTap() {
        System.out.println("làm làm");
    }
}
