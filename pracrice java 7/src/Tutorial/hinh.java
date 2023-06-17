package Tutorial;

public abstract class hinh {// 1 class ko muốn hiện thực hóa cụ thể
    protected ToaDo td;

    public hinh(ToaDo td) {
        this.td = td;
    }
    public ToaDo getTd() {
        return td;
    }
    public void setTd(ToaDo td) {
        this.td = td;
    }
    public abstract double tinhDienTich();
    // lớp trừu tượng có thể tạo ra phương thức truừu tượng
    // phương thức trừu tượng ko có hình thức cụ thể, nó chỉ có tên phương thức sau đó chấm phẩy
    // viết abstract vì nó là hình ảnh, ko biết tính diện tích nó là gì mà mình tính


}
