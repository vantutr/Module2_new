//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("red");
        System.out.println(circle);
        System.out.println("Diện tích: " + circle.getArea());

        System.out.println();

        Cylinder cylinder = new Cylinder(10.0, "blue", 15.0);
        System.out.println("Thể tích: " + cylinder.getVolume());
        System.out.println(cylinder);

    }
}