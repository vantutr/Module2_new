import java.util.*;

public class VehicleManager {
    private List<Vehicle> vehicles = new ArrayList<>();
    private LinkedList<String> history = new LinkedList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        history.add("- Đã thêm xe có id: " + v.getId());
    }

    public boolean checkIdExistence(String id) {
        for (Vehicle v : vehicles) {
            if (v.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void removeVehicle(String id) {
        Iterator<Vehicle> iterator = vehicles.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Vehicle v = iterator.next();
            if (v.getId().equalsIgnoreCase(id)) {
                iterator.remove();
                history.add("- Đã xóa phương tiện: " + id);
                found = true;
                break;
            }
        }
        if (!found) {
            history.add("- Không tìm thấy xe có phương tiện : " + id);
        }
    }

    public void displayAllVehicles() {
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
        history.add("- Tất cả phơng tiện trong danh sách");
    }

    public void displayTaxReport() {
        for (Vehicle v : vehicles) {
            System.out.println("ID: " + v.getId() + " - Tax: " + v.calculateTax());
        }
        history.add("- Tất cả báo cáo thuế");
    }

    public void sortByYear() {
        Collections.sort(vehicles);
        history.add("- Sắp xếp theo năm sản xuất tăng dần");
    }

    public void sortByBrand() {
//        vehicles.sort(new Comparator<Vehicle>() {
//            @Override
//            public int compare(Vehicle v1, Vehicle v2) {
//                return v1.getBrand().compareToIgnoreCase(v2.getBrand());
//            }
//        });
        vehicles.sort(new BrandComparator());
        history.add("- Sắp xếp theo hãng xe");
    }

    public void sortByTax() {
//        vehicles.sort(new Comparator<Vehicle>() {
//            @Override
//            public int compare(Vehicle v1, Vehicle v2) {
//                return Double.compare(v1.calculateTax(), v2.calculateTax());
//            }
//        });
        vehicles.sort(new TaxComparator());
        history.add("- Sắp xếp theo thuế");
    }

    public void printHistory() {
        System.out.println("History:");
        for (String h : history) {
            System.out.println(h);
        }
    }
}
