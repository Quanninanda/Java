package CanBo;

public class Employee extends Cabre {
    private String work;
    public Employee(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name= " + name + '\'' +
                ", age= " + age +
                ", gender= " + gender + '\'' +
                ", address= " + address + '\'' +
                "work='" + work + '\'' +
                '}';
    }
}
