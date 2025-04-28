package model;

import java.util.Comparator;

public class TotalPriceComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return Double.compare(o1.calculateTotalPrice(), o2.calculateTotalPrice());
    }
}
