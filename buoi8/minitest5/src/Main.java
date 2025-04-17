import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DirectionMaterial manager = new DirectionMaterial();

        manager.addMaterial(new CrispyFlour("MS100", "Bột xù", LocalDate.now().minusMonths(3), 10000, 30));
        manager.addMaterial(new CrispyFlour("MS101", "Bột ngô", LocalDate.now().minusMonths(8), 9000, 20));
        manager.addMaterial(new CrispyFlour("MS102", "Bột năng", LocalDate.now().minusMonths(10), 8000, 40));
        manager.addMaterial(new CrispyFlour("MS103", "Bột mì", LocalDate.now().minusMonths(5), 8500, 60));
        manager.addMaterial(new CrispyFlour("MS104", "Bột nếp", LocalDate.now().minusMonths(1), 11000, 80));

        manager.addMaterial(new Meat("MS105", "Thịt heo", LocalDate.now().minusDays(2), 120000, 1.0));
        manager.addMaterial(new Meat("MS106", "Thịt bò", LocalDate.now().minusDays(6), 150000, 1.2));
        manager.addMaterial(new Meat("MS107", "Thịt gà", LocalDate.now().minusDays(1), 100000, 1.5));
        manager.addMaterial(new Meat("MS108", "Thịt vịt", LocalDate.now().minusDays(3), 90000, 2.0));
        manager.addMaterial(new Meat("MS109", "Thịt dê", LocalDate.now().minusDays(4), 95000, 1.3));

        Scanner sc = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("========================Menu========================");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tính số chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int choice1 = -1;
                    while (choice1 != 1 && choice1 != 2) {
                        System.out.println("\n1. Thêm CrispyFlour");
                        System.out.println("2. Thêm Meat");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                manager.addMaterial(inputCrispyFlour(sc));
                                System.out.println("Đã thêm CrispyFlour!");
                                manager.displayAll();
                                break;
                            case 2:
                                manager.addMaterial(inputMeat(sc));
                                System.out.println("Đã thêm Meat!");
                                manager.displayAll();
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ");
                        }
                    }
                    break;
                case 2:
                    int choice2 = -1;
                    while (choice2 != 1 && choice2 != 2) {
                        System.out.println("\n1. Sửa CrispyFlour");
                        System.out.println("2. Sửa Meat");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        choice2 = sc.nextInt();
                        sc.nextLine();  // Để tránh lỗi khi đọc dòng nhập tiếp theo

                        switch (choice2) {
                            case 1:
                                System.out.print("Nhập ID CrispyFlour cần sửa: ");
                                String idCrispyFlour = sc.nextLine();
                                if (!manager.checkIdExistence(idCrispyFlour)) {
                                    System.out.println("Không tìm thấy CrispyFlour với ID: " + idCrispyFlour);
                                } else {
                                    manager.updateMaterial(idCrispyFlour, inputCrispyFlour(sc));
                                    System.out.println("Đã sửa CrispyFlour!");
                                    manager.displayAll();
                                }
                                break;

                            case 2:
                                System.out.print("Nhập ID Meat cần sửa: ");
                                String idMeat = sc.nextLine();
                                if (!manager.checkIdExistence(idMeat)) {
                                    System.out.println("Không tìm thấy Meat với ID: " + idMeat);
                                } else {
                                    manager.updateMaterial(idMeat, inputMeat(sc));
                                    System.out.println("Đã sửa Meat!");
                                    manager.displayAll();
                                }
                                break;

                            default:
                                System.out.println("Lựa chọn không hợp lệ");
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Nhập ID để xóa sản phẩm: ");
                    String id = sc.nextLine();
                    manager.deleteMaterial(id);
                    manager.displayAll();
                    break;
                case 4:
                    manager.calculateDiscountDifference();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");

            }
        }


    }

    private static CrispyFlour inputCrispyFlour(Scanner sc) {
        sc.nextLine();
        System.out.print("Id: ");
        String id = sc.nextLine();

        System.out.print("Tên: ");
        String name = sc.nextLine();

        System.out.print("Số tháng trừ đi hiện tại: ");
        int month = sc.nextInt();

        System.out.print("Giá: ");
        int cost = sc.nextInt();

        System.out.print("Số lượng: ");
        int quantity = sc.nextInt();

        return new CrispyFlour(id, name, LocalDate.now().minusMonths(month), cost, quantity);
    }

    private static Meat inputMeat(Scanner sc) {
        sc.nextLine();
        System.out.print("Id: ");
        String id = sc.nextLine();

        System.out.print("Tên: ");
        String name = sc.nextLine();

        System.out.print("Số ngày trừ đi hiện tại: ");
        int day = sc.nextInt();

        System.out.print("Giá: ");
        int cost = sc.nextInt();

        System.out.print("Trọng lượng: ");
        double quantity = sc.nextDouble();

        return new Meat(id, name, LocalDate.now().minusDays(day), cost, quantity);
    }


}