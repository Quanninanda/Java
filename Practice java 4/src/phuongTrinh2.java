 class bac2 {
     // B1 : khai biến
     private double a;
     private double b;
     private double c;

     // B2: khai báo thuộc tính
     public bac2(double a, double b, double c) {
         this.a = a;
         this.b = b;
         this.c = c;
     }

     // b3: Định nghĩa set, get
     public double getA() {
         return a;
     }

     public void setA(double a) {
         this.a = a;
     }

     public double getB() {
         return b;
     }

     public void setB(double b) {
         this.b = b;
     }

     public double getC() {
         return c;
     }

     public void setC(double c) {
         this.c = c;
     }

     // b4: định nghĩa công thức
     public double findDelta() {
         return b * b - 4 * a * c;
     }

     // b5: lập nghiệm
     public double root1() {
         double delta = findDelta();
         if (delta < 0) {
             return Double.NaN;
         } else {
             return (-b + Math.sqrt(delta)) / (2 * a);
         }
     }

     public double root2() {
         double delta = findDelta();
         if (delta < 0) {
             return Double.NaN;
         } else {
             return (-b - Math.sqrt(delta)) / (2 * a);
         }
     }
 }
   // b6: tạo main
     public class phuongTrinh2{
       public static void main(String[] args) {
           bac2 equation = new bac2(1,-3,2);
           System.out.println("x1 = " + equation.root1());
           System.out.println("x2 = " + equation.root2());
       }
   }



