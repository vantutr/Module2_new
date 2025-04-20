public class Motorbike extends Vehicle {
    public static final int ENGINE_POWER_AT_LEVEL = 100;
    public static final double LOW_TAX = 500.0;
    public static final double HIGH_TAX = 1000.0;
    public int enginePower;

    public Motorbike() {
    }

    public Motorbike(int enginePower) {
        this.enginePower = enginePower;
    }

    public Motorbike(String id, String brand, int year, int enginePower) {
        super(id, brand, year);
        this.enginePower = enginePower;
    }

    @Override
    public void displayInfo() {
        System.out.println(super.toString() + "\t|" + "\tPower: " + enginePower + "\t|" + "\tTax: " + calculateTax());
    }

    @Override
    public double calculateTax() {
        if (enginePower < ENGINE_POWER_AT_LEVEL) {
            return LOW_TAX;
        } else {
            return HIGH_TAX;
        }
    }

}
