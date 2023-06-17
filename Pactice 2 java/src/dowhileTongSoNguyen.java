import java.util.Scanner;
public class dowhileTongSoNguyen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so:");
        int number = input.nextInt();
        if(number < 2){
            System.out.println("Ko nguyên tố");
        }
        else{
            int i;
            boolean check = true;
           for(i = 2; i < number; i++){
               if(number % i == 0){
                   check = false;
                   break;
               }
            }
            if(check)
                System.out.println("So nguyen to");
            else
                System.out.println("Ko nguyen to");

        }

    }
}
