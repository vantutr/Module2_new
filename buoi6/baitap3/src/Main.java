
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2.5f, 3.5f);
        System.out.println("Point: " + p1);

        MoveablePoint moveablePoint = new MoveablePoint(2.0f, 3.0f, 0.5f, 1.0f);
        System.out.println("Before move: " + moveablePoint);
        moveablePoint.move();
        System.out.println("After move: " + moveablePoint);
    }
}