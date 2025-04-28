package model;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getCustomerName().compareToIgnoreCase(o2.getCustomerName());
    }
}
