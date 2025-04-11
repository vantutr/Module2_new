public class Car {
    private String color;
    private int speed;
    private String name;
    public static int counter;
    public Car(String color, int speed, String name) {
        this.color = color;
        this.speed = speed;
        this.name = name;
        counter++;
    }
}
