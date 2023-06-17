package CanBo;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CabreManagement cabremanage = new CabreManagement();
        int choice = 0;
        do {
            menu();
            System.out.println("MENU___");
            System.out.println(
                            "1. Add cabres\n" +
                            "2. Search cabres\n" +
                            "3. Show cabres\n" +
                            "4. Exit"
            );
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
               System.out.println("Nhập tên cán bộ: ");
               String name = scanner.nextLine();
               System.out.println("Nhập tuổi: ");
               int age = Integer.parseInt(scanner.nextLine());
              System.out.println("Nhập giới tính:");
              String gender = scanner.nextLine();
               System.out.println("Nhập địa chỉ:");
               String address = scanner.nextLine();
               Cabre cabre = new Cabre(name, age, gender, address);
               cabremanage.addCabre(cabre);
            }else if(choice == 2){
                System.out.println("Nhập họ và tên:");
                String name = scanner.nextLine();
                System.out.println("Nhập tìm kiếm:");
                cabremanage.findCabre(name);
            }else if(choice == 3){
                cabremanage.showCabre();
            }
        } while (choice != 0);
    }

    public static void menu() {
        CabreManagement cabremanage = new CabreManagement();
        while (true) {
            System.out.println("1. Nhập công nhân");
            System.out.println("2. Nhập kỹ sư");
            System.out.println("3. Nhập nhân viên");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên công nhân:");
                    String workerName = scanner.nextLine();
                    System.out.println("Nhập tuổi công nhân:");
                    int workerAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giới tính:");
                    String workerGender = scanner.nextLine();
                    System.out.println("Nhập địa chỉ:");
                    String workerAddress = scanner.nextLine();
                    System.out.println("Nhập cấp bâc:");
                    int workerRank = Integer.parseInt(scanner.nextLine());
                    Worker worker = new Worker(workerName, workerAge, workerGender, workerAddress, workerRank);
                    cabremanage.addCabre(worker);
                    break;
                case 2:
                    System.out.println("Nhập tên kỹ sư:");
                    String engineerName = scanner.nextLine();
                    System.out.println("Nhập tuổi kỹ sư:");
                    int engineerAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giới tính");
                    String engineerGender = scanner.nextLine();
                    System.out.println("Nhap địa chỉ:");
                    String engineerAddress = scanner.nextLine();
                    System.out.println("Nhập chuyên ngành:");
                    String engineerSpeciality = scanner.nextLine();
                    Engineer engineer = new Engineer(engineerName, engineerAge, engineerGender, engineerAddress, engineerSpeciality);
                    cabremanage.addCabre(engineer);
                    break;
                case 3:
                    System.out.println("Nhập tên nhân viên:");
                    String employeeName = scanner.nextLine();
                    System.out.println("Nhập tuổi nhân vien:");
                    int employeeAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giới tính");
                    String employeeGender = scanner.nextLine();
                    System.out.println("Nhap địa chỉ:");
                    String employeeAddress = scanner.nextLine();
                    System.out.println("Nhập công việc:");
                    String employeeWork = scanner.nextLine();
                    Employee employee = new Employee(employeeName, employeeAge, employeeGender, employeeAddress, employeeWork);
                    cabremanage.addCabre(employee);
                    break;
                case 4:
                    return;
            }

        }
    }


}


