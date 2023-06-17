

public class output {
    public static void main(String[] args) {

        ConNguoi cn = new ConNguoi("Quanny", 2023);
        cn.an();
        cn.uong();
        cn.ngu();
        System.out.println("Kiểm tra:");

        HocSinh2 hs = new HocSinh2("Lynx", 2022, "Lop 1", "Truong 1");
        hs.an();
        hs.uong();
        hs.ngu();
        hs.lamBaiTap();

    }
}
