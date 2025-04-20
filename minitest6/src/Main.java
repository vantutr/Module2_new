import java.util.Scanner;

public class Main {

    public static final int CHOICE = -1;
    public static final int EXIT = 9;
    public static final int CHOICE_MOTORBIKE = 1;
    public static final int CHOICE_CAR = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VehicleManager manager = new VehicleManager();

        int choice = CHOICE;
        while (choice != EXIT) {
            System.out.println("\n============================Menu============================");
            System.out.println("1. Thêm phương tiện");
            System.out.println("2. Xoá phương tiện theo id");
            System.out.println("3. Hiển thị danh sách phương tiện");
            System.out.println("4. Hiển thị báo cáo thuế");
            System.out.println("5. Sắp xếp theo năm sản xuất");
            System.out.println("6. Sắp xếp theo hãng sản xuất");
            System.out.println("7. Sắp xếp theo thuế tăng dần");
            System.out.println("8. Xem lịch sử thao tác");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int choice1 = CHOICE;
                    while (choice1 != CHOICE_MOTORBIKE && choice1 != CHOICE_CAR) {
                        System.out.println("\n1. Thêm Motorbike");
                        System.out.println("2. Thêm Car");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        choice1 = sc.nextInt();

                        String id = getValidId(sc, manager, true);
                        if (id == null) {
                            break;
                        }

                        switch (choice1) {
                            case 1:
                                Vehicle motorbike = inputVehicle(sc, id, 1);
                                manager.addVehicle(motorbike);
                                System.out.println("Đã thêm Motorbike!");
                                break;

                            case 2:
                                Vehicle car = inputVehicle(sc, id, 2);
                                manager.addVehicle(car);
                                System.out.println("Đã thêm Car!");
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

                    System.out.println("Bạn có thật sự muốn xóa không? (y/n)");
                    String delete = sc.next();
                    if (delete.equalsIgnoreCase("y")) {
                        manager.removeVehicle(id);
                        System.out.println("Đã xóa xe có id: " + id);
                    } else if (delete.equalsIgnoreCase("n")) {
                        System.out.println("Đã hủy yêu cầu xóa!");
                        break;
                    } else {
                        System.out.println("Phím bấm không hợp lệ!");
                    }
                    break;

                case 3:
                    manager.displayAllVehicles();
                    break;

                case 4:
                    manager.displayTaxReport();
                    break;

                case 5:
                    manager.sortByYear();
                    manager.displayAllVehicles();
                    break;

                case 6:
                    manager.sortByBrand();
                    manager.displayAllVehicles();
                    break;

                case 7:
                    manager.sortByTax();
                    manager.displayAllVehicles();
                    break;

                case 8:
                    manager.printHistory();
                    break;

                case 9:
                    System.out.println("Đã thoát");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Chọn lại!");
            }
        }

    }

    public static Vehicle inputVehicle(Scanner sc, String id, int choise) {
        System.out.print("Nhập hãng xe: ");
        String brand = sc.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int year = sc.nextInt();

        if (choise == CHOICE_MOTORBIKE) {
            System.out.print("Nhập công suất động cơ: ");
            int enginePower = sc.nextInt();
            return new Motorbike(id, brand, year, enginePower);
        } else if (choise == CHOICE_CAR) {
            System.out.print("Nhập số chỗ ngồi: ");
            int numberOfSeats = sc.nextInt();
            return new Car(id, brand, year, numberOfSeats);
        }
        return null;
    }


    private static String getValidId(Scanner sc, VehicleManager manager, boolean shouldNotExist) {
        sc.nextLine();
        System.out.print("Nhập ID phương tiện: ");
        String id = sc.nextLine();

        boolean exists = manager.checkIdExistence(id);

        if (shouldNotExist && exists) {
            System.out.println("ID đã tồn tại. Không thể thêm phương tiện!");
            return null;
        }

        if (!shouldNotExist && !exists) {
            System.out.println("ID không tồn tại. Không thể xóa phương tiện!");
            return null;
        }

        return id;
    }


}