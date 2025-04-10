public class Fan {
    int SLOW, MEDIUM, FAST;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        SLOW = 1; MEDIUM = 2; FAST = 3;
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }
    public int getSLOW() {
        return SLOW;
    }
    public int getMEDIUM() {
        return MEDIUM;
    }
    public int getFAST() {
        return FAST;
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
    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }
    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }
    public void setFAST(int FAST) {
        this.FAST = FAST;
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
    public void getOn() {
        on = true;
    }
    public void getOff() {
        on = false;
    }
//    public String toString() {
//
//    }

}
