package Tutorial;

public class HinhTron extends hinh{
    private double radius;

    public HinhTron(ToaDo td, double radius) {
        super(td);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*this.radius*this.radius;
    }
}
