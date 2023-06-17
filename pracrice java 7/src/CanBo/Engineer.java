package CanBo;

public class Engineer extends Cabre {
    public String speciality;

    public Engineer(String name, int age, String gender, String address, String speciality) {
        super(name, age, gender, address);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                " name= " + name + '\'' +
                ", age= " + age +
                ", gender= " + gender + '\'' +
                ", address= " + address + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
