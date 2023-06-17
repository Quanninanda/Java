import java.util.Scanner;

public class whileDapAnPhepCong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = input.nextInt();
        System.out.println("Nhập b");
        int b = input.nextInt();
        System.out.println("Nhập sum");
        int sum = input.nextInt();
        while(a + b != sum){
            System.out.print("ket qua sai");
            sum = input.nextInt();
        }
        System.out.println("ket qua dung");
    }

}
