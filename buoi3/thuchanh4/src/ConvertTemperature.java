import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        do {
            System.out.println("----------Menu----------");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Nhập lựa chọn của bạn: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Nhập độ C để đổi qua độ F: ");
                    double c = sc.nextDouble();
                    System.out.println(c + " độC = " + celsiusToFahrenheit(c) + " độF");
                    break;
                case 2:
                    System.out.print("Nhập độ F để đổi qua độ C: ");
                    double f = sc.nextDouble();
                    System.out.println(f + " độF = " + fahrenheitToCelsius(f) + " độC");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");

            }
        } while (select != 0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
