import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class viTriPhanTu {
    public static void main(String[] args) {
        String[] students = {"Quanny1", "Quanny2", "Quanny3", "Quanny4"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Điền tên: ");
        String input_name = sc.nextLine();
        boolean isExist = true;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí" + i);

            }
        }
        if (!isExist) {
            System.out.println("Not found");
        }
    }
}