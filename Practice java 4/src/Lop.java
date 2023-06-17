public class Lop {
    // thuộc tính
    String name;
    int age;
    String address;

    // hàm khởi tạo
   public Lop(String name, int age){
        this.name = name;
        this.age = age;

    }
    public Lop(){

    }
    public Lop(String name, int age, String address){
        this(name, age);
        this.address = address;
    }
    public String getName(){
       return name;
    }
    public void setName(){
       this.name = name;
    }

    // phương thức
    public void study(String subject){
        System.out.println("Nhập môn: " + subject);
    }

    public static void main(String[] args) {
       Lop student1 = new Lop("Quanny", 23, "Hanoi");
        // lớp: kiểu dữ liệu
        // từ khóa 'new' là 1 cóntructor
        // student1: biến tham chiếu
        // new lớp("Quanny", 23, "Hanoi"): đối tượng
        Lop student2 = new Lop();
        Lop student3 = new Lop("Butcher", 31, "HCM");
        System.out.println(student2.name);
        System.out.println(student2.age);
        student2.study("toán"); // phương thức name.Method()

        //       System.out.println(student1.name);
 //       student1.name = "Lynx";
 //       System.out.println(student1.name);
    }
}