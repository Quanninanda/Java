package CanBo;

public class Worker extends Cabre {
    private int rank;

    public Worker(String name, int age, String gender, String address, int rank) {
        super(name, age, gender, address);
        if (rank >= 1 && rank <= 10) {
            this.rank = rank;
        } else {
            throw new IllegalArgumentException("Rank must be between 1 and 10.");
        }

    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank >= 1 && rank <= 10) {
            this.rank = rank;
        } else {
            throw new IllegalArgumentException("Rank must be between 1 and 10.");
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                " name= " + name + '\'' +
                ", age= " + age +
                ", gender= " + gender + '\'' +
                ", address= " + address + '\'' +
                ", rank= " + rank +
                '}';
    }
}

