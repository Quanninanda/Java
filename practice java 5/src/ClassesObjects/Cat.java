package ClassesObjects;

public class Cat {

    private String name;
    private int age;
    private String color;
    private void move() {
    }
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.name = "Tom";
        tom.age = 6;

        System.out.println("cat's name: " + tom.name);
        tom.move();
        
        Cat meow = new Cat();
        meow.name = "Meow";
        meow.age = 3;
        meow.color = "Black";

        System.out.println("cat's name:" + tom.name);
        tom.move();

        Student Quan = new Student();
        Quan.name = "Quanny";
        Quan.age = 20;

        System.out.println("Name: " +Quan.name);
        System.out.println("Age: " + Quan.age);
        System.out.println("Email " + Quan.email);
    }




}
