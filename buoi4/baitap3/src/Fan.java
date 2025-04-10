public class Fan {
    //static final static: là hằng số tốc độ
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{speed=" + speed + ", radius=" + radius + ", color='" + color + "', fan is on}";
        } else {
            return "Fan{speed=" + speed + ", radius=" + radius + ", color='" + color + "', fan is off}";
        }
    }

}
