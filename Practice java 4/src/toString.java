 class Circle {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Radius is " + this.radius;
    }
}

public class toString {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.toString());
    }
}

