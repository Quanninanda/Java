import java.util.Scanner;
public class P2doiTienTe {
    public static void main(String[] args) {

        double usd; // double ~ let
        Scanner money = new Scanner(System.in);
        System.out.println("Input usd:");
        usd = money.nextDouble(); // dùng để đọc dữ liệu trong giá trị của usd
        double quydoi = usd*23000;
        System.out.println(quydoi);
    }

}
