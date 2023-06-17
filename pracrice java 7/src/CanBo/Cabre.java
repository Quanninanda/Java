package CanBo;

public class Cabre {
    public String name;
    public int age;
    public String gender;
    public String address;

    public Cabre(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Cabre() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cabre" +
                " name= " + name + '\'' +
                ", age= " + age +
                ", gender= " + gender + '\'' +
                ", address= " + address + '\'' +
                '.';
    }
}
