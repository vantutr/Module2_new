
public class Circle {
    private double radius;
    private static String color = "red";
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    protected double getArea() {
        return Math.PI * radius * radius;
    }
    void display() {
        System.out.println("Màu: "+ color + " Bán kính: " + radius + " Diện tích: " + getArea());
    }
}
