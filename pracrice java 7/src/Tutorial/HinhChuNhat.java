package Tutorial;

public class HinhChuNhat extends hinh{
    private double chieuRong, chieuCao;
    public HinhChuNhat(ToaDo td, double chieuRong, double chieuCao) {
        super(td);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuCao*this.chieuRong;
        // ghi đè phương thức nên các lớp con
    }
}
