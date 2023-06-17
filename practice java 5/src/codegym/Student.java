package codegym;

//B1: xây dựng lớp Student
public class Student {
    private int rollno;
    public String name;
    private static String college = "BBDIT";

    //B2: tạo constructor để gán biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //B3: dùng static để thay đổi giá trị của biến
    static void change() {
        college = "CODEGYM";
    }

    //B4: output
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
