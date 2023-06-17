
public class xoaPhanTu {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6};
        int x = 7;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];

            }
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }

        }
    }
}
