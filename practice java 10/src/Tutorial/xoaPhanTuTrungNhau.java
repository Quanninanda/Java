package Tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// xóa phần tử trùng nhau trong list nhập từ bàn phím
public class xoaPhanTuTrungNhau {
    public static void main(String[] args) {
      List<Integer> numberList = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);
        System.out.println("Nhạp ố phần tử: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            numberList.add(scanner.nextInt());
        }
        for(int i = 0; i < numberList.size(); i++){
            System.out.println(numberList.get(i) + "");
        }
        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i<numberList.size(); i++){

        }
    }
}
