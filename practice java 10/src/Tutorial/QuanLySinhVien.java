package Tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameStudent = new ArrayList<>();
        int select = 0;
        while(select != 5){
            System.out.println("1. Add student \n 2. Delete student \n 3. Edit student \n 4. Show list \n 5. Quit");
            System.out.println("Select:");
            select = scanner.nextInt();
            switch(select){
                case 1:
                    System.out.println("Student name:");
                    String name = scanner.nextLine();
                    name = scanner.nextLine();
                    nameStudent.add(name);
                    break;
                case 2:
                    // remove(index)
                    System.out.println("Remove student: ");
//                    String erase = scanner.nextLine();
//                    erase = scanner.nextLine();
                    nameStudent.remove(1);
                    break;
                case 3:
                    // set(index, element e)
                    break;
                case 4:
                    for(String nameSinhVien : nameStudent ){
                        System.out.println(nameSinhVien);
                    }
                    break;

            }
        }

    }
}
