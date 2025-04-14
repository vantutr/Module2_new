import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của tam giác");
        System.out.println("Cạnh thứ 1: ");
        double x = sc.nextDouble();
        System.out.println("Cạnh thứ 2: ");
        double y = sc.nextDouble();
        System.out.println("Cạnh thứ 3: ");
        double z = sc.nextDouble();
        System.out.println("Nhập màu sắc: ");
        String color = sc.next();

        Triangle triangle = new Triangle();
        triangle = new Triangle(x, y, z);
        triangle.setColor(color);
        System.out.println("Màu sắc: " + triangle);
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Diện tích: " + triangle.getArea());

    }
}