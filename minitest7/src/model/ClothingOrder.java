package model;

public class ClothingOrder extends Order {
    private double basePrice;
    private String size;

    public ClothingOrder() {
    }

    public ClothingOrder(double basePrice, String size) {
        this.basePrice = basePrice;
        this.size = size;
    }

    public ClothingOrder(String orderId, String customerName, int orderDate, double basePrice, String size) {
        super(orderId, customerName, orderDate);
        this.basePrice = basePrice;
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println(super.toString() + "\t|" + "\tGiá: " + basePrice + "\t|" + "\tSize: " + size + "\t|" + "\tTổng tiền: " + calculateTotalPrice());
    }

    @Override
    public double calculateTotalPrice() {
        if (size.equalsIgnoreCase("L") || size.equalsIgnoreCase("XL")) {
            return basePrice + basePrice * 0.1;
        } else {
            return basePrice;
        }
    }
}
