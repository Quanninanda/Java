import java.util.Scanner;
public class daoNguocSo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("ko dc vượt 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập số" + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", ""); //  in phần mô tả "Elements in array:" với một khoảng trắng chiều rộng tối thiểu là 20 ký tự
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");// tạo ra một khoảng trắng thay thế các phần tủ
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");// \n là dấu xuống dòng
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
