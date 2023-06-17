import java.util.Scanner;
public class P2_20soNguyrenTo {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int num = input.nextInt();

        int count = 0;
        int N = 2;

        System.out.println("Các số nguyên tố đầu tiên là:");
        while (count < num) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}
