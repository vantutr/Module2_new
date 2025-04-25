import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhập 3 cạnh của tam giác:");
            System.out.print("Cạnh 1: ");
            float a = sc.nextFloat();

            System.out.print("Cạnh 2: ");
            float b = sc.nextFloat();

            System.out.print("Cạnh 3: ");
            float c = sc.nextFloat();

            Triangle.validate(a, b, c);
            System.out.printf("%.2f %.2f %.2f là 3 cạnh hợp lệ của tam giác\n", a, b, c);

        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi nhập dữ liệu: Vui lòng nhập số hợp lệ!");
        }
    }
}
