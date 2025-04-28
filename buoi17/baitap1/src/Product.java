import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private int price;
    private String Manufacturer;
    private String describe;

    public Product() {
    }

    public Product(String id, String name, int price, String manufacturer, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        Manufacturer = manufacturer;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
