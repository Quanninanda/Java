import java.util.Scanner;
public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Fahrenheit;
        double Celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. fahrenheit to celsius");
            System.out.println("2. celcius to fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    Fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(Fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius: ");
                    Celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(Celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
        public static double celsiusToFahrenheit ( double Celsius){
            double Fahrenheit = (9.0 / 5) * Celsius + 32;
            return Fahrenheit;
        }

        public static double fahrenheitToCelsius ( double Fahrenheit){
            double Celsius = (5.0 / 9) * (Fahrenheit - 32);
            return Celsius;
        }
    }





























