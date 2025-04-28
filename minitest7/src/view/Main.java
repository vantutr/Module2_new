package view;

import controller.OrderManager;
import model.ClothingOrder;
import model.ElectronicsOrder;
import model.Order;
import storage.OrderStorage;

import java.util.Scanner;

public class Main {

    public static final int CHOICE = -1;
    public static final int EXIT = 11;
    public static final int CHOICE_ELECTRONICS = 1;
    public static final int CHOICE_CLOTHINGS = 2;
    private static final String[] VALID_SIZES = {"S", "M", "L", "XL"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OrderManager manager = new OrderManager();

        int choice = CHOICE;
        while (choice != EXIT) {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int choice1 = CHOICE;
                    while (choice1 != CHOICE_ELECTRONICS && choice1 != CHOICE_CLOTHINGS) {
                        System.out.println("\n1. Thêm Electronics");
                        System.out.println("2. Thêm  Clothing");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        choice1 = sc.nextInt();

                        String id = getValidId(sc, manager, true);
                        if (id == null) {
                            break;
                        }

                        switch (choice1) {
                            case 1:
                                Order electronics = inputOrder(sc, id, CHOICE_ELECTRONICS);
                                manager.addOrder(electronics);
                                System.out.println("Đã thêm Electronics!");
                                break;

                            case 2:
                                Order clothing = inputOrder(sc, id, CHOICE_CLOTHINGS);
                                manager.addOrder(clothing);
                                System.out.println("Đã thêm Clothing!");
                                break;

                            default:
                                System.out.println("Lựa chọn không hợp lệ!");
                        }
                    }
                    break;

                case 2:
                    String id = getValidId(sc, manager, false);
                    if (id == null) {
                        break;
                    }
                    if (getValidConfirmation(sc)) {
                        manager.removeOrder(id);
                        System.out.println("Đã xóa đơn hàng có id: " + id);
                    } else {
                        System.out.println("Đã hủy yêu cầu xóa!");
                    }
                    break;

                case 3:
                    manager.displayAllOrders();
                    break;

                case 4:
                    manager.displayRevenueReport();
                    break;

                case 5:
                    manager.sortByOrderDate();
                    manager.displayAllOrders();
                    break;

                case 6:
                    manager.sortByCustomerName();
                    manager.displayAllOrders();
                    break;

                case 7:
                    manager.sortByTotalPrice();
                    manager.displayAllOrders();
                    break;

                case 8:
                    manager.printHistory();
                    break;

                case 9:
                    OrderStorage.writeFileOrders(manager.orders);
                    System.out.println("Đã ghi danh sách đơn hàng ra file thành công!");
                    break;

                case 10:
                    manager.orders = OrderStorage.readFileOrders();
                    System.out.println("Đã đọc danh sách đơn hàng từ file thành công!");
                    break;

                case 11:
                    System.out.println("Đã thoát");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Chọn lại!");
            }
        }

    }

    private static void displayMenu() {
        System.out.println("\n========================Menu========================");
        System.out.println("1. Thêm đơn hàng mới (Điện tử / Quần áo)");
        System.out.println("2. Xoá đơn hàng theo id");
        System.out.println("3. Hiển thị tất cả đơn hàng");
        System.out.println("4. Hiển thị báo cáo doanh thu");
        System.out.println("5. Sắp xếp theo ngày đặt hàng");
        System.out.println("6. Sắp xếp theo tên khách hàng");
        System.out.println("7. Sắp xếp theo tổng tiền đơn hàng");
        System.out.println("8. Xem lịch sử thao tác");
        System.out.println("9. Ghi danh sách đơn hàng ra file nhị phân");
        System.out.println("10. Đọc danh sách đơn hàng từ file nhị phân");
        System.out.println("11. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    public static Order inputOrder(Scanner sc, String id, int choice) {
        String name = getNonEmptyInput(sc, "Nhập tên khách hàng: ");

        int orderDate = getValidOrderDateInput(sc, "Nhập ngày đặt hàng (yyyyMMdd): ");

        if (choice == CHOICE_ELECTRONICS) {
            double itemPrice = getValidNumberInput(sc, "Nhập giá: ");

            int warrantyMonths = getValidNumberInput(sc, "Nhập tháng bảo hành: ");

            return new ElectronicsOrder(id, name, orderDate, itemPrice, warrantyMonths);
        } else if (choice == CHOICE_CLOTHINGS) {
            double basePrice = getValidNumberInput(sc, "Nhập giá: ");

            String size;
            while (true) {
                size = getNonEmptyInput(sc, "Nhập size (S/M/L/XL): ").toUpperCase();
                for (String validSize : VALID_SIZES) {
                    if (size.equalsIgnoreCase(validSize)) {
                        return new ClothingOrder(id, name, orderDate, basePrice, size);
                    }
                }
                System.out.println("Size không hợp lệ. Size chỉ chứa S, M, L và XL");
            }
        }
        return null;
    }


    public static String getNonEmptyInput(Scanner sc, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Giá trị không được để trống. Vui lòng nhập lại!");
            }
        } while (input.isEmpty());
        return input;
    }

    public static int getValidOrderDateInput(Scanner sc, String prompt) {
        int date;
        while (true) {
            String input = getNonEmptyInput(sc, prompt);
            try {
                date = Integer.parseInt(input);

                if (input.length() != 8) {
                    System.out.println("Ngày đặt hàng phải gồm 8 chữ số (yyyyMMdd). Vui lòng nhập lại!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ngày đặt hàng phải là số. Vui lòng nhập lại!");
            }
        }
        return date;
    }

    public static int getValidNumberInput(Scanner sc, String prompt) {
        int number;
        while (true) {
            String input = getNonEmptyInput(sc, prompt);
            try {
                number = Integer.parseInt(input);
                if (number < 0) {
                    System.out.println("Số phải lớn hơn hoặc bằng 0. Vui lòng nhập lại!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá trị phải là số. Vui lòng nhập lại!");
            }
        }
        return number;
    }

    private static String getValidId(Scanner sc, OrderManager manager, boolean shouldNotExist) {
        sc.nextLine();
        String id = getNonEmptyInput(sc, "Nhập ID đơn hàng: ");

        boolean exists = manager.checkIdExistence(id);

        if (shouldNotExist && exists) {
            System.out.println("ID đã tồn tại. Không thể thêm đơn hàng!");
            return null;
        }

        if (!shouldNotExist && !exists) {
            System.out.println("ID không tồn tại. Không thể xóa đơn hàng!");
            return null;
        }

        return id;
    }

    private static boolean getValidConfirmation(Scanner sc) {
        while (true) {
            String input = getNonEmptyInput(sc, "Bạn có thật sự muốn xóa không? (y/n): ").toLowerCase();
            if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                return false;
            } else {
                System.out.println("Phím bấm không hợp lệ! Nhập y(yes) hoặc n(no)");
            }
        }
    }
}