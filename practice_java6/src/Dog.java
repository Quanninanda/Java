public class Dog extends Animal{

    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Ngoạm xương");
    }

    @Override
    public void makeSound() {
        System.out.println("Gâu");
    }
}
