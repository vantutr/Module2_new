package storage;

import model.ClothingOrder;
import model.ElectronicsOrder;
import model.Order;

import java.io.*;
import java.util.ArrayList;

public class OrderStorage {
    public static ArrayList<Order> orders = new ArrayList<Order>();

    public static void writeFileOrders(ArrayList<Order> orders) {
        OrderStorage.orders = orders;

        File file = new File("orders.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(orders);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Order> readFileOrders() {
        File file = new File("orders.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            orders = (ArrayList<Order>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return orders;
    }

}
