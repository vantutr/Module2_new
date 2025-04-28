package model;

public class ElectronicsOrder extends Order {
    private double itemPrice;
    private int warrantyMonths;

    public ElectronicsOrder() {
    }

    public ElectronicsOrder(double itemPrice, int warrantyMonths) {
        this.itemPrice = itemPrice;
        this.warrantyMonths = warrantyMonths;
    }

    public ElectronicsOrder(String orderId, String customerName, int orderDate, double itemPrice, int warrantyMonths) {
        super(orderId, customerName, orderDate);
        this.itemPrice = itemPrice;
        this.warrantyMonths = warrantyMonths;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayInfo() {
        System.out.println(super.toString() + "\t|" + "\tGiá: " + itemPrice + "\t|" + "\tTháng bảo hành: " + warrantyMonths + "\t|" + "\tTổng tiền: " + calculateTotalPrice());
    }

    @Override
    public double calculateTotalPrice() {
        return itemPrice + (warrantyMonths * 50);
    }

}
