public class max2So {
    public static void main(String[] args) {
    int c = 2;
    int d = 3;
    int k = max(c, d);
        System.out.println(k);
    }
    public static int max(int num1, int num2) {
        int result;
        if (num1 < num2){
            result = num2;
        }else{
            result = num1;
        }
        return result;
    }

}

