package Tutorial;
import java.util.ArrayList;
public class learnArrayList {
    public static void main(String[] args) {
      //  Animal[] arr = new Animal[5]; // mảng có 5 phần tử
        // khi xóa thêm các phần tử mới vào thì ko thể dùng mảng
        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(new Animal());
//        animals.add(new Animal()); // thêm phần tử vào cuối ArrayList

        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());

        Animal b = animals.get(0);
       // animals.remove(2);
      //  animals.clear();
        animals.set(1, new Animal());// thay đổi 1 phần tử tại vị trí 1 bằng 1 animal mới
        Animal[] arr = new Animal[5];
        animals.toArray(arr);
        System.out.println("size of arrayList = " + animals.size());
        System.out.println("size of array: " + arr.length);

    }


}
