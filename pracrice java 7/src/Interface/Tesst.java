package Interface;

public class Tesst {
    public static void main(String[] args) {
        System.out.println("Tesst cau a: ");
        MayTinhCasio casio = new MayTinhCasio();
        MayTinhVinaCal vinacal = new MayTinhVinaCal();

        System.out.println(casio.cong(5, 3));
        System.out.println(casio.nhan(4, 5));
        System.out.println(casio.chia(4, 0));

    }
}
