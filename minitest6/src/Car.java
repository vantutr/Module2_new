public class Car extends Vehicle {
    public static final int TAX_COEFFICIENT = 300;
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String id, String brand, int year, int numberOfSeats) {
        super(id, brand, year);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
            System.out.println(super.toString() + "\t|" + "\tSeats: " + numberOfSeats + "\t|" + "\tTax: " + calculateTax());
    }

    @Override
    public double calculateTax() {
        return numberOfSeats * TAX_COEFFICIENT;
    }
}
