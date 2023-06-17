public class Têst {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("Test dog: ");
        d.eat();
        d.makeSound();
        d.sleep();

        Cat c = new Cat();
        System.out.println("Test cat: ");
        c.eat();
        c.makeSound();
        c.sleep();


        Bird b = new Bird();
        System.out.println("Test bird: ");
        b.eat();
        b.makeSound();
        b.sleep();

    }
}
