public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private static String storeName = "Kho Tổng ABC";
    private static int totalProduct = 0;
    private static double totalInventoryValue = 0.0;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProduct++;
        totalInventoryValue += getInventoryValue();
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getTotalProduct() {
        return totalProduct;
    }

    public static double getTotalInventoryValue() {
        return totalInventoryValue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getInventoryValue() {
        return price * quantity;
    }

    public static double getAveragePrice() {
        return totalInventoryValue / totalProduct;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static void setStoreName(String StoreName) {
        storeName = StoreName;
    }

    @Override
    public String toString() {
        return String.format("Tên id: %d Tên sản phẩm: %s  Giá: %f  SL: %d  Kho: %s", id, name, price, quantity, storeName);
    }
}
