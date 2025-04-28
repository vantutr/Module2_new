package controller;

import model.CustomerNameComparator;
import model.Order;
import model.TotalPriceComparator;
import storage.OrderStorage;

import java.util.*;

public class OrderManager {

    public ArrayList<Order> orders = OrderStorage.readFileOrders();
    LinkedList<String> history = new LinkedList<>();

    public void addOrder(Order o) {
        orders.add(o);
        OrderStorage.writeFileOrders(orders);
        history.add("- Đã đặt đơn hàng có id: " + o.getOrderId());
    }

    public boolean checkIdExistence(String id) {
        for (Order o : orders) {
            if (o.getOrderId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void removeOrder(String orderId) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderId().equalsIgnoreCase(orderId)) {
                iterator.remove();
                OrderStorage.writeFileOrders(orders);
                history.add("- Đã xóa đơn hàng có id: " + orderId);
                break;
            }
        }
    }

    public void displayAllOrders() {
        for (Order o : orders) {
            o.displayInfo();
        }
        history.add("- Hiển thị tất cả đơn hàng trong danh sách");
    }

    public void displayRevenueReport() {
        for (Order o : orders) {
            System.out.println("ID đơn hàng: " + o.getOrderId() + "\t|" + "\t Tổng tiền: " + o.calculateTotalPrice());
        }
        history.add("- Tất cả tổng tiền đơn hàng.");
    }

    public void sortByOrderDate() {
        Collections.sort(orders);
        OrderStorage.writeFileOrders(orders);
        history.add("- Sắp xếp theo ngày đặt hàng");
    }

    public void sortByCustomerName() {
        orders.sort(new CustomerNameComparator());
        OrderStorage.writeFileOrders(orders);
        history.add("- Sắp xếp theo tên khách hàng (theo alphabet)");
    }

    public void sortByTotalPrice() {
        orders.sort(new TotalPriceComparator());
        OrderStorage.writeFileOrders(orders);
        history.add("- Sắp xếp theo tổng tiền đơn hàng.");
    }

    public void printHistory() {
        System.out.println("History:");
        for (String h : history) {
            System.out.println(h);
        }
    }
}