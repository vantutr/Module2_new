public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public int checkDelta() {
        double delta = getDiscriminant();
        if (delta < 0) return -1;
        else if (delta == 0) return 0;
        else return 1;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public void solve() {
        double delta = getDiscriminant();
        System.out.println("Delta của phương trình là: " + delta);

        int check = checkDelta();
        if (check < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (check == 0) {
            double result = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + result);
        } else {
            System.out.println("Nghiệm x1 = " + getRoot1());
            System.out.println("Nghiệm x2 = " + getRoot2());
        }
    }
}
