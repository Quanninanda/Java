

public class ConNguoi {
    private String Ten;
    private int namSinh;

    public ConNguoi(String Ten, int namSinh) {
        this.Ten = Ten;
        this.namSinh = namSinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void an(){
        System.out.println("măm");
    }
    public void uong(){
        System.out.println("ực");
    }
    public void ngu(){
        System.out.println("khò");
    }

}
