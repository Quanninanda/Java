package E1Circle;

public class E1hinhTron {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        Circle circle3 = new Circle(3);
        System.out.println("Số lg các đối tượng là:" + Circle.getId());
        System.out.println("Chu vi đối tượng 1 là:" + circle1.calculatePerimeter());
    }
}
class Circle{
    private double radius;
    private static int id;
    private static double PI = 3.14;
    private static int nextId = 1;

    public Circle(double radius){
        this.id = nextId++;
        this.radius = radius;
    }
    public static int getId(){
        return id;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return PI*radius*radius;
    }
    public double calculatePerimeter(){
        return PI*2*radius;
    }
}

