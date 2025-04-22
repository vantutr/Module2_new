import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductManager manager = new ProductManager();

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n============================Menu============================");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần");
            System.out.println("7. Sắp xếp sản phẩm giảm dần");
            System.out.println("8. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    String id = inputID(sc);
                    Product product = inputProducts(sc, id);
                    manager.addProduct(product);
                    System.out.println("Đã thêm sản phẩm có id: " + id);
                    break;

                case 2:
                    String idEdit = inputID(sc);
                    if (manager.checkIdExistence(idEdit)) {
                        manager.editProduct(idEdit, inputProducts(sc, idEdit));
                        System.out.println("Đã sửa sản phẩm có id: " + idEdit);
                    } else {
                        System.out.println("Không tìm thấy id: " + idEdit);
                    }
                    break;

                case 3:
                    String idDelete = inputID(sc);
                    if (manager.checkIdExistence(idDelete)) {
                        manager.deleteProduct(idDelete);
                        System.out.println("Đã xóa sản phẩm có id: " + idDelete);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm có id: " + idDelete);
                    }
                    break;

                case 4:
                    manager.displayProducts();
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Nhập tên muốn tìm kiếm: ");
                    String name = sc.nextLine();
                    manager.searchProductByName(name);
                    break;

                case 6:
                    manager.sortByPriceAscending();
                    manager.displayProducts();
                    break;

                case 7:
                    manager.sortByPriceDescending();
                    manager.displayProducts();
                    break;

                case 8:
                    System.out.println("Đã thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    public static Product inputProducts(Scanner sc, String id) {
        System.out.print("Tên sản phẩm: ");
        String name = sc.nextLine();

        System.out.print("Giá: ");
        int price = sc.nextInt();

        return new Product(id, name, price);
    }

    public static String inputID(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhập id: ");
        String id = sc.nextLine();
        return id;
    }
}