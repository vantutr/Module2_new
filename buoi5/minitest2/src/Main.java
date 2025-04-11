import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product.setStoreName("Kho miền Nam");
        Product[] product = new Product[5];
        product[0] = new Product(111, "Điện thoại", 12000000, 80);
        product[1] = new Product(222, "Laptop", 15000000, 70);
        product[2] = new Product(333, "TV", 6000000, 60);
        product[3] = new Product(444, "Đồng Hồ", 1000000, 50);
        product[4] = new Product(555, "PC", 20000000, 40);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên cần tìm: ");
        String name = sc.nextLine();

        checkName(product, name);
        priceList(product);

        int max = maxQuantity(product);
        for (int i = 0; i < product.length; i++) {
            if (product[i].getQuantity() == max) {
                System.out.println("Sản phẩm có số lượng lớn nhất: " + product[i].getName());
                break;
            }
        }

        System.out.println("Tổng số sản phẩm là: " + Product.getTotalProduct());
        System.out.println("Tổng giá trị tồn kho là: " + Product.getTotalInventoryValue());
        System.out.println("Giá trị trung bình: " + Product.getAveragePrice());
    }

    private static void checkName(Product[] product, String name) {
        boolean checkName = false;
        for (Product p : product) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Tìm thấy sản phẩm: ");
                System.out.println(p);
                checkName = true;
                break;
            }
        }
        if (!checkName) {
            System.out.println("Không tìm thấy sản phẩm nào có tên: " + name);
        }
    }

    public static void priceList(Product[] product) {
        System.out.println("Danh sách các sản phẩm có giá trên 1.000.000 là:");
        for (int i = 0; i < product.length; i++) {
            if (product[i].getPrice() > 1000000) {
                System.out.println(product[i]);
            }
        }
    }

    public static int maxQuantity(Product[] product) {
        int max = product[0].getQuantity();
        for (int i = 1; i < product.length; i++) {
            if (product[i].getQuantity() > max) {
                max = product[i].getQuantity();
            }
        }
        return max;
    }
}
