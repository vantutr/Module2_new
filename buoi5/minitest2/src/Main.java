import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] product = new Product[5];
        product[0] = new Product(111, "Điện thoại", 12000000, 80);
        product[1] = new Product(222, "Laptop", 15000000, 70);
        product[2] = new Product(333, "TV", 6000000, 60);
        product[3] = new Product(444, "Đồng Hồ", 1000000, 50);
        product[4] = new Product(555, "PC", 20000000, 40);
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("========================Menu========================");
            System.out.println("1. Hiển thị toàn bộ danh sách sản phẩm trong mảng");
            System.out.println("2. Tìm kiếm sản phẩm theo tên chính xác");
            System.out.println("3. In danh sách các sản phẩm có giá > 1.000.000 đồng");
            System.out.println("4. Tìm sản phẩm có số lượng tồn kho lớn nhất và in ra thông tin");
            System.out.println("5. In tổng số sản phẩm, tổng giá trị tồn kho và giá trung bình");
            System.out.println("6. Thay đổi tên kho thành \"Kho miền Nam\" và in lại tên kho mới");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sản phẩm:");
                    for (Product p : product) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Nhập tên cần tìm: ");
                    String name = sc.nextLine();
                    checkName(product, name);
                    break;
                case 3:
                    priceList(product);
                    break;
                case 4:
                    int max = maxQuantity(product);
                    for (int i = 0; i < product.length; i++) {
                        if (product[i].getQuantity() == max) {
                            System.out.println("Sản phẩm có số lượng tồn kho lớn nhất: " + product[i].getName());
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Tổng số sản phẩm là: " + Product.getTotalProduct());
                    System.out.println("Tổng giá trị tồn kho là: " + Product.getTotalInventoryValue());
                    System.out.println("Giá trị trung bình: " + Product.getAveragePrice());
                    break;
                case 6:
                    Product.setStoreName("Kho miền Nam");
                    System.out.println("Tên kho sau khi thay đổi là: " + Product.getStoreName());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
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
