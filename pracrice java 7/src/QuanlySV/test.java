package QuanlySV;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do{
            System.out.println("MENU___");
            System.out.println(
                    "1.   Thêm.\n"
                   +"2. Xuất.\n"
                   +"0. Thoát.\n"

            );
            luaChon = scanner.nextInt();
            scanner.nextLine();

            if(luaChon == 1){
                System.out.println("Nhập mã sinh viên: ");
                String maSinhVien = scanner.nextLine();
                System.out.println("Nhập họ tên: ");
                String hoVaTen = scanner.nextLine();
                System.out.println("Nhập năm sinh:");
                int namSinh = scanner.nextInt();
                System.out.println("Điểm trung bình");
                float diemTrungBinh = scanner.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);

            }else if(luaChon == 2){

            }
        }while(luaChon!=0);
    }
}
